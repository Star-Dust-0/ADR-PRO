package com.example.ui.components;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.example.data.db.BatchHistoryEntity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchHistorySheet.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000b\u001a1\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"BatchHistorySheet", "", "historyList", "", "Lcom/example/data/db/BatchHistoryEntity;", "onSelectBatch", "Lkotlin/Function1;", "onDeleteBatch", "", "onDismiss", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HistoryCardItem", "item", "onSelect", "onDelete", "(Lcom/example/data/db/BatchHistoryEntity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class BatchHistorySheetKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchHistorySheet$lambda$10(List list, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        BatchHistorySheet(list, function1, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HistoryCardItem$lambda$18(BatchHistoryEntity batchHistoryEntity, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        HistoryCardItem(batchHistoryEntity, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BatchHistorySheet(final List<BatchHistoryEntity> list, final Function1<? super BatchHistoryEntity, Unit> function1, final Function1<? super Long, Unit> function12, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(list, "historyList");
        Intrinsics.checkNotNullParameter(function1, "onSelectBatch");
        Intrinsics.checkNotNullParameter(function12, "onDeleteBatch");
        Intrinsics.checkNotNullParameter(function0, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(11082043);
        ComposerKt.sourceInformation($composer3, "C(BatchHistorySheet)P(!1,3)55@2288L59,60@2447L2588,57@2353L2682:BatchHistorySheet.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(list) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function12) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(11082043, $dirty, -1, "com.example.ui.components.BatchHistorySheet (BatchHistorySheet.kt:54)");
            }
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) null, $composer3, 6, 2);
            $composer2 = $composer3;
            ModalBottomSheetKt.ModalBottomSheet-dYc4hso(function0, (Modifier) null, sheetState, 0.0f, (Shape) null, 0L, 0L, 0.0f, 0L, (Function2) null, (Function2) null, (ModalBottomSheetProperties) null, ComposableLambdaKt.rememberComposableLambda(-1456397288, true, new Function3() { // from class: com.example.ui.components.BatchHistorySheetKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BatchHistorySheetKt.BatchHistorySheet$lambda$9(list, function1, function0, function12, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty >> 9) & 14, 384, 4090);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.BatchHistorySheetKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return BatchHistorySheetKt.BatchHistorySheet$lambda$10(list, function1, function12, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BatchHistorySheet$lambda$9(final java.util.List r139, final kotlin.jvm.functions.Function1 r140, final kotlin.jvm.functions.Function0 r141, final kotlin.jvm.functions.Function1 r142, androidx.compose.foundation.layout.ColumnScope r143, androidx.compose.runtime.Composer r144, int r145) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.BatchHistorySheetKt.BatchHistorySheet$lambda$9(java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchHistorySheet$lambda$9$lambda$8$lambda$7$lambda$6(final List $historyList, final Function1 $onSelectBatch, final Function0 $onDismiss, final Function1 $onDeleteBatch, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.example.ui.components.BatchHistorySheetKt$BatchHistorySheet$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m4invoke((BatchHistoryEntity) p1);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m4invoke(BatchHistoryEntity batchHistoryEntity) {
                return null;
            }
        };
        $this$LazyColumn.items($historyList.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.components.BatchHistorySheetKt$BatchHistorySheet$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($historyList.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.components.BatchHistorySheetKt$BatchHistorySheet$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3, Object p4) {
                invoke((LazyItemScope) p1, ((Number) p2).intValue(), (Composer) p3, ((Number) p4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Object obj;
                Object obj2;
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                final BatchHistoryEntity batchHistoryEntity = (BatchHistoryEntity) $historyList.get(it);
                $composer.startReplaceGroup(37797195);
                ComposerKt.sourceInformation($composer, "C*116@4690L127,120@4858L26,114@4593L317:BatchHistorySheet.kt#qonjpd");
                ComposerKt.sourceInformationMarkerStart($composer, -275872486, "CC(remember):BatchHistorySheet.kt#9igjgp");
                boolean changed = $composer.changed($onSelectBatch) | ((((i & 112) ^ 48) > 32 && $composer.changed(batchHistoryEntity)) || (i & 48) == 32) | $composer.changed($onDismiss);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function12 = $onSelectBatch;
                    final Function0 function0 = $onDismiss;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.components.BatchHistorySheetKt$BatchHistorySheet$1$1$3$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m5invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m5invoke() {
                            function12.invoke(batchHistoryEntity);
                            function0.invoke();
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                Function0 function02 = (Function0) obj;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -275867211, "CC(remember):BatchHistorySheet.kt#9igjgp");
                boolean changed2 = $composer.changed($onDeleteBatch) | ((((i & 112) ^ 48) > 32 && $composer.changed(batchHistoryEntity)) || (i & 48) == 32);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    final Function1 function13 = $onDeleteBatch;
                    obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.components.BatchHistorySheetKt$BatchHistorySheet$1$1$3$1$1$2$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m6invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m6invoke() {
                            function13.invoke(Long.valueOf(batchHistoryEntity.getId()));
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BatchHistorySheetKt.HistoryCardItem(batchHistoryEntity, function02, (Function0) obj2, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HistoryCardItem(final BatchHistoryEntity item, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Object obj;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(2039765820);
        ComposerKt.sourceInformation($composer3, "C(HistoryCardItem)P(!1,2)142@5361L14,144@5492L11,144@5450L88,145@5590L11,146@5643L2453,139@5276L2820:BatchHistorySheet.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(item) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039765820, $dirty, -1, "com.example.ui.components.HistoryCardItem (BatchHistorySheet.kt:136)");
            }
            final String dateStr = new SimpleDateFormat("yyyy/MM/dd - HH:mm", Locale.US).format(new Date(item.getProcessedTimestamp()));
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1709876362, "CC(remember):BatchHistorySheet.kt#9igjgp");
            boolean z = ($dirty & 112) == 32;
            Object rememberedValue = $composer3.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.components.BatchHistorySheetKt$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return BatchHistorySheetKt.HistoryCardItem$lambda$12$lambda$11(function0);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            CardKt.Card(ClickableKt.clickable-XHw0xAI$default(fillMaxWidth$default, false, (String) null, (Role) null, (Function0) obj, 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14)), CardDefaults.INSTANCE.cardColors-ro_MJ88(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(-1944151250, true, new Function3() { // from class: com.example.ui.components.BatchHistorySheetKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BatchHistorySheetKt.HistoryCardItem$lambda$17(BatchHistoryEntity.this, dateStr, function0, function02, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 196608, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.BatchHistorySheetKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj2, Object obj3) {
                    return BatchHistorySheetKt.HistoryCardItem$lambda$18(BatchHistoryEntity.this, function0, function02, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HistoryCardItem$lambda$12$lambda$11(Function0 $onSelect) {
        $onSelect.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit HistoryCardItem$lambda$17(com.example.data.db.BatchHistoryEntity r135, java.lang.String r136, kotlin.jvm.functions.Function0 r137, kotlin.jvm.functions.Function0 r138, androidx.compose.foundation.layout.ColumnScope r139, androidx.compose.runtime.Composer r140, int r141) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.BatchHistorySheetKt.HistoryCardItem$lambda$17(com.example.data.db.BatchHistoryEntity, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
