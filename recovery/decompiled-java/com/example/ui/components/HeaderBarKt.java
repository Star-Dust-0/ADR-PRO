package com.example.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderBar.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"HeaderBar", "", "targetCell", "", "onOpenSync", "Lkotlin/Function0;", "onOpenSettings", "onOpenHistory", "onLoadDemo", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class HeaderBarKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HeaderBar$lambda$7(String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HeaderBar(str, function0, function02, function03, function04, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HeaderBar(final String targetCell, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(function0, "onOpenSync");
        Intrinsics.checkNotNullParameter(function02, "onOpenSettings");
        Intrinsics.checkNotNullParameter(function03, "onOpenHistory");
        Intrinsics.checkNotNullParameter(function04, "onLoadDemo");
        Composer $composer3 = $composer.startRestartGroup(-727193027);
        ComposerKt.sourceInformation($composer3, "C(HeaderBar)P(5,4,3,2,1)51@1931L11,54@2065L5536,47@1802L5799:HeaderBar.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function04) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= 196608;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ((74897 & $dirty) == 74896 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i2 != 0 ? (Modifier) Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727193027, $dirty, -1, "com.example.ui.components.HeaderBar (HeaderBar.kt:46)");
            }
            Modifier modifier5 = modifier4;
            $composer2 = $composer3;
            SurfaceKt.Surface-T9BRK9s(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, (Object) null)), RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(0.0f, 0.0f, Dp.constructor-impl(24), Dp.constructor-impl(24), 3, (Object) null), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0.0f, Dp.constructor-impl(3), (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(2076635266, true, new Function2() { // from class: com.example.ui.components.HeaderBarKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return HeaderBarKt.HeaderBar$lambda$6(function0, function04, function03, function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer2, 12779520, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.HeaderBarKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return HeaderBarKt.HeaderBar$lambda$7(targetCell, function0, function02, function03, function04, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HeaderBar$lambda$6(kotlin.jvm.functions.Function0 r156, kotlin.jvm.functions.Function0 r157, kotlin.jvm.functions.Function0 r158, kotlin.jvm.functions.Function0 r159, androidx.compose.runtime.Composer r160, int r161) {
        /*
            Method dump skipped, instructions count: 2667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.HeaderBarKt.HeaderBar$lambda$6(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
