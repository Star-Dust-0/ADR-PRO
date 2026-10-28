package com.example.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
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
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CsvCellInspectorDialog.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$CsvCellInspectorDialogKt {
    public static final ComposableSingletons$CsvCellInspectorDialogKt INSTANCE = new ComposableSingletons$CsvCellInspectorDialogKt();

    /* renamed from: lambda$-1312966418, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f0lambda$1312966418 = ComposableLambdaKt.composableLambdaInstance(-1312966418, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$CsvCellInspectorDialogKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CsvCellInspectorDialogKt.lambda__1312966418$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-199291115, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f1lambda$199291115 = ComposableLambdaKt.composableLambdaInstance(-199291115, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$CsvCellInspectorDialogKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CsvCellInspectorDialogKt.lambda__199291115$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1312966418$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7getLambda$1312966418$app() {
        return f0lambda$1312966418;
    }

    /* renamed from: getLambda$-199291115$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m8getLambda$199291115$app() {
        return f1lambda$199291115;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1312966418$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C94@4130L34,92@4012L178:CsvCellInspectorDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1312966418, $changed, -1, "com.example.ui.components.ComposableSingletons$CsvCellInspectorDialogKt.lambda$-1312966418.<anonymous> (CsvCellInspectorDialog.kt:92)");
            }
            IconKt.Icon-ww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.btn_close, $composer, 0), (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__199291115$lambda$1(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C227@11194L33,227@11189L69:CsvCellInspectorDialog.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-199291115, $changed, -1, "com.example.ui.components.ComposableSingletons$CsvCellInspectorDialogKt.lambda$-199291115.<anonymous> (CsvCellInspectorDialog.kt:227)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_done, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 196608, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
