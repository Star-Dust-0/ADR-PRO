package com.example.ui.components;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExportShareBar.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"ExportShareBar", "", "hasContent", "", "onShareClick", "Lkotlin/Function0;", "onSaveClick", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ExportShareBarKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportShareBar$lambda$3(boolean z, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExportShareBar(z, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ExportShareBar(final boolean hasContent, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier modifier3;
        Composer $composer2;
        Modifier modifier4;
        Intrinsics.checkNotNullParameter(function0, "onShareClick");
        Intrinsics.checkNotNullParameter(function02, "onSaveClick");
        Composer $composer3 = $composer.startRestartGroup(-2088601274);
        ComposerKt.sourceInformation($composer3, "C(ExportShareBar)P(!1,3,2)43@1693L11,42@1638L84,45@1774L11,46@1827L2786,39@1515L3098:ExportShareBar.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(hasContent) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            modifier4 = modifier2;
            $composer2 = $composer3;
        } else {
            if (i2 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2088601274, $dirty, -1, "com.example.ui.components.ExportShareBar (ExportShareBar.kt:38)");
            }
            $composer2 = $composer3;
            modifier4 = modifier3;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(-621799752, true, new Function3() { // from class: com.example.ui.components.ExportShareBarKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ExportShareBarKt.ExportShareBar$lambda$2(function0, hasContent, function02, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196608, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier5 = modifier4;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.ExportShareBarKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return ExportShareBarKt.ExportShareBar$lambda$3(hasContent, function0, function02, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ExportShareBar$lambda$2(kotlin.jvm.functions.Function0 r90, boolean r91, kotlin.jvm.functions.Function0 r92, androidx.compose.foundation.layout.ColumnScope r93, androidx.compose.runtime.Composer r94, int r95) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.ExportShareBarKt.ExportShareBar$lambda$2(kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
