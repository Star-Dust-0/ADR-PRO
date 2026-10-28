package com.example.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FolderPickerCard.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"FolderPickerCard", "", "folderName", "", "sampleCount", "", "targetCell", "isProcessing", "", "progress", "", "onSyncClick", "Lkotlin/Function0;", "onPickFolderClick", "onPickFilesClick", "onCombineClick", "onOpenSettings", "onOpenHistory", "onUnmountClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ILjava/lang/String;ZFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class FolderPickerCardKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FolderPickerCard$lambda$21(String str, int i, String str2, boolean z, float f, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        FolderPickerCard(str, i, str2, z, f, function0, function02, function03, function04, function05, function06, function07, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final void FolderPickerCard(final String folderName, final int sampleCount, final String targetCell, final boolean isProcessing, final float progress, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Modifier modifier, Composer $composer, final int $changed, final int $changed1, final int i) {
        int i2;
        boolean z;
        final float f;
        int i3;
        int i4;
        int i5;
        int i6;
        Function0 onOpenSettings;
        Function0 onOpenHistory;
        Function0 onUnmountClick;
        Modifier modifier2;
        Function0 onOpenSettings2;
        Function0 onOpenHistory2;
        final Function0 onOpenHistory3;
        final Function0 onOpenSettings3;
        Composer $composer2;
        final Modifier modifier3;
        final Function0 onUnmountClick2;
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(function0, "onSyncClick");
        Intrinsics.checkNotNullParameter(function02, "onPickFolderClick");
        Intrinsics.checkNotNullParameter(function03, "onPickFilesClick");
        Intrinsics.checkNotNullParameter(function04, "onCombineClick");
        Composer $composer3 = $composer.startRestartGroup(-985013899);
        ComposerKt.sourceInformation($composer3, "C(FolderPickerCard)P(!1,11,12!1,10,8,7,6,3,5,4,9)175@3128L11,174@3073L84,177@3209L11,178@3262L13128,171@2950L13440:FolderPickerCard.kt#qonjpd");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(folderName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            i2 = sampleCount;
            $dirty |= $composer3.changed(i2) ? 32 : 16;
        } else {
            i2 = sampleCount;
        }
        if (($changed & 3072) == 0) {
            z = isProcessing;
            $dirty |= $composer3.changed(z) ? 2048 : 1024;
        } else {
            z = isProcessing;
        }
        if (($changed & 24576) == 0) {
            f = progress;
            $dirty |= $composer3.changed(f) ? 16384 : 8192;
        } else {
            f = progress;
        }
        if (($changed & 196608) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(function04) ? 67108864 : 33554432;
        }
        int i7 = i & 512;
        if (i7 != 0) {
            $dirty |= 805306368;
            i3 = i7;
        } else if (($changed & 805306368) == 0) {
            i3 = i7;
            $dirty |= $composer3.changedInstance(function05) ? 536870912 : 268435456;
        } else {
            i3 = i7;
        }
        int i8 = i & 1024;
        if (i8 != 0) {
            $dirty1 |= 6;
            i4 = i8;
        } else if (($changed1 & 6) == 0) {
            i4 = i8;
            $dirty1 |= $composer3.changedInstance(function06) ? 4 : 2;
        } else {
            i4 = i8;
        }
        int i9 = i & 2048;
        if (i9 != 0) {
            $dirty1 |= 48;
            i5 = i9;
        } else if (($changed1 & 48) == 0) {
            i5 = i9;
            $dirty1 |= $composer3.changedInstance(function07) ? 32 : 16;
        } else {
            i5 = i9;
        }
        int i10 = i & 4096;
        if (i10 != 0) {
            $dirty1 |= 384;
            i6 = i10;
        } else {
            i6 = i10;
            if (($changed1 & 384) == 0) {
                $dirty1 |= $composer3.changed(modifier) ? 256 : 128;
            }
        }
        if (($dirty & 306783251) == 306783250 && ($dirty1 & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            onOpenSettings3 = function05;
            onOpenHistory3 = function06;
            onUnmountClick2 = function07;
            modifier3 = modifier;
            $composer2 = $composer3;
        } else {
            if (i3 != 0) {
                onOpenSettings = null;
            } else {
                onOpenSettings = function05;
            }
            if (i4 == 0) {
                onOpenHistory = function06;
            } else {
                onOpenHistory = null;
            }
            if (i5 == 0) {
                onUnmountClick = function07;
            } else {
                onUnmountClick = null;
            }
            if (i6 == 0) {
                modifier2 = modifier;
            } else {
                modifier2 = (Modifier) Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                onOpenSettings2 = onOpenSettings;
                onOpenHistory2 = onOpenHistory;
                ComposerKt.traceEventStart(-985013899, $dirty, $dirty1, "com.example.ui.components.FolderPickerCard (FolderPickerCard.kt:170)");
            } else {
                onOpenSettings2 = onOpenSettings;
                onOpenHistory2 = onOpenHistory;
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24));
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14);
            BorderStroke borderStroke = BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            final boolean z2 = z;
            Modifier modifier4 = modifier2;
            final Function0 onUnmountClick3 = onUnmountClick;
            final Function0 onOpenHistory4 = onOpenHistory2;
            final int i11 = i2;
            final Function0 onOpenSettings4 = onOpenSettings2;
            Function3 function3 = new Function3() { // from class: com.example.ui.components.FolderPickerCardKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FolderPickerCardKt.FolderPickerCard$lambda$20(function0, folderName, z2, onOpenHistory4, onOpenSettings4, function02, function03, onUnmountClick3, i11, function04, f, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            };
            onOpenHistory3 = onOpenHistory4;
            onOpenSettings3 = onOpenSettings4;
            CardKt.Card(fillMaxWidth$default, shape, cardColors, (CardElevation) null, borderStroke, ComposableLambdaKt.rememberComposableLambda(1961721703, true, function3, $composer3, 54), $composer3, 196608, 8);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            onUnmountClick2 = onUnmountClick3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.FolderPickerCardKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return FolderPickerCardKt.FolderPickerCard$lambda$21(folderName, sampleCount, targetCell, isProcessing, progress, function0, function02, function03, function04, onOpenSettings3, onOpenHistory3, onUnmountClick2, modifier3, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x06ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0727  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FolderPickerCard$lambda$20(kotlin.jvm.functions.Function0 r135, final java.lang.String r136, final boolean r137, kotlin.jvm.functions.Function0 r138, kotlin.jvm.functions.Function0 r139, kotlin.jvm.functions.Function0 r140, kotlin.jvm.functions.Function0 r141, kotlin.jvm.functions.Function0 r142, final int r143, final kotlin.jvm.functions.Function0 r144, final float r145, androidx.compose.foundation.layout.ColumnScope r146, androidx.compose.runtime.Composer r147, int r148) {
        /*
            Method dump skipped, instructions count: 2992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.FolderPickerCardKt.FolderPickerCard$lambda$20(kotlin.jvm.functions.Function0, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, kotlin.jvm.functions.Function0, float, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FolderPickerCard$lambda$20$lambda$19$lambda$14(boolean r43, final int r44, kotlin.jvm.functions.Function0 r45, final java.lang.String r46, androidx.compose.animation.AnimatedVisibilityScope r47, androidx.compose.runtime.Composer r48, int r49) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.FolderPickerCardKt.FolderPickerCard$lambda$20$lambda$19$lambda$14(boolean, int, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FolderPickerCard$lambda$20$lambda$19$lambda$14$lambda$13$lambda$12(java.lang.String r128, final int r129, androidx.compose.runtime.Composer r130, int r131) {
        /*
            Method dump skipped, instructions count: 1403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.FolderPickerCardKt.FolderPickerCard$lambda$20$lambda$19$lambda$14$lambda$13$lambda$12(java.lang.String, int, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FolderPickerCard$lambda$20$lambda$19$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10(int $sampleCount, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C409@13771L51,410@13882L10,411@13998L11,408@13722L433:FolderPickerCard.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(308178663, $changed, -1, "com.example.ui.components.FolderPickerCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FolderPickerCard.kt:408)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.samples_count, new Object[]{Integer.valueOf($sampleCount)}, $composer, 0), PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12), Dp.constructor-impl(6)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), 0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777211, (Object) null), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FolderPickerCard$lambda$20$lambda$19$lambda$18(final float r51, androidx.compose.animation.AnimatedVisibilityScope r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.FolderPickerCardKt.FolderPickerCard$lambda$20$lambda$19$lambda$18(float, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final float FolderPickerCard$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(float $progress) {
        return $progress;
    }
}
