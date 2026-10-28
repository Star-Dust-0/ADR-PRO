package com.example.ui.screens;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.example.data.db.BatchHistoryEntity;
import com.example.data.model.CsvSampleItem;
import com.example.data.model.OutputFormat;
import com.example.data.model.TestSubFolder;
import com.example.viewmodel.CsvAggregatorViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainHomeScreen.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\tX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\u0010\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"MainHomeScreen", "", "viewModel", "Lcom/example/viewmodel/CsvAggregatorViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/viewmodel/CsvAggregatorViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "folderName", "", "targetCell", "outputFormat", "Lcom/example/data/model/OutputFormat;", "isProcessing", "", "progress", "", "extractedItems", "", "Lcom/example/data/model/CsvSampleItem;", "combinedCsvContent", "selectedItemForPreview", "historyList", "Lcom/example/data/db/BatchHistoryEntity;", "toastMessage", "rootTestUriString", "subFoldersList", "Lcom/example/data/model/TestSubFolder;", "showSyncSheet", "isSyncing", "showSettingsDialog", "showHistorySheet"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes6.dex */
public final class MainHomeScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$81(CsvAggregatorViewModel csvAggregatorViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainHomeScreen(csvAggregatorViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0548  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MainHomeScreen(final com.example.viewmodel.CsvAggregatorViewModel r52, androidx.compose.ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MainHomeScreenKt.MainHomeScreen(com.example.viewmodel.CsvAggregatorViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String MainHomeScreen$lambda$1(State<String> state) {
        return (String) state.getValue();
    }

    private static final String MainHomeScreen$lambda$2(State<String> state) {
        return (String) state.getValue();
    }

    private static final OutputFormat MainHomeScreen$lambda$3(State<? extends OutputFormat> state) {
        return (OutputFormat) state.getValue();
    }

    private static final boolean MainHomeScreen$lambda$4(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final float MainHomeScreen$lambda$5(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final List<CsvSampleItem> MainHomeScreen$lambda$6(State<? extends List<CsvSampleItem>> state) {
        return (List) state.getValue();
    }

    private static final String MainHomeScreen$lambda$7(State<String> state) {
        return (String) state.getValue();
    }

    private static final CsvSampleItem MainHomeScreen$lambda$8(State<CsvSampleItem> state) {
        return (CsvSampleItem) state.getValue();
    }

    private static final List<BatchHistoryEntity> MainHomeScreen$lambda$9(State<? extends List<BatchHistoryEntity>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MainHomeScreen$lambda$10(State<String> state) {
        return (String) state.getValue();
    }

    private static final String MainHomeScreen$lambda$11(State<String> state) {
        return (String) state.getValue();
    }

    private static final List<TestSubFolder> MainHomeScreen$lambda$12(State<? extends List<TestSubFolder>> state) {
        return (List) state.getValue();
    }

    private static final boolean MainHomeScreen$lambda$13(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean MainHomeScreen$lambda$14(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean MainHomeScreen$lambda$16(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void MainHomeScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MainHomeScreen$lambda$19(MutableState<Boolean> mutableState) {
        return ((Boolean) ((State) mutableState).getValue()).booleanValue();
    }

    private static final void MainHomeScreen$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$24$lambda$23(CsvAggregatorViewModel $viewModel, Uri uri) {
        if (uri != null) {
            $viewModel.loadFolderFromUri(uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$26$lambda$25(CsvAggregatorViewModel $viewModel, List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        if (!uris.isEmpty()) {
            $viewModel.loadMultipleFilesFromUris(uris);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$29$lambda$28(CsvAggregatorViewModel $viewModel, Context $context, Uri uri) {
        if (uri != null) {
            $viewModel.writeCombinedCsvToUri($context, uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$30(SnackbarHostState $snackbarHostState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C197@4672L43:MainHomeScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-732628034, $changed, -1, "com.example.ui.screens.MainHomeScreen.<anonymous> (MainHomeScreen.kt:197)");
            }
            SnackbarHostKt.SnackbarHost($snackbarHostState, (Modifier) null, (Function3) null, $composer, 6, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0281 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MainHomeScreen$lambda$57(final com.example.viewmodel.CsvAggregatorViewModel r51, final androidx.activity.compose.ManagedActivityResultLauncher r52, final androidx.activity.compose.ManagedActivityResultLauncher r53, final androidx.compose.runtime.State r54, androidx.compose.runtime.State r55, androidx.compose.runtime.State r56, androidx.compose.runtime.State r57, androidx.compose.runtime.State r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final android.content.Context r61, final androidx.activity.compose.ManagedActivityResultLauncher r62, final androidx.compose.runtime.State r63, androidx.compose.runtime.State r64, androidx.compose.foundation.layout.PaddingValues r65, androidx.compose.runtime.Composer r66, int r67) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MainHomeScreenKt.MainHomeScreen$lambda$57(com.example.viewmodel.CsvAggregatorViewModel, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$32$lambda$31(CsvAggregatorViewModel $viewModel) {
        $viewModel.openSyncSheet();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$34$lambda$33(ManagedActivityResultLauncher $openFolderLauncher) {
        $openFolderLauncher.launch((Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$36$lambda$35(ManagedActivityResultLauncher $openFilesLauncher) {
        $openFilesLauncher.launch(new String[]{"text/*", "text/comma-separated-values", "application/csv", "*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$38$lambda$37(CsvAggregatorViewModel $viewModel) {
        $viewModel.combineCurrentBatch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$40$lambda$39(MutableState $showSettingsDialog$delegate) {
        MainHomeScreen$lambda$17($showSettingsDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$42$lambda$41(MutableState $showHistorySheet$delegate) {
        MainHomeScreen$lambda$20($showHistorySheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$44$lambda$43(CsvAggregatorViewModel $viewModel) {
        $viewModel.unmountStorage();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MainHomeScreen$lambda$57$lambda$56$lambda$51(final com.example.viewmodel.CsvAggregatorViewModel r39, final android.content.Context r40, final androidx.compose.runtime.State r41, final androidx.activity.compose.ManagedActivityResultLauncher r42, androidx.compose.runtime.State r43, androidx.compose.animation.AnimatedVisibilityScope r44, androidx.compose.runtime.Composer r45, int r46) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.MainHomeScreenKt.MainHomeScreen$lambda$57$lambda$56$lambda$51(com.example.viewmodel.CsvAggregatorViewModel, android.content.Context, androidx.compose.runtime.State, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.State, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$51$lambda$50$lambda$46$lambda$45(CsvAggregatorViewModel $viewModel, Context $context) {
        $viewModel.shareCombinedCsv($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$51$lambda$50$lambda$49$lambda$48(ManagedActivityResultLauncher $createCsvLauncher, State $folderName$delegate) {
        String timeStr = new SimpleDateFormat("yyyyMMdd_HHmm", Locale.US).format(new Date());
        String MainHomeScreen$lambda$1 = MainHomeScreen$lambda$1($folderName$delegate);
        if (MainHomeScreen$lambda$1.length() == 0) {
            MainHomeScreen$lambda$1 = "29_07_26";
        }
        String defaultName = "Merge_" + ((Object) MainHomeScreen$lambda$1) + "_" + timeStr + ".csv";
        $createCsvLauncher.launch(defaultName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$53$lambda$52(CsvAggregatorViewModel $viewModel, OutputFormat it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.setOutputFormat(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$57$lambda$56$lambda$55$lambda$54(CsvAggregatorViewModel $viewModel, CsvSampleItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.selectItemForPreview(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$60$lambda$59$lambda$58(CsvAggregatorViewModel $viewModel) {
        $viewModel.selectItemForPreview(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$62$lambda$61(CsvAggregatorViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.setTargetCell(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$64$lambda$63(MutableState $showSettingsDialog$delegate) {
        MainHomeScreen$lambda$17($showSettingsDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$66$lambda$65(CsvAggregatorViewModel $viewModel, BatchHistoryEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.loadHistoryBatch(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$68$lambda$67(CsvAggregatorViewModel $viewModel, long it) {
        $viewModel.deleteHistoryItem(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$70$lambda$69(MutableState $showHistorySheet$delegate) {
        MainHomeScreen$lambda$20($showHistorySheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$72$lambda$71(CsvAggregatorViewModel $viewModel) {
        $viewModel.dismissSyncSheet();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$74$lambda$73(CsvAggregatorViewModel $viewModel, Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.saveRootTestUri(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$76$lambda$75(CsvAggregatorViewModel $viewModel) {
        $viewModel.scanRootTestDirectory();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$78$lambda$77(CsvAggregatorViewModel $viewModel, TestSubFolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.mergeSubFolder(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MainHomeScreen$lambda$80$lambda$79(CsvAggregatorViewModel $viewModel) {
        $viewModel.unmountStorage();
        return Unit.INSTANCE;
    }
}
