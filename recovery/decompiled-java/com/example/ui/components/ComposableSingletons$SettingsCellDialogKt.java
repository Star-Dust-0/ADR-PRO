package com.example.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsCellDialog.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$SettingsCellDialogKt {
    public static final ComposableSingletons$SettingsCellDialogKt INSTANCE = new ComposableSingletons$SettingsCellDialogKt();
    private static Function2<Composer, Integer, Unit> lambda$1607137500 = ComposableLambdaKt.composableLambdaInstance(1607137500, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$SettingsCellDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SettingsCellDialogKt.lambda_1607137500$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-300777318, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f12lambda$300777318 = ComposableLambdaKt.composableLambdaInstance(-300777318, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$SettingsCellDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsCellDialogKt.lambda__300777318$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$43729485 = ComposableLambdaKt.composableLambdaInstance(43729485, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$SettingsCellDialogKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsCellDialogKt.lambda_43729485$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-300777318$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m19getLambda$300777318$app() {
        return f12lambda$300777318;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1607137500$app() {
        return lambda$1607137500;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$43729485$app() {
        return lambda$43729485;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1607137500$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C84@3382L47,84@3377L53:SettingsCellDialog.kt#qonjpd");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1607137500, $changed, -1, "com.example.ui.components.ComposableSingletons$SettingsCellDialogKt.lambda$1607137500.<anonymous> (SettingsCellDialog.kt:84)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.dialog_cell_code_label, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__300777318$lambda$1(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C97@3901L35,97@3896L41:SettingsCellDialog.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-300777318, $changed, -1, "com.example.ui.components.ComposableSingletons$SettingsCellDialogKt.lambda$-300777318.<anonymous> (SettingsCellDialog.kt:97)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_cancel, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_43729485$lambda$2(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C109@4406L33,109@4401L39:SettingsCellDialog.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43729485, $changed, -1, "com.example.ui.components.ComposableSingletons$SettingsCellDialogKt.lambda$43729485.<anonymous> (SettingsCellDialog.kt:109)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_save, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
