package com.example.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.example.data.model.CsvSampleItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CsvCellInspectorDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CsvCellInspectorDialog", "", "item", "Lcom/example/data/model/CsvSampleItem;", "onDismiss", "Lkotlin/Function0;", "(Lcom/example/data/model/CsvSampleItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class CsvCellInspectorDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CsvCellInspectorDialog$lambda$15(CsvSampleItem csvSampleItem, Function0 function0, int i, Composer composer, int i2) {
        CsvCellInspectorDialog(csvSampleItem, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CsvCellInspectorDialog(final CsvSampleItem item, final Function0<Unit> function0, Composer $composer, final int $changed) {
        final Function0 onDismiss;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(166978478);
        ComposerKt.sourceInformation($composer2, "C(CsvCellInspectorDialog)50@2090L9238,50@2053L9275:CsvCellInspectorDialog.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(item) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            onDismiss = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(166978478, $dirty, -1, "com.example.ui.components.CsvCellInspectorDialog (CsvCellInspectorDialog.kt:49)");
            }
            onDismiss = function0;
            AndroidDialog_androidKt.Dialog(onDismiss, (DialogProperties) null, ComposableLambdaKt.rememberComposableLambda(-1487194313, true, new Function2() { // from class: com.example.ui.components.CsvCellInspectorDialogKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return CsvCellInspectorDialogKt.CsvCellInspectorDialog$lambda$14(CsvSampleItem.this, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.CsvCellInspectorDialogKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return CsvCellInspectorDialogKt.CsvCellInspectorDialog$lambda$15(CsvSampleItem.this, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CsvCellInspectorDialog$lambda$14(final CsvSampleItem $item, final Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@2229L11,53@2187L62,57@2368L8954,51@2100L9222:CsvCellInspectorDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1487194313, $changed, -1, "com.example.ui.components.CsvCellInspectorDialog.<anonymous> (CsvCellInspectorDialog.kt:51)");
            }
            CardKt.Card(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null), 0.0f, Dp.constructor-impl(16), 1, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(20)), CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.rememberComposableLambda(-1749784955, true, new Function3() { // from class: com.example.ui.components.CsvCellInspectorDialogKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CsvCellInspectorDialogKt.CsvCellInspectorDialog$lambda$14$lambda$13(CsvSampleItem.this, $onDismiss, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x08b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0821 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit CsvCellInspectorDialog$lambda$14$lambda$13(final com.example.data.model.CsvSampleItem r134, kotlin.jvm.functions.Function0 r135, androidx.compose.foundation.layout.ColumnScope r136, androidx.compose.runtime.Composer r137, int r138) {
        /*
            Method dump skipped, instructions count: 2675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.CsvCellInspectorDialogKt.CsvCellInspectorDialog$lambda$14$lambda$13(com.example.data.model.CsvSampleItem, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit CsvCellInspectorDialog$lambda$14$lambda$13$lambda$12$lambda$4(com.example.data.model.CsvSampleItem r82, androidx.compose.runtime.Composer r83, int r84) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.CsvCellInspectorDialogKt.CsvCellInspectorDialog$lambda$14$lambda$13$lambda$12$lambda$4(com.example.data.model.CsvSampleItem, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CsvCellInspectorDialog$lambda$14$lambda$13$lambda$12$lambda$10$lambda$9$lambda$8(final CsvSampleItem $item, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final List rawPreviewGrid = $item.getRawPreviewGrid();
        $this$LazyColumn.items(rawPreviewGrid.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.components.CsvCellInspectorDialogKt$CsvCellInspectorDialog$lambda$14$lambda$13$lambda$12$lambda$10$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            public final Object invoke(int index) {
                rawPreviewGrid.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.components.CsvCellInspectorDialogKt$CsvCellInspectorDialog$lambda$14$lambda$13$lambda$12$lambda$10$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
                invoke((LazyItemScope) p1, ((Number) p2).intValue(), (Composer) p3, ((Number) p4).intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x020e  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x02b5  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x02e6  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x033f  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0359  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0305  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x041b  */
            /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0228  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r59, final int r60, androidx.compose.runtime.Composer r61, int r62) {
                /*
                    Method dump skipped, instructions count: 1055
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.CsvCellInspectorDialogKt$CsvCellInspectorDialog$lambda$14$lambda$13$lambda$12$lambda$10$lambda$9$lambda$8$$inlined$itemsIndexed$default$3.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
            }
        }));
        return Unit.INSTANCE;
    }
}
