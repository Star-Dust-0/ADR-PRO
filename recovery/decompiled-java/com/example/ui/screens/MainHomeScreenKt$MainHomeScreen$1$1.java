package com.example.ui.screens;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.State;
import com.example.BuildConfig;
import com.example.viewmodel.CsvAggregatorViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainHomeScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.screens.MainHomeScreenKt$MainHomeScreen$1$1", f = "MainHomeScreen.kt", i = {0, 0}, l = {170}, m = "invokeSuspend", n = {"msg\\1", "$i$a$-let-MainHomeScreenKt$MainHomeScreen$1$1$1\\1\\169\\0"}, s = {"L$1", "I$0"})
/* loaded from: /tmp/dex/classes6.dex */
public final class MainHomeScreenKt$MainHomeScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ State<String> $toastMessage$delegate;
    final /* synthetic */ CsvAggregatorViewModel $viewModel;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainHomeScreenKt$MainHomeScreen$1$1(State<String> state, SnackbarHostState snackbarHostState, CsvAggregatorViewModel csvAggregatorViewModel, Continuation<? super MainHomeScreenKt$MainHomeScreen$1$1> continuation) {
        super(2, continuation);
        this.$toastMessage$delegate = state;
        this.$snackbarHostState = snackbarHostState;
        this.$viewModel = csvAggregatorViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainHomeScreenKt$MainHomeScreen$1$1(this.$toastMessage$delegate, this.$snackbarHostState, this.$viewModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final Object invokeSuspend(Object $result) {
        String MainHomeScreen$lambda$10;
        CsvAggregatorViewModel csvAggregatorViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MainHomeScreen$lambda$10 = MainHomeScreenKt.MainHomeScreen$lambda$10(this.$toastMessage$delegate);
                if (MainHomeScreen$lambda$10 != null) {
                    SnackbarHostState snackbarHostState = this.$snackbarHostState;
                    CsvAggregatorViewModel csvAggregatorViewModel2 = this.$viewModel;
                    this.L$0 = csvAggregatorViewModel2;
                    this.L$1 = SpillingKt.nullOutSpilledVariable(MainHomeScreen$lambda$10);
                    this.I$0 = 0;
                    this.label = 1;
                    if (SnackbarHostState.showSnackbar$default(snackbarHostState, MainHomeScreen$lambda$10, (String) null, false, (SnackbarDuration) null, this, 14, (Object) null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    csvAggregatorViewModel = csvAggregatorViewModel2;
                    csvAggregatorViewModel.clearToast();
                }
                return Unit.INSTANCE;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i = this.I$0;
                csvAggregatorViewModel = (CsvAggregatorViewModel) this.L$0;
                ResultKt.throwOnFailure($result);
                csvAggregatorViewModel.clearToast();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
