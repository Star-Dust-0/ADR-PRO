package com.example.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.EjectKt;
import androidx.compose.material.icons.filled.FolderSpecialKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
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

/* compiled from: UsbSyncSheet.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$UsbSyncSheetKt {
    public static final ComposableSingletons$UsbSyncSheetKt INSTANCE = new ComposableSingletons$UsbSyncSheetKt();

    /* renamed from: lambda$-1475498423, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f14lambda$1475498423 = ComposableLambdaKt.composableLambdaInstance(-1475498423, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$UsbSyncSheetKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UsbSyncSheetKt.lambda__1475498423$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-527489158, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f16lambda$527489158 = ComposableLambdaKt.composableLambdaInstance(-527489158, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$UsbSyncSheetKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UsbSyncSheetKt.lambda__527489158$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$9443996 = ComposableLambdaKt.composableLambdaInstance(9443996, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$UsbSyncSheetKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UsbSyncSheetKt.lambda_9443996$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-244565107, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f15lambda$244565107 = ComposableLambdaKt.composableLambdaInstance(-244565107, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$UsbSyncSheetKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UsbSyncSheetKt.lambda__244565107$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1354466653, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f13lambda$1354466653 = ComposableLambdaKt.composableLambdaInstance(-1354466653, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$UsbSyncSheetKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UsbSyncSheetKt.lambda__1354466653$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1354466653$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m20getLambda$1354466653$app() {
        return f13lambda$1354466653;
    }

    /* renamed from: getLambda$-1475498423$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m21getLambda$1475498423$app() {
        return f14lambda$1475498423;
    }

    /* renamed from: getLambda$-244565107$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m22getLambda$244565107$app() {
        return f15lambda$244565107;
    }

    /* renamed from: getLambda$-527489158$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m23getLambda$527489158$app() {
        return f16lambda$527489158;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$9443996$app() {
        return lambda$9443996;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1475498423$lambda$0(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C122@5168L34,122@5163L40:UsbSyncSheet.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1475498423, $changed, -1, "com.example.ui.components.ComposableSingletons$UsbSyncSheetKt.lambda$-1475498423.<anonymous> (UsbSyncSheet.kt:122)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_close, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__527489158$lambda$1(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C166@7472L233,171@7734L39,173@7847L45,172@7802L182:UsbSyncSheet.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527489158, $changed, -1, "com.example.ui.components.ComposableSingletons$UsbSyncSheetKt.lambda$-527489158.<anonymous> (UsbSyncSheet.kt:166)");
            }
            IconKt.Icon-ww6aTOc(FolderSpecialKt.getFolderSpecial(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_select_test_root, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196608, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_9443996$lambda$2(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C235@11035L45,234@10986L248:UsbSyncSheet.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(9443996, $changed, -1, "com.example.ui.components.ComposableSingletons$UsbSyncSheetKt.lambda$9443996.<anonymous> (UsbSyncSheet.kt:234)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_change_test_root, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__244565107$lambda$3(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C251@11962L262,256@12261L39,258@12390L36,257@12337L255:UsbSyncSheet.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-244565107, $changed, -1, "com.example.ui.components.ComposableSingletons$UsbSyncSheetKt.lambda$-244565107.<anonymous> (UsbSyncSheet.kt:251)");
            }
            IconKt.Icon-ww6aTOc(EjectKt.getEject(Icons.INSTANCE.getDefault()), "Unmount", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(14)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_unmount, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1354466653$lambda$4(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C381@16969L181,386@17167L39,388@17256L42,387@17223L181:UsbSyncSheet.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1354466653, $changed, -1, "com.example.ui.components.ComposableSingletons$UsbSyncSheetKt.lambda$-1354466653.<anonymous> (UsbSyncSheet.kt:381)");
            }
            IconKt.Icon-ww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.sync_merge_folder, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
