package com.example.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CsvTablePreview.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$CsvTablePreviewKt {
    public static final ComposableSingletons$CsvTablePreviewKt INSTANCE = new ComposableSingletons$CsvTablePreviewKt();
    private static Function2<Composer, Integer, Unit> lambda$1719716804 = ComposableLambdaKt.composableLambdaInstance(1719716804, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$CsvTablePreviewKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CsvTablePreviewKt.lambda_1719716804$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1469297941 = ComposableLambdaKt.composableLambdaInstance(1469297941, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$CsvTablePreviewKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CsvTablePreviewKt.lambda_1469297941$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1469297941$app() {
        return lambda$1469297941;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1719716804$app() {
        return lambda$1719716804;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1719716804$lambda$1(androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.ComposableSingletons$CsvTablePreviewKt.lambda_1719716804$lambda$1(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1469297941$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C261@10655L11,258@10503L243:CsvTablePreview.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469297941, $changed, -1, "com.example.ui.components.ComposableSingletons$CsvTablePreviewKt.lambda$1469297941.<anonymous> (CsvTablePreview.kt:258)");
            }
            IconKt.Icon-ww6aTOc(VisibilityKt.getVisibility(Icons.INSTANCE.getDefault()), "Preview File", SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
