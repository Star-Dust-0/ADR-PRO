package com.example;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.example.ui.screens.MainHomeScreenKt;
import com.example.ui.theme.ThemeKt;
import com.example.viewmodel.CsvAggregatorViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/example/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/example/viewmodel/CsvAggregatorViewModel;", "getViewModel", "()Lcom/example/viewmodel/CsvAggregatorViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public MainActivity() {
        final MainActivity mainActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CsvAggregatorViewModel.class), new Function0<ViewModelStore>() { // from class: com.example.MainActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m1invoke() {
                return mainActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.example.MainActivity$special$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelProvider.Factory m0invoke() {
                return mainActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.example.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CreationExtras m2invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? mainActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final CsvAggregatorViewModel getViewModel() {
        return (CsvAggregatorViewModel) this.viewModel.getValue();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, (SystemBarStyle) null, (SystemBarStyle) null, 3, (Object) null);
        ComponentActivityKt.setContent$default(this, (CompositionContext) null, ComposableLambdaKt.composableLambdaInstance(-601144069, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$2(MainActivity.this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$2(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C26@966L196,26@947L215:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-601144069, $changed, -1, "com.example.MainActivity.onCreate.<anonymous> (MainActivity.kt:26)");
            }
            ThemeKt.MyApplicationTheme(false, ComposableLambdaKt.rememberComposableLambda(-1251129304, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$2$lambda$1(MainActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$2$lambda$1(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C29@1062L11,30@1095L59,27@976L178:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1251129304, $changed, -1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:27)");
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, (Object) null), (Shape) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground-0d7_KjU(), 0L, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1928935251, true, new Function2() { // from class: com.example.MainActivity$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$2$lambda$1$lambda$0(MainActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit onCreate$lambda$2$lambda$1$lambda$0(MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C31@1107L37:MainActivity.kt#to5c3");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1928935251, $changed, -1, "com.example.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:31)");
            }
            MainHomeScreenKt.MainHomeScreen(this$0.getViewModel(), null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
