package com.example.viewmodel;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CsvAggregatorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$deleteHistoryItem$1", f = "CsvAggregatorViewModel.kt", i = {}, l = {572}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes4.dex */
public final class CsvAggregatorViewModel$deleteHistoryItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $id;
    int label;
    final /* synthetic */ CsvAggregatorViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsvAggregatorViewModel$deleteHistoryItem$1(CsvAggregatorViewModel csvAggregatorViewModel, long j, Continuation<? super CsvAggregatorViewModel$deleteHistoryItem$1> continuation) {
        super(2, continuation);
        this.this$0 = csvAggregatorViewModel;
        this.$id = j;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CsvAggregatorViewModel$deleteHistoryItem$1(this.this$0, this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.this$0.batchDao.deleteBatch(this.$id, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
