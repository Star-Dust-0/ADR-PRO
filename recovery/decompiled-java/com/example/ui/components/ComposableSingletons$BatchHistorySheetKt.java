package com.example.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.FolderKt;
import androidx.compose.material.icons.filled.RestoreKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchHistorySheet.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$BatchHistorySheetKt {
    public static final ComposableSingletons$BatchHistorySheetKt INSTANCE = new ComposableSingletons$BatchHistorySheetKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1234306657 = ComposableLambdaKt.composableLambdaInstance(1234306657, false, new Function3() { // from class: com.example.ui.components.ComposableSingletons$BatchHistorySheetKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BatchHistorySheetKt.lambda_1234306657$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$813361553 = ComposableLambdaKt.composableLambdaInstance(813361553, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$BatchHistorySheetKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BatchHistorySheetKt.lambda_813361553$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$304481546 = ComposableLambdaKt.composableLambdaInstance(304481546, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$BatchHistorySheetKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BatchHistorySheetKt.lambda_304481546$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$989088321 = ComposableLambdaKt.composableLambdaInstance(989088321, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$BatchHistorySheetKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BatchHistorySheetKt.lambda_989088321$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1234306657$app() {
        return lambda$1234306657;
    }

    public final Function2<Composer, Integer, Unit> getLambda$304481546$app() {
        return lambda$304481546;
    }

    public final Function2<Composer, Integer, Unit> getLambda$813361553$app() {
        return lambda$813361553;
    }

    public final Function2<Composer, Integer, Unit> getLambda$989088321$app() {
        return lambda$989088321;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1234306657$lambda$0(RowScope $this$TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C87@3591L34,87@3586L40:BatchHistorySheet.kt#qonjpd");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1234306657, $changed, -1, "com.example.ui.components.ComposableSingletons$BatchHistorySheetKt.lambda$1234306657.<anonymous> (BatchHistorySheet.kt:87)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(R.string.btn_close, $composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_813361553$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C166@6438L11,163@6276L343:BatchHistorySheet.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(813361553, $changed, -1, "com.example.ui.components.ComposableSingletons$BatchHistorySheetKt.lambda$813361553.<anonymous> (BatchHistorySheet.kt:163)");
            }
            IconKt.Icon-ww6aTOc(FolderKt.getFolder(Icons.INSTANCE.getDefault()), (String) null, SizeKt.size-3ABfNKs(PaddingKt.padding-3ABfNKs(Modifier.Companion, Dp.constructor-impl(8)), Dp.constructor-impl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_304481546$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C193@7588L33,194@7668L11,191@7476L233:BatchHistorySheet.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(304481546, $changed, -1, "com.example.ui.components.ComposableSingletons$BatchHistorySheetKt.lambda$304481546.<anonymous> (BatchHistorySheet.kt:191)");
            }
            IconKt.Icon-ww6aTOc(RestoreKt.getRestore(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.btn_load, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_989088321$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C200@7908L35,201@7990L11,198@7797L251:BatchHistorySheet.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(989088321, $changed, -1, "com.example.ui.components.ComposableSingletons$BatchHistorySheetKt.lambda$989088321.<anonymous> (BatchHistorySheet.kt:198)");
            }
            IconKt.Icon-ww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.btn_delete, $composer, 0), (Modifier) null, Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
