package com.example.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import com.example.data.model.BatchSummaryStats;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: StatsSummaryCards.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aI\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"StatsSummaryCards", "", "stats", "Lcom/example/data/model/BatchSummaryStats;", "targetCell", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/data/model/BatchSummaryStats;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatItemCard", "title", "value", "subtitle", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "StatItemCard-nBX6wN0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class StatsSummaryCardsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatItemCard_nBX6wN0$lambda$7(String str, String str2, String str3, ImageVector imageVector, long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25StatItemCardnBX6wN0(str, str2, str3, imageVector, j, j2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatsSummaryCards$lambda$3(BatchSummaryStats batchSummaryStats, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatsSummaryCards(batchSummaryStats, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void StatsSummaryCards(final com.example.data.model.BatchSummaryStats r92, final java.lang.String r93, androidx.compose.ui.Modifier r94, androidx.compose.runtime.Composer r95, final int r96, final int r97) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.StatsSummaryCardsKt.StatsSummaryCards(com.example.data.model.BatchSummaryStats, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: StatItemCard-nBX6wN0, reason: not valid java name */
    private static final void m25StatItemCardnBX6wN0(final String title, final String value, final String subtitle, final ImageVector icon, final long containerColor, final long contentColor, Modifier modifier, Composer $composer, final int $changed, final int i) {
        String str;
        String str2;
        ImageVector imageVector;
        long j;
        long j2;
        Modifier modifier2;
        Modifier modifier3;
        Composer $composer2;
        final Modifier modifier4;
        Composer $composer3 = $composer.startRestartGroup(2093615498);
        ComposerKt.sourceInformation($composer3, "C(StatItemCard)P(5,6,4,2,0:c#ui.graphics.Color,1:c#ui.graphics.Color)120@4658L43,121@4708L1338,117@4550L1496:StatsSummaryCards.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = title;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = title;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            str2 = subtitle;
            $dirty |= $composer3.changed(str2) ? 256 : 128;
        } else {
            str2 = subtitle;
        }
        if (($changed & 3072) == 0) {
            imageVector = icon;
            $dirty |= $composer3.changed(imageVector) ? 2048 : 1024;
        } else {
            imageVector = icon;
        }
        if (($changed & 24576) == 0) {
            j = containerColor;
            $dirty |= $composer3.changed(j) ? 16384 : 8192;
        } else {
            j = containerColor;
        }
        if (($changed & 196608) == 0) {
            j2 = contentColor;
            $dirty |= $composer3.changed(j2) ? 131072 : 65536;
        } else {
            j2 = contentColor;
        }
        int i2 = i & 64;
        if (i2 != 0) {
            $dirty |= 1572864;
            modifier2 = modifier;
        } else if ((1572864 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ((599187 & $dirty) == 599186 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            modifier4 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2093615498, $dirty, -1, "com.example.ui.components.StatItemCard (StatsSummaryCards.kt:116)");
            }
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16));
            $composer2 = $composer3;
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(j, 0L, 0L, 0L, $composer2, (($dirty >> 12) & 14) | (CardDefaults.$stable << 12), 14);
            final String str3 = str;
            final String str4 = str2;
            final ImageVector imageVector2 = imageVector;
            final long j3 = j2;
            int i3 = (($dirty >> 18) & 14) | 196608;
            Modifier modifier5 = modifier3;
            CardKt.Card(modifier5, shape, cardColors, (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-959844740, true, new Function3() { // from class: com.example.ui.components.StatsSummaryCardsKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StatsSummaryCardsKt.StatItemCard_nBX6wN0$lambda$6(value, j3, str4, str3, imageVector2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, i3, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.StatsSummaryCardsKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return StatsSummaryCardsKt.StatItemCard_nBX6wN0$lambda$7(title, value, subtitle, icon, containerColor, contentColor, modifier4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatItemCard_nBX6wN0$lambda$6(java.lang.String r92, long r93, java.lang.String r95, java.lang.String r96, androidx.compose.ui.graphics.vector.ImageVector r97, androidx.compose.foundation.layout.ColumnScope r98, androidx.compose.runtime.Composer r99, int r100) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.StatsSummaryCardsKt.StatItemCard_nBX6wN0$lambda$6(java.lang.String, long, java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
