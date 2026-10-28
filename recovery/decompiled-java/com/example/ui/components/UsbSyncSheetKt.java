package com.example.ui.components;

import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.example.data.model.TestSubFolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UsbSyncSheet.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\u000e\u0010\u0014\u001a\u00020\b*\u0004\u0018\u00010\u0003H\u0002\u001a#\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"UsbSyncSheet", "", "rootUriString", "", "subFolders", "", "Lcom/example/data/model/TestSubFolder;", "isSyncing", "", "onDismiss", "Lkotlin/Function0;", "onSelectRootUri", "Lkotlin/Function1;", "Landroid/net/Uri;", "onRescan", "onMergeSubFolder", "onUnmountStorage", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isNull_or_empty", "SubFolderCardItem", "folder", "onMerge", "(Lcom/example/data/model/TestSubFolder;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes8.dex */
public final class UsbSyncSheetKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SubFolderCardItem$lambda$35(TestSubFolder testSubFolder, Function0 function0, int i, Composer composer, int i2) {
        SubFolderCardItem(testSubFolder, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UsbSyncSheet$lambda$27(String str, List list, boolean z, Function0 function0, Function1 function1, Function0 function02, Function1 function12, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UsbSyncSheet(str, list, z, function0, function1, function02, function12, function03, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void UsbSyncSheet(final java.lang.String r23, final java.util.List<com.example.data.model.TestSubFolder> r24, final boolean r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, final kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, final kotlin.jvm.functions.Function1<? super com.example.data.model.TestSubFolder, kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.UsbSyncSheetKt.UsbSyncSheet(java.lang.String, java.util.List, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UsbSyncSheet$lambda$2$lambda$1(Function1 $onSelectRootUri, Uri uri) {
        if (uri != null) {
            $onSelectRootUri.invoke(uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0612 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x09da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit UsbSyncSheet$lambda$26(java.lang.String r149, final boolean r150, final java.util.List r151, final kotlin.jvm.functions.Function1 r152, kotlin.jvm.functions.Function0 r153, final androidx.activity.compose.ManagedActivityResultLauncher r154, final kotlin.jvm.functions.Function0 r155, final kotlin.jvm.functions.Function0 r156, androidx.compose.foundation.layout.ColumnScope r157, androidx.compose.runtime.Composer r158, int r159) {
        /*
            Method dump skipped, instructions count: 3112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.UsbSyncSheetKt.UsbSyncSheet$lambda$26(java.lang.String, boolean, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.activity.compose.ManagedActivityResultLauncher, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit UsbSyncSheet$lambda$26$lambda$25$lambda$10(final androidx.activity.compose.ManagedActivityResultLauncher r86, androidx.compose.runtime.Composer r87, int r88) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.UsbSyncSheetKt.UsbSyncSheet$lambda$26$lambda$25$lambda$10(androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UsbSyncSheet$lambda$26$lambda$25$lambda$10$lambda$9$lambda$8$lambda$7(ManagedActivityResultLauncher $rootFolderPickerLauncher) {
        $rootFolderPickerLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit UsbSyncSheet$lambda$26$lambda$25$lambda$18(kotlin.jvm.functions.Function0 r117, final boolean r118, final androidx.activity.compose.ManagedActivityResultLauncher r119, kotlin.jvm.functions.Function0 r120, androidx.compose.runtime.Composer r121, int r122) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.UsbSyncSheetKt.UsbSyncSheet$lambda$26$lambda$25$lambda$18(kotlin.jvm.functions.Function0, boolean, androidx.activity.compose.ManagedActivityResultLauncher, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UsbSyncSheet$lambda$26$lambda$25$lambda$18$lambda$17$lambda$16$lambda$12(boolean $isSyncing, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:UsbSyncSheet.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1708780409, $changed, -1, "com.example.ui.components.UsbSyncSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UsbSyncSheet.kt:218)");
            }
            if ($isSyncing) {
                $composer.startReplaceGroup(1970248229);
                ComposerKt.sourceInformation($composer, "219@10166L78");
                ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, Dp.constructor-impl(18)), 0L, Dp.constructor-impl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1970409026);
                ComposerKt.sourceInformation($composer, "224@10538L11,221@10322L273");
                IconKt.Icon-ww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "Refresh", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary-0d7_KjU(), $composer, 48, 4);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UsbSyncSheet$lambda$26$lambda$25$lambda$18$lambda$17$lambda$16$lambda$14$lambda$13(ManagedActivityResultLauncher $rootFolderPickerLauncher) {
        $rootFolderPickerLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit UsbSyncSheet$lambda$26$lambda$25$lambda$24$lambda$23(final List $subFolders, final Function1 $onMergeSubFolder, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.example.ui.components.UsbSyncSheetKt$UsbSyncSheet$lambda$26$lambda$25$lambda$24$lambda$23$$inlined$items$default$1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return m26invoke((TestSubFolder) p1);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final Void m26invoke(TestSubFolder testSubFolder) {
                return null;
            }
        };
        $this$LazyColumn.items($subFolders.size(), (Function1) null, new Function1<Integer, Object>() { // from class: com.example.ui.components.UsbSyncSheetKt$UsbSyncSheet$lambda$26$lambda$25$lambda$24$lambda$23$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke(((Number) p1).intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($subFolders.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.components.UsbSyncSheetKt$UsbSyncSheet$lambda$26$lambda$25$lambda$24$lambda$23$$inlined$items$default$4
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
                final TestSubFolder testSubFolder = (TestSubFolder) $subFolders.get(it);
                $composer.startReplaceGroup(-378425726);
                ComposerKt.sourceInformation($composer, "C*304@14204L28,302@14102L156:UsbSyncSheet.kt#qonjpd");
                ComposerKt.sourceInformationMarkerStart($composer, -1536224799, "CC(remember):UsbSyncSheet.kt#9igjgp");
                boolean changed = ((((i & 112) ^ 48) > 32 && $composer.changed(testSubFolder)) || (i & 48) == 32) | $composer.changed($onMergeSubFolder);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    final Function1 function12 = $onMergeSubFolder;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.components.UsbSyncSheetKt$UsbSyncSheet$1$1$6$1$1$1$1
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m27invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m27invoke() {
                            function12.invoke(testSubFolder);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UsbSyncSheetKt.SubFolderCardItem(testSubFolder, (Function0) obj, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final boolean isNull_or_empty(String $this$isNull_or_empty) {
        if ($this$isNull_or_empty != null) {
            return $this$isNull_or_empty.length() == 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubFolderCardItem(final TestSubFolder folder, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Object obj;
        Composer $composer2 = $composer.startRestartGroup(-1165123108);
        ComposerKt.sourceInformation($composer2, "C(SubFolderCardItem)325@14658L13,327@14746L11,329@14876L11,330@14929L2505,322@14570L2864:UsbSyncSheet.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(folder) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165123108, $dirty, -1, "com.example.ui.components.SubFolderCardItem (UsbSyncSheet.kt:321)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1303163561, "CC(remember):UsbSyncSheet.kt#9igjgp");
            boolean z = ($dirty & 112) == 32;
            Object rememberedValue = $composer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.components.UsbSyncSheetKt$$ExternalSyntheticLambda0
                    public final Object invoke() {
                        return UsbSyncSheetKt.SubFolderCardItem$lambda$29$lambda$28(function0);
                    }
                };
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SurfaceKt.Surface-T9BRK9s(ClickableKt.clickable-XHw0xAI$default(fillMaxWidth$default, false, (String) null, (Role) null, (Function0) obj, 7, (Object) null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl(14)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface-0d7_KjU(), 0L, Dp.constructor-impl(2), 0.0f, BorderStrokeKt.BorderStroke-cXLIe8U(Dp.constructor-impl(1), Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), ComposableLambdaKt.rememberComposableLambda(-1827562889, true, new Function2() { // from class: com.example.ui.components.UsbSyncSheetKt$$ExternalSyntheticLambda3
                public final Object invoke(Object obj2, Object obj3) {
                    return UsbSyncSheetKt.SubFolderCardItem$lambda$34(function0, folder, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 12607488, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.UsbSyncSheetKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2, Object obj3) {
                    return UsbSyncSheetKt.SubFolderCardItem$lambda$35(TestSubFolder.this, function0, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SubFolderCardItem$lambda$29$lambda$28(Function0 $onMerge) {
        $onMerge.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SubFolderCardItem$lambda$34(kotlin.jvm.functions.Function0 r127, com.example.data.model.TestSubFolder r128, androidx.compose.runtime.Composer r129, int r130) {
        /*
            Method dump skipped, instructions count: 1713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.UsbSyncSheetKt.SubFolderCardItem$lambda$34(kotlin.jvm.functions.Function0, com.example.data.model.TestSubFolder, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
