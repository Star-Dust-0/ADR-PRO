package com.example.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DescriptionKt;
import androidx.compose.material.icons.filled.EjectKt;
import androidx.compose.material.icons.filled.FolderOpenKt;
import androidx.compose.material.icons.filled.HistoryKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FolderPickerCard.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$FolderPickerCardKt {
    public static final ComposableSingletons$FolderPickerCardKt INSTANCE = new ComposableSingletons$FolderPickerCardKt();

    /* renamed from: lambda$-503976256, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f7lambda$503976256 = ComposableLambdaKt.composableLambdaInstance(-503976256, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$FolderPickerCardKt.lambda__503976256$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1057788820, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3lambda$1057788820 = ComposableLambdaKt.composableLambdaInstance(-1057788820, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$FolderPickerCardKt.lambda__1057788820$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$625726563 = ComposableLambdaKt.composableLambdaInstance(625726563, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$FolderPickerCardKt.lambda_625726563$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-24131891, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f5lambda$24131891 = ComposableLambdaKt.composableLambdaInstance(-24131891, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FolderPickerCardKt.lambda__24131891$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-893534486, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f8lambda$893534486 = ComposableLambdaKt.composableLambdaInstance(-893534486, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FolderPickerCardKt.lambda__893534486$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1418588511, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f4lambda$1418588511 = ComposableLambdaKt.composableLambdaInstance(-1418588511, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda5
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FolderPickerCardKt.lambda__1418588511$lambda$5((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-324138917, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f6lambda$324138917 = ComposableLambdaKt.composableLambdaInstance(-324138917, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda6
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FolderPickerCardKt.lambda__324138917$lambda$6((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$874260251 = ComposableLambdaKt.composableLambdaInstance(874260251, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$FolderPickerCardKt$$ExternalSyntheticLambda7
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FolderPickerCardKt.lambda_874260251$lambda$7((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1057788820$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10getLambda$1057788820$app() {
        return f3lambda$1057788820;
    }

    /* renamed from: getLambda$-1418588511$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11getLambda$1418588511$app() {
        return f4lambda$1418588511;
    }

    /* renamed from: getLambda$-24131891$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m12getLambda$24131891$app() {
        return f5lambda$24131891;
    }

    /* renamed from: getLambda$-324138917$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m13getLambda$324138917$app() {
        return f6lambda$324138917;
    }

    /* renamed from: getLambda$-503976256$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14getLambda$503976256$app() {
        return f7lambda$503976256;
    }

    /* renamed from: getLambda$-893534486$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m15getLambda$893534486$app() {
        return f8lambda$893534486;
    }

    public final Function2<Composer, Integer, Unit> getLambda$625726563$app() {
        return lambda$625726563;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$874260251$app() {
        return lambda$874260251;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__503976256$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C202@4243L11,199@4065L364:FolderPickerCard.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503976256, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$-503976256.<anonymous> (FolderPickerCard.kt:199)");
            }
            IconKt.Icon-ww6aTOc(FolderOpenKt.getFolderOpen(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), Dp.constructor-impl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1057788820$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C231@5600L11,228@5408L250:FolderPickerCard.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1057788820, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$-1057788820.<anonymous> (FolderPickerCard.kt:228)");
            }
            IconKt.Icon-ww6aTOc(HistoryKt.getHistory(Icons.INSTANCE.getDefault()), "History", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_625726563$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C240@6052L11,237@5858L252:FolderPickerCard.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(625726563, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$625726563.<anonymous> (FolderPickerCard.kt:237)");
            }
            IconKt.Icon-ww6aTOc(SettingsKt.getSettings(Icons.INSTANCE.getDefault()), "Settings", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__24131891$lambda$3(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C261@6765L176,266@6958L39,268@7047L38,267@7014L177:FolderPickerCard.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-24131891, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$-24131891.<anonymous> (FolderPickerCard.kt:261)");
            }
            IconKt.Icon-ww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(22)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_sync_data, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__893534486$lambda$4(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C293@8066L11,289@7843L264,295@8128L39,297@8225L42,300@8413L11,296@8188L306:FolderPickerCard.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893534486, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$-893534486.<anonymous> (FolderPickerCard.kt:289)");
            }
            IconKt.Icon-ww6aTOc(FolderOpenKt.getFolderOpen(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_select_folder, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, $composer, 199680, 3072, 122834);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1418588511$lambda$5(RowScope $this$OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C317@9119L11,313@8895L265,319@9181L39,321@9278L41,324@9465L11,320@9241L305:FolderPickerCard.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1418588511, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$-1418588511.<anonymous> (FolderPickerCard.kt:313)");
            }
            IconKt.Icon-ww6aTOc(DescriptionKt.getDescription(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_select_files, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface-0d7_KjU(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, (TextStyle) null, $composer, 199680, 3072, 122834);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__324138917$lambda$6(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C339@10071L214,344@10310L39,346@10415L36,345@10374L207:FolderPickerCard.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-324138917, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$-324138917.<anonymous> (FolderPickerCard.kt:339)");
            }
            IconKt.Icon-ww6aTOc(EjectKt.getEject(Icons.INSTANCE.getDefault()), "Unmount", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(4)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_unmount, $composer, 0), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_874260251$lambda$7(RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C433@14972L213,438@15210L39,440@15315L42,441@15409L10,439@15274L218:FolderPickerCard.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874260251, $changed, -1, "com.example.ui.components.ComposableSingletons$FolderPickerCardKt.lambda$874260251.<anonymous> (FolderPickerCard.kt:433)");
            }
            IconKt.Icon-ww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(22)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), $composer, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_aggregate_now, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), 0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777211, (Object) null), $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
