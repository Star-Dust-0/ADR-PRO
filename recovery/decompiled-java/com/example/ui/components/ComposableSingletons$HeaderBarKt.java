package com.example.ui.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.HistoryKt;
import androidx.compose.material.icons.filled.ScienceKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material.icons.filled.SyncKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.example.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HeaderBar.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class ComposableSingletons$HeaderBarKt {
    public static final ComposableSingletons$HeaderBarKt INSTANCE = new ComposableSingletons$HeaderBarKt();

    /* renamed from: lambda$-421689445, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f11lambda$421689445 = ComposableLambdaKt.composableLambdaInstance(-421689445, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$HeaderBarKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HeaderBarKt.lambda__421689445$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-32671916, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f10lambda$32671916 = ComposableLambdaKt.composableLambdaInstance(-32671916, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$HeaderBarKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HeaderBarKt.lambda__32671916$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$401159243 = ComposableLambdaKt.composableLambdaInstance(401159243, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$HeaderBarKt$$ExternalSyntheticLambda2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HeaderBarKt.lambda_401159243$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1802278516, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9lambda$1802278516 = ComposableLambdaKt.composableLambdaInstance(-1802278516, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$HeaderBarKt$$ExternalSyntheticLambda3
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HeaderBarKt.lambda__1802278516$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$289251021 = ComposableLambdaKt.composableLambdaInstance(289251021, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$HeaderBarKt$$ExternalSyntheticLambda4
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HeaderBarKt.lambda_289251021$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1802278516$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16getLambda$1802278516$app() {
        return f9lambda$1802278516;
    }

    /* renamed from: getLambda$-32671916$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17getLambda$32671916$app() {
        return f10lambda$32671916;
    }

    /* renamed from: getLambda$-421689445$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18getLambda$421689445$app() {
        return f11lambda$421689445;
    }

    public final Function2<Composer, Integer, Unit> getLambda$289251021$app() {
        return lambda$289251021;
    }

    public final Function2<Composer, Integer, Unit> getLambda$401159243$app() {
        return lambda$401159243;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__421689445$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C83@3233L44,82@3188L338:HeaderBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-421689445, $changed, -1, "com.example.ui.components.ComposableSingletons$HeaderBarKt.lambda$-421689445.<anonymous> (HeaderBar.kt:82)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ele_logo, $composer, 0), "ELE Logo", SizeKt.fillMaxWidth$default(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(16))), 0.0f, 1, (Object) null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, $composer, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__32671916$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C125@5197L38,126@5286L11,123@5080L312:HeaderBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-32671916, $changed, -1, "com.example.ui.components.ComposableSingletons$HeaderBarKt.lambda$-32671916.<anonymous> (HeaderBar.kt:123)");
            }
            IconKt.Icon-ww6aTOc(SyncKt.getSync(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.btn_sync_data, $composer, 0), SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_401159243$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C140@5890L44,141@5985L11,138@5770L330:HeaderBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(401159243, $changed, -1, "com.example.ui.components.ComposableSingletons$HeaderBarKt.lambda$401159243.<anonymous> (HeaderBar.kt:138)");
            }
            IconKt.Icon-ww6aTOc(ScienceKt.getScience(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.demo_button_tooltip, $composer, 0), SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1802278516$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C155@6601L47,156@6699L11,153@6481L333:HeaderBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1802278516, $changed, -1, "com.example.ui.components.ComposableSingletons$HeaderBarKt.lambda$-1802278516.<anonymous> (HeaderBar.kt:153)");
            }
            IconKt.Icon-ww6aTOc(HistoryKt.getHistory(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.history_button_tooltip, $composer, 0), SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_289251021$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C170@7317L48,171@7416L11,168@7196L335:HeaderBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(289251021, $changed, -1, "com.example.ui.components.ComposableSingletons$HeaderBarKt.lambda$289251021.<anonymous> (HeaderBar.kt:168)");
            }
            IconKt.Icon-ww6aTOc(SettingsKt.getSettings(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(R.string.settings_button_tooltip, $composer, 0), SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
