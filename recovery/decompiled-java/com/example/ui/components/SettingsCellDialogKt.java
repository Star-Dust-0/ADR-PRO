package com.example.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SettingsCellDialog.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"SettingsCellDialog", "", "currentCell", "", "onSaveCell", "Lkotlin/Function1;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "cellText"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class SettingsCellDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsCellDialog$lambda$12(String str, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        SettingsCellDialog(str, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SettingsCellDialog(final String currentCell, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Object obj;
        final Function0 onDismiss;
        Intrinsics.checkNotNullParameter(currentCell, "currentCell");
        Intrinsics.checkNotNullParameter(function1, "onSaveCell");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(400898947);
        ComposerKt.sourceInformation($composer2, "C(SettingsCellDialog)P(!1,2)41@1613L40,43@1696L2814,43@1659L2851:SettingsCellDialog.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(currentCell) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            onDismiss = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400898947, $dirty, -1, "com.example.ui.components.SettingsCellDialog (SettingsCellDialog.kt:40)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1283163893, "CC(remember):SettingsCellDialog.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                obj = SnapshotStateKt.mutableStateOf$default(currentCell, (SnapshotMutationPolicy) null, 2, (Object) null);
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState cellText$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            onDismiss = function0;
            AndroidDialog_androidKt.Dialog(onDismiss, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-652732838, true, new Function2() { // from class: com.example.ui.components.SettingsCellDialogKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsCellDialogKt.SettingsCellDialog$lambda$11(cellText$delegate, function0, function1, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 6) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.SettingsCellDialogKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsCellDialogKt.SettingsCellDialog$lambda$12(currentCell, function1, onDismiss, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String SettingsCellDialog$lambda$1(MutableState<String> mutableState) {
        return (String) ((State) mutableState).getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsCellDialog$lambda$11(final MutableState $cellText$delegate, final Function0 $onDismiss, final Function1 $onSaveCell, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C46@1835L11,46@1793L62,50@1963L2541,44@1706L2798:SettingsCellDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652732838, $changed, -1, "com.example.ui.components.SettingsCellDialog.<anonymous> (SettingsCellDialog.kt:44)");
            }
            CardKt.Card(PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), Dp.constructor-impl(16)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(1356205644, true, new Function3() { // from class: com.example.ui.components.SettingsCellDialogKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsCellDialogKt.SettingsCellDialog$lambda$11$lambda$10($cellText$delegate, $onDismiss, $onSaveCell, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SettingsCellDialog$lambda$11$lambda$10(final androidx.compose.runtime.MutableState r102, final kotlin.jvm.functions.Function0 r103, final kotlin.jvm.functions.Function1 r104, androidx.compose.foundation.layout.ColumnScope r105, androidx.compose.runtime.Composer r106, int r107) {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.SettingsCellDialogKt.SettingsCellDialog$lambda$11$lambda$10(androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsCellDialog$lambda$11$lambda$10$lambda$9$lambda$5$lambda$4(MutableState $cellText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String upperCase = it.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        $cellText$delegate.setValue(upperCase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SettingsCellDialog$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(Function1 $onSaveCell, Function0 $onDismiss, MutableState $cellText$delegate) {
        if (!StringsKt.isBlank(SettingsCellDialog$lambda$1($cellText$delegate))) {
            $onSaveCell.invoke(SettingsCellDialog$lambda$1($cellText$delegate));
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }
}
