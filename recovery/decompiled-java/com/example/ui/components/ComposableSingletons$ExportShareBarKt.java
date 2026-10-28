package com.example.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SaveAltKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExportShareBar.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$ExportShareBarKt {
    public static final ComposableSingletons$ExportShareBarKt INSTANCE = new ComposableSingletons$ExportShareBarKt();

    /* renamed from: lambda$-1371929086, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f2lambda$1371929086 = ComposableLambdaKt.composableLambdaInstance(-1371929086, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$ExportShareBarKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ExportShareBarKt.lambda__1371929086$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$483605124 = ComposableLambdaKt.composableLambdaInstance(483605124, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$ExportShareBarKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ExportShareBarKt.lambda_483605124$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1371929086$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m9getLambda$1371929086$app() {
        return f2lambda$1371929086;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$483605124$app() {
        return lambda$483605124;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1371929086$lambda$0(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C81@3170L193,86@3384L39,88@3481L34,87@3444L189:ExportShareBar.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1371929086, $changed, -1, "com.example.ui.components.ComposableSingletons$ExportShareBarKt.lambda$-1371929086.<anonymous> (ExportShareBar.kt:81)");
            }
            IconKt.Icon-ww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_share, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_483605124$lambda$1(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C104@4097L195,109@4313L39,111@4410L37,110@4373L192:ExportShareBar.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483605124, $changed, -1, "com.example.ui.components.ComposableSingletons$ExportShareBarKt.lambda$483605124.<anonymous> (ExportShareBar.kt:104)");
            }
            IconKt.Icon-ww6aTOc(SaveAltKt.getSaveAlt(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_save_csv, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
