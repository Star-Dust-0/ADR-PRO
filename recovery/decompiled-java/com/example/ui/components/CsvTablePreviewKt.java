package com.example.ui.components;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
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
import com.example.data.model.CsvSampleItem;
import com.example.data.model.OutputFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CsvTablePreview.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"CsvTablePreview", "", "items", "", "Lcom/example/data/model/CsvSampleItem;", "targetCell", "", "outputFormat", "Lcom/example/data/model/OutputFormat;", "onFormatChanged", "Lkotlin/Function1;", "onItemClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/lang/String;Lcom/example/data/model/OutputFormat;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SampleRowItem", "index", "", "item", "onClick", "Lkotlin/Function0;", "(ILcom/example/data/model/CsvSampleItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class CsvTablePreviewKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CsvTablePreview$lambda$11(List list, String str, OutputFormat outputFormat, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CsvTablePreview(list, str, outputFormat, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SampleRowItem$lambda$18(int i, CsvSampleItem csvSampleItem, Function0 function0, int i2, Composer composer, int i3) {
        SampleRowItem(i, csvSampleItem, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void CsvTablePreview(final List<CsvSampleItem> list, final String targetCell, final OutputFormat outputFormat, final Function1<? super OutputFormat, Unit> function1, final Function1<? super CsvSampleItem, Unit> function12, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(function1, "onFormatChanged");
        Intrinsics.checkNotNullParameter(function12, "onItemClick");
        Composer $composer2 = $composer.startRestartGroup(-2098442265);
        ComposerKt.sourceInformation($composer2, "C(CsvTablePreview)P(!1,5,4,2,3)54@2245L11,54@2203L62,55@2317L11,56@2370L5525,51@2080L5815:CsvTablePreview.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(function12) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= 196608;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ((73731 & $dirty) == 73730 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = (Modifier) Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098442265, $dirty, -1, "com.example.ui.components.CsvTablePreview (CsvTablePreview.kt:50)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, (Object) null);
            Shape shape = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(24));
            Modifier modifier4 = modifier3;
            CardColors cardColors = CardDefaults.INSTANCE.cardColors-ro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14);
            $composer2 = $composer2;
            CardKt.Card(fillMaxWidth$default, shape, cardColors, (CardElevation) null, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(2028538165, true, new Function3() { // from class: com.example.ui.components.CsvTablePreviewKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CsvTablePreviewKt.CsvTablePreview$lambda$10(list, function12, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196608, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.CsvTablePreviewKt$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return CsvTablePreviewKt.CsvTablePreview$lambda$11(list, targetCell, outputFormat, function1, function12, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0353 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit CsvTablePreview$lambda$10(final java.util.List r141, final kotlin.jvm.functions.Function1 r142, androidx.compose.foundation.layout.ColumnScope r143, androidx.compose.runtime.Composer r144, int r145) {
        /*
            Method dump skipped, instructions count: 2243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.CsvTablePreviewKt.CsvTablePreview$lambda$10(java.util.List, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CsvTablePreview$lambda$10$lambda$9$lambda$2$lambda$1(List $items, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C88@3693L56,89@3797L10,90@3902L11,87@3656L377:CsvTablePreview.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453335264, $changed, -1, "com.example.ui.components.CsvTablePreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CsvTablePreview.kt:87)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.samples_total_count, new Object[]{Integer.valueOf($items.size())}, $composer, 0), PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(12), Dp.constructor-impl(6)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), 0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777211, (Object) null), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CsvTablePreview$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(final List $items, final Function1 $onItemClick, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        $this$LazyColumn.items($items.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.components.CsvTablePreviewKt$CsvTablePreview$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            public final Object invoke(int index) {
                $items.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.components.CsvTablePreviewKt$CsvTablePreview$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
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
                ComposerKt.sourceInformation($composer, "C188@8866L26:LazyDsl.kt#428nma");
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
                    ComposerKt.traceEventStart(-1091073711, $dirty, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                }
                int i = ($dirty & 14) | ($dirty & 112);
                final CsvSampleItem csvSampleItem = (CsvSampleItem) $items.get(it);
                $composer.startReplaceGroup(1220047018);
                ComposerKt.sourceInformation($composer, "C*168@7415L21,165@7262L204:CsvTablePreview.kt#qonjpd");
                int i2 = it + 1;
                ComposerKt.sourceInformationMarkerStart($composer, 1840476053, "CC(remember):CsvTablePreview.kt#9igjgp");
                boolean changed = $composer.changed($onItemClick) | $composer.changedInstance(csvSampleItem);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function1 = $onItemClick;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.components.CsvTablePreviewKt$CsvTablePreview$1$1$3$1$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m24invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m24invoke() {
                            function1.invoke(csvSampleItem);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                CsvTablePreviewKt.SampleRowItem(i2, csvSampleItem, (Function0) obj, $composer, (i >> 3) & 112);
                if (it < $items.size() - 1) {
                    $composer.startReplaceGroup(1220297838);
                    ComposerKt.sourceInformation($composer, "172@7634L11,171@7557L212");
                    DividerKt.HorizontalDivider-9IZ8Weo((Modifier) null, Dp.constructor-impl((float) 0.5d), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null), $composer, 48, 1);
                } else {
                    $composer.startReplaceGroup(1212825474);
                }
                $composer.endReplaceGroup();
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SampleRowItem(final int r98, final com.example.data.model.CsvSampleItem r99, kotlin.jvm.functions.Function0<kotlin.Unit> r100, androidx.compose.runtime.Composer r101, final int r102) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.CsvTablePreviewKt.SampleRowItem(int, com.example.data.model.CsvSampleItem, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SampleRowItem$lambda$13$lambda$12(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SampleRowItem$lambda$17$lambda$16$lambda$15(CsvSampleItem $item, boolean $isSuccess, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C242@9888L10,240@9792L532:CsvTablePreview.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(625864563, $changed, -1, "com.example.ui.components.SampleRowItem.<anonymous>.<anonymous>.<anonymous> (CsvTablePreview.kt:240)");
            }
            String extractedValue = $item.getExtractedValue();
            TextStyle textStyle = TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), 0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, FontFamily.Companion.getMonospace(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (Object) null);
            if ($isSuccess) {
                $composer.startReplaceGroup(160434693);
                ComposerKt.sourceInformation($composer, "246@10108L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU();
            } else {
                $composer.startReplaceGroup(160436291);
                ComposerKt.sourceInformation($composer, "246@10158L11");
                j = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer-0d7_KjU();
            }
            $composer.endReplaceGroup();
            TextKt.Text--4IGK_g(extractedValue, PaddingKt.padding-VpY3zN4(Modifier.Companion, Dp.constructor-impl(10), Dp.constructor-impl(4)), j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, textStyle, $composer, 48, 3072, 57336);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
