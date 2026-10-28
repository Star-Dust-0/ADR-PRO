package com.example.viewmodel;

import android.app.Application;
import android.net.Uri;
import com.example.data.model.BatchSummaryStats;
import com.example.data.model.CsvSampleItem;
import com.example.data.model.ExtractionStatus;
import com.example.data.util.CsvParserUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CsvAggregatorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$processLoadedUris$1", f = "CsvAggregatorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes4.dex */
public final class CsvAggregatorViewModel$processLoadedUris$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CsvAggregatorViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsvAggregatorViewModel$processLoadedUris$1(CsvAggregatorViewModel csvAggregatorViewModel, Continuation<? super CsvAggregatorViewModel$processLoadedUris$1> continuation) {
        super(2, continuation);
        this.this$0 = csvAggregatorViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CsvAggregatorViewModel$processLoadedUris$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        List list;
        Iterable iterable;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        MutableStateFlow mutableStateFlow9;
        MutableStateFlow mutableStateFlow10;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._isProcessing;
                mutableStateFlow.setValue(Boxing.boxBoolean(true));
                Application context = this.this$0.getApplication();
                mutableStateFlow2 = this.this$0._targetCell;
                String target = (String) mutableStateFlow2.getValue();
                list = this.this$0.currentLoadedUris;
                int total = list.size();
                List items = new ArrayList();
                iterable = this.this$0.currentLoadedUris;
                CsvAggregatorViewModel csvAggregatorViewModel = this.this$0;
                double maxVal = Double.MIN_VALUE;
                double minVal = Double.MAX_VALUE;
                int validCount = 0;
                int validCount2 = 0;
                double numericSum = 0.0d;
                for (Object obj : iterable) {
                    int i = validCount2 + 1;
                    if (validCount2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Pair pair = (Pair) obj;
                    Application context2 = context;
                    int i2 = validCount2;
                    CsvSampleItem extractCellFromCsvUri = CsvParserUtil.INSTANCE.extractCellFromCsvUri(context2, (Uri) pair.component2(), (String) pair.component1(), target);
                    items.add(extractCellFromCsvUri);
                    if (extractCellFromCsvUri.getStatus() == ExtractionStatus.SUCCESS && extractCellFromCsvUri.getNumericValue() != null) {
                        Double numericValue = extractCellFromCsvUri.getNumericValue();
                        numericSum += numericValue.doubleValue();
                        validCount++;
                        if (numericValue.doubleValue() > maxVal) {
                            maxVal = numericValue.doubleValue();
                        }
                        if (numericValue.doubleValue() < minVal) {
                            minVal = numericValue.doubleValue();
                        }
                    }
                    mutableStateFlow10 = csvAggregatorViewModel._progress;
                    mutableStateFlow10.setValue(Boxing.boxFloat((i2 + 1) / total));
                    validCount2 = i;
                    context = context2;
                }
                double avg = validCount > 0 ? numericSum / validCount : 0.0d;
                double max = validCount > 0 ? maxVal : 0.0d;
                double min = validCount > 0 ? minVal : 0.0d;
                mutableStateFlow3 = this.this$0._extractedItems;
                mutableStateFlow3.setValue(items);
                BatchSummaryStats stats = new BatchSummaryStats(total, validCount, total - validCount, avg, max, min, numericSum);
                mutableStateFlow4 = this.this$0._summaryStats;
                mutableStateFlow4.setValue(stats);
                this.this$0.rebuildCombinedCsv();
                mutableStateFlow5 = this.this$0._isProcessing;
                mutableStateFlow5.setValue(Boxing.boxBoolean(false));
                CsvAggregatorViewModel csvAggregatorViewModel2 = this.this$0;
                mutableStateFlow6 = this.this$0._folderName;
                CharSequence charSequence = (CharSequence) mutableStateFlow6.getValue();
                if (charSequence.length() == 0) {
                    charSequence = "29_07_26";
                }
                mutableStateFlow7 = this.this$0._combinedCsvContent;
                csvAggregatorViewModel2.saveToHistoryDb((String) charSequence, items, stats, (String) mutableStateFlow7.getValue());
                CsvAggregatorViewModel csvAggregatorViewModel3 = this.this$0;
                mutableStateFlow8 = this.this$0._folderName;
                String str = (String) mutableStateFlow8.getValue();
                mutableStateFlow9 = this.this$0._combinedCsvContent;
                csvAggregatorViewModel3.autoSaveToInternalAdrLog(str, (String) mutableStateFlow9.getValue());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
