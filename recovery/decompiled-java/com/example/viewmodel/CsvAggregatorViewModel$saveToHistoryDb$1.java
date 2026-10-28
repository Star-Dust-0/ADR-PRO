package com.example.viewmodel;

import com.example.BuildConfig;
import com.example.data.db.BatchHistoryEntity;
import com.example.data.model.BatchSummaryStats;
import com.example.data.model.CsvSampleItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CsvAggregatorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$saveToHistoryDb$1", f = "CsvAggregatorViewModel.kt", i = {0, 0}, l = {491}, m = "invokeSuspend", n = {"valuesJson", "entity"}, s = {"L$0", "L$1"})
/* loaded from: /tmp/dex/classes4.dex */
public final class CsvAggregatorViewModel$saveToHistoryDb$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $csvOutput;
    final /* synthetic */ String $folderName;
    final /* synthetic */ List<CsvSampleItem> $items;
    final /* synthetic */ BatchSummaryStats $stats;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CsvAggregatorViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsvAggregatorViewModel$saveToHistoryDb$1(List<CsvSampleItem> list, String str, BatchSummaryStats batchSummaryStats, CsvAggregatorViewModel csvAggregatorViewModel, String str2, Continuation<? super CsvAggregatorViewModel$saveToHistoryDb$1> continuation) {
        super(2, continuation);
        this.$items = list;
        this.$folderName = str;
        this.$stats = batchSummaryStats;
        this.this$0 = csvAggregatorViewModel;
        this.$csvOutput = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CsvAggregatorViewModel$saveToHistoryDb$1(this.$items, this.$folderName, this.$stats, this.this$0, this.$csvOutput, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String valuesJson = CollectionsKt.joinToString$default(this.$items, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.viewmodel.CsvAggregatorViewModel$saveToHistoryDb$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        CharSequence extractedValue;
                        extractedValue = ((CsvSampleItem) obj).getExtractedValue();
                        return extractedValue;
                    }
                }, 30, (Object) null);
                String str = this.$folderName;
                long currentTimeMillis = System.currentTimeMillis();
                int totalFiles = this.$stats.getTotalFiles();
                mutableStateFlow = this.this$0._targetCell;
                BatchHistoryEntity entity = new BatchHistoryEntity(0L, str, currentTimeMillis, totalFiles, (String) mutableStateFlow.getValue(), this.$stats.getAverageValue(), this.$stats.getMaxValue(), this.$stats.getMinValue(), valuesJson, this.$csvOutput, 1, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(valuesJson);
                this.L$1 = SpillingKt.nullOutSpilledVariable(entity);
                this.label = 1;
                if (this.this$0.batchDao.insertBatch(entity, (Continuation) this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case BuildConfig.VERSION_CODE /* 1 */:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
