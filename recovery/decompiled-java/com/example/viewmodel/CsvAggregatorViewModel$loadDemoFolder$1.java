package com.example.viewmodel;

import android.app.Application;
import android.net.Uri;
import com.example.data.util.CsvParserUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
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

/* compiled from: CsvAggregatorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$loadDemoFolder$1", f = "CsvAggregatorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes4.dex */
final class CsvAggregatorViewModel$loadDemoFolder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CsvAggregatorViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsvAggregatorViewModel$loadDemoFolder$1(CsvAggregatorViewModel csvAggregatorViewModel, Continuation<? super CsvAggregatorViewModel$loadDemoFolder$1> continuation) {
        super(2, continuation);
        this.this$0 = csvAggregatorViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CsvAggregatorViewModel$loadDemoFolder$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._isProcessing;
                mutableStateFlow.setValue(Boxing.boxBoolean(true));
                mutableStateFlow2 = this.this$0._progress;
                mutableStateFlow2.setValue(Boxing.boxFloat(0.1f));
                Application context = this.this$0.getApplication();
                mutableStateFlow3 = this.this$0._folderName;
                mutableStateFlow3.setValue("29_07_26");
                Iterable generatedFiles = (List) CsvParserUtil.INSTANCE.createDemoLabFolder(context, "29_07_26").component2();
                CsvAggregatorViewModel csvAggregatorViewModel = this.this$0;
                Iterable<File> iterable = generatedFiles;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (File file : iterable) {
                    arrayList.add(new Pair(file.getName(), Uri.fromFile(file)));
                    context = context;
                }
                final Function2 function2 = new Function2() { // from class: com.example.viewmodel.CsvAggregatorViewModel$loadDemoFolder$1$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2) {
                        int compare;
                        compare = CsvParserUtil.INSTANCE.naturalSortComparator().compare(((Pair) obj).getFirst(), ((Pair) obj2).getFirst());
                        return Integer.valueOf(compare);
                    }
                };
                csvAggregatorViewModel.currentLoadedUris = CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: com.example.viewmodel.CsvAggregatorViewModel$loadDemoFolder$1$$ExternalSyntheticLambda1
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int intValue;
                        intValue = ((Number) function2.invoke(obj, obj2)).intValue();
                        return intValue;
                    }
                });
                this.this$0.processLoadedUris();
                mutableStateFlow4 = this.this$0._toastMessage;
                mutableStateFlow4.setValue("Generated demo folder 29_07_26 with 10 samples");
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
