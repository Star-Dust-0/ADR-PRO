package com.example.ui.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "MyApplicationTheme", "", "darkTheme", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes3.dex */
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.darkColorScheme-C-Xl9yA$default(ColorKt.getTealPrimary(), ColorKt.getOneUiCardLight(), ColorKt.getTealPrimaryDark(), ColorKt.getTealPrimaryLight(), 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorKt.getOneUiSurfaceDark(), ColorKt.getOneUiTextPrimaryDark(), ColorKt.getOneUiCardDark(), ColorKt.getOneUiTextPrimaryDark(), ColorKt.getOneUiSurfaceDark(), ColorKt.getOneUiTextSecondaryDark(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -516112, 15, (Object) null);
    private static final ColorScheme LightColorScheme = ColorSchemeKt.lightColorScheme-C-Xl9yA$default(ColorKt.getTealPrimary(), ColorKt.getOneUiCardLight(), ColorKt.getTealPrimaryLight(), ColorKt.getTealPrimaryDark(), 0, 0, 0, 0, 0, 0, 0, 0, 0, ColorKt.getOneUiSurfaceLight(), ColorKt.getOneUiTextPrimary(), ColorKt.getOneUiCardLight(), ColorKt.getOneUiTextPrimary(), ColorKt.getOneUiSurfaceLight(), ColorKt.getOneUiTextSecondary(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -516112, 15, (Object) null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$0(boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        MyApplicationTheme(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MyApplicationTheme(final boolean darkTheme, Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        final Function2 content;
        Intrinsics.checkNotNullParameter(function2, "content");
        Composer $composer2 = $composer.startRestartGroup(-2046409659);
        ComposerKt.sourceInformation($composer2, "C(MyApplicationTheme)P(1)41@1315L114:Theme.kt#75kw8w");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ((i & 1) == 0 && $composer2.changed(darkTheme)) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            content = function2;
        } else {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "36@1172L21");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty &= -15;
                }
            } else if ((i & 1) != 0) {
                darkTheme = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
                $dirty &= -15;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2046409659, $dirty, -1, "com.example.ui.theme.MyApplicationTheme (Theme.kt:38)");
            }
            ColorScheme colorScheme = darkTheme ? DarkColorScheme : LightColorScheme;
            content = function2;
            MaterialThemeKt.MaterialTheme(colorScheme, (Shapes) null, TypeKt.getTypography(), content, $composer2, (($dirty << 6) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.MyApplicationTheme$lambda$0(darkTheme, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
