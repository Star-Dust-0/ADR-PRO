package com.example.viewmodel;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.example.BuildConfig;
import com.example.R;
import com.example.data.db.AppDatabase;
import com.example.data.db.BatchDao;
import com.example.data.db.BatchHistoryEntity;
import com.example.data.model.BatchSummaryStats;
import com.example.data.model.CsvSampleItem;
import com.example.data.model.OutputFormat;
import com.example.data.model.TestSubFolder;
import com.example.data.util.CsvParserUtil;
import java.io.File;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CsvAggregatorViewModel.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020HJ\u000e\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u000207J\u0006\u0010L\u001a\u00020HJ\u0006\u0010M\u001a\u00020HJ\u0006\u0010N\u001a\u00020HJ\u000e\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020?J\u000e\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020\fJ\u000e\u0010S\u001a\u00020H2\u0006\u0010T\u001a\u00020\u0015J\u0006\u0010U\u001a\u00020HJ\u0010\u0010V\u001a\u00020H2\b\u0010W\u001a\u0004\u0018\u00010!J\u000e\u0010X\u001a\u00020H2\u0006\u0010Y\u001a\u000207J\u0014\u0010Z\u001a\u00020H2\f\u0010[\u001a\b\u0012\u0004\u0012\u0002070 J\u0006\u0010\\\u001a\u00020HJ\u0006\u0010]\u001a\u00020HJ\b\u0010^\u001a\u00020HH\u0002J\u0018\u0010_\u001a\u00020H2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010`\u001a\u00020\fH\u0002J\b\u0010a\u001a\u00020HH\u0002J.\u0010b\u001a\u00020H2\u0006\u0010\r\u001a\u00020\f2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010d\u001a\u00020%2\u0006\u0010e\u001a\u00020\fH\u0002J\u000e\u0010f\u001a\u00020H2\u0006\u0010g\u001a\u00020hJ\u000e\u0010i\u001a\u00020H2\u0006\u0010g\u001a\u00020hJ\u0016\u0010j\u001a\u00020H2\u0006\u0010g\u001a\u00020h2\u0006\u0010k\u001a\u000207J\u000e\u0010l\u001a\u00020H2\u0006\u0010m\u001a\u00020/J\u000e\u0010n\u001a\u00020H2\u0006\u0010o\u001a\u00020pR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0010R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0010R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0 0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0 0\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0010R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0010R \u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000207060 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\n :*\u0004\u0018\u00010909X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0010R\u001a\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0 0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0 0\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0010R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0010R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0010¨\u0006q"}, d2 = {"Lcom/example/viewmodel/CsvAggregatorViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "db", "Lcom/example/data/db/AppDatabase;", "batchDao", "Lcom/example/data/db/BatchDao;", "_folderName", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "folderName", "Lkotlinx/coroutines/flow/StateFlow;", "getFolderName", "()Lkotlinx/coroutines/flow/StateFlow;", "_targetCell", "targetCell", "getTargetCell", "_outputFormat", "Lcom/example/data/model/OutputFormat;", "outputFormat", "getOutputFormat", "_isProcessing", "", "isProcessing", "_progress", "", "progress", "getProgress", "_extractedItems", "", "Lcom/example/data/model/CsvSampleItem;", "extractedItems", "getExtractedItems", "_summaryStats", "Lcom/example/data/model/BatchSummaryStats;", "summaryStats", "getSummaryStats", "_combinedCsvContent", "combinedCsvContent", "getCombinedCsvContent", "_selectedItemForPreview", "selectedItemForPreview", "getSelectedItemForPreview", "_historyList", "Lcom/example/data/db/BatchHistoryEntity;", "historyList", "getHistoryList", "_toastMessage", "toastMessage", "getToastMessage", "currentLoadedUris", "Lkotlin/Pair;", "Landroid/net/Uri;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "_rootTestUriString", "rootTestUriString", "getRootTestUriString", "_subFoldersList", "Lcom/example/data/model/TestSubFolder;", "subFoldersList", "getSubFoldersList", "_showSyncSheet", "showSyncSheet", "getShowSyncSheet", "_isSyncing", "isSyncing", "openSyncSheet", "", "dismissSyncSheet", "saveRootTestUri", "uri", "clearRootTestUri", "scanRootTestDirectory", "unmountStorage", "mergeSubFolder", "subFolder", "setTargetCell", "cell", "setOutputFormat", "format", "clearToast", "selectItemForPreview", "item", "loadFolderFromUri", "treeUri", "loadMultipleFilesFromUris", "uris", "loadDemoFolder", "combineCurrentBatch", "processLoadedUris", "autoSaveToInternalAdrLog", "csvContent", "rebuildCombinedCsv", "saveToHistoryDb", "items", "stats", "csvOutput", "shareCombinedCsv", "context", "Landroid/content/Context;", "copyToClipboard", "writeCombinedCsvToUri", "destUri", "loadHistoryBatch", "history", "deleteHistoryItem", "id", "", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes4.dex */
public final class CsvAggregatorViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _combinedCsvContent;
    private final MutableStateFlow<List<CsvSampleItem>> _extractedItems;
    private final MutableStateFlow<String> _folderName;
    private final MutableStateFlow<List<BatchHistoryEntity>> _historyList;
    private final MutableStateFlow<Boolean> _isProcessing;
    private final MutableStateFlow<Boolean> _isSyncing;
    private final MutableStateFlow<OutputFormat> _outputFormat;
    private final MutableStateFlow<Float> _progress;
    private final MutableStateFlow<String> _rootTestUriString;
    private final MutableStateFlow<CsvSampleItem> _selectedItemForPreview;
    private final MutableStateFlow<Boolean> _showSyncSheet;
    private final MutableStateFlow<List<TestSubFolder>> _subFoldersList;
    private final MutableStateFlow<BatchSummaryStats> _summaryStats;
    private final MutableStateFlow<String> _targetCell;
    private final MutableStateFlow<String> _toastMessage;
    private final BatchDao batchDao;
    private final StateFlow<String> combinedCsvContent;
    private List<? extends Pair<String, ? extends Uri>> currentLoadedUris;
    private final AppDatabase db;
    private final StateFlow<List<CsvSampleItem>> extractedItems;
    private final StateFlow<String> folderName;
    private final StateFlow<List<BatchHistoryEntity>> historyList;
    private final StateFlow<Boolean> isProcessing;
    private final StateFlow<Boolean> isSyncing;
    private final StateFlow<OutputFormat> outputFormat;
    private final SharedPreferences prefs;
    private final StateFlow<Float> progress;
    private final StateFlow<String> rootTestUriString;
    private final StateFlow<CsvSampleItem> selectedItemForPreview;
    private final StateFlow<Boolean> showSyncSheet;
    private final StateFlow<List<TestSubFolder>> subFoldersList;
    private final StateFlow<BatchSummaryStats> summaryStats;
    private final StateFlow<String> targetCell;
    private final StateFlow<String> toastMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsvAggregatorViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.db = AppDatabase.INSTANCE.getDatabase(application);
        this.batchDao = this.db.batchDao();
        this._folderName = StateFlowKt.MutableStateFlow("");
        this.folderName = FlowKt.asStateFlow(this._folderName);
        this._targetCell = StateFlowKt.MutableStateFlow("B9");
        this.targetCell = FlowKt.asStateFlow(this._targetCell);
        this._outputFormat = StateFlowKt.MutableStateFlow(OutputFormat.SINGLE_COLUMN_ONLY);
        this.outputFormat = FlowKt.asStateFlow(this._outputFormat);
        this._isProcessing = StateFlowKt.MutableStateFlow(false);
        this.isProcessing = FlowKt.asStateFlow(this._isProcessing);
        this._progress = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.progress = FlowKt.asStateFlow(this._progress);
        this._extractedItems = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.extractedItems = FlowKt.asStateFlow(this._extractedItems);
        this._summaryStats = StateFlowKt.MutableStateFlow(new BatchSummaryStats(0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 127, null));
        this.summaryStats = FlowKt.asStateFlow(this._summaryStats);
        this._combinedCsvContent = StateFlowKt.MutableStateFlow("");
        this.combinedCsvContent = FlowKt.asStateFlow(this._combinedCsvContent);
        this._selectedItemForPreview = StateFlowKt.MutableStateFlow((Object) null);
        this.selectedItemForPreview = FlowKt.asStateFlow(this._selectedItemForPreview);
        this._historyList = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.historyList = FlowKt.asStateFlow(this._historyList);
        this._toastMessage = StateFlowKt.MutableStateFlow((Object) null);
        this.toastMessage = FlowKt.asStateFlow(this._toastMessage);
        this.currentLoadedUris = CollectionsKt.emptyList();
        this.prefs = application.getSharedPreferences("ele_adr_pro_prefs", 0);
        this._rootTestUriString = StateFlowKt.MutableStateFlow(this.prefs.getString("saved_root_test_uri", null));
        this.rootTestUriString = FlowKt.asStateFlow(this._rootTestUriString);
        this._subFoldersList = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.subFoldersList = FlowKt.asStateFlow(this._subFoldersList);
        this._showSyncSheet = StateFlowKt.MutableStateFlow(false);
        this.showSyncSheet = FlowKt.asStateFlow(this._showSyncSheet);
        this._isSyncing = StateFlowKt.MutableStateFlow(false);
        this.isSyncing = FlowKt.asStateFlow(this._isSyncing);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(null), 3, (Object) null);
        if (this._rootTestUriString.getValue() == null) {
            return;
        }
        scanRootTestDirectory();
    }

    public final StateFlow<String> getFolderName() {
        return this.folderName;
    }

    public final StateFlow<String> getTargetCell() {
        return this.targetCell;
    }

    public final StateFlow<OutputFormat> getOutputFormat() {
        return this.outputFormat;
    }

    public final StateFlow<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final StateFlow<Float> getProgress() {
        return this.progress;
    }

    public final StateFlow<List<CsvSampleItem>> getExtractedItems() {
        return this.extractedItems;
    }

    public final StateFlow<BatchSummaryStats> getSummaryStats() {
        return this.summaryStats;
    }

    public final StateFlow<String> getCombinedCsvContent() {
        return this.combinedCsvContent;
    }

    public final StateFlow<CsvSampleItem> getSelectedItemForPreview() {
        return this.selectedItemForPreview;
    }

    public final StateFlow<List<BatchHistoryEntity>> getHistoryList() {
        return this.historyList;
    }

    public final StateFlow<String> getToastMessage() {
        return this.toastMessage;
    }

    public final StateFlow<String> getRootTestUriString() {
        return this.rootTestUriString;
    }

    public final StateFlow<List<TestSubFolder>> getSubFoldersList() {
        return this.subFoldersList;
    }

    public final StateFlow<Boolean> getShowSyncSheet() {
        return this.showSyncSheet;
    }

    public final StateFlow<Boolean> isSyncing() {
        return this.isSyncing;
    }

    /* compiled from: CsvAggregatorViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$1", f = "CsvAggregatorViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.viewmodel.CsvAggregatorViewModel$1, reason: invalid class name */
    /* loaded from: /tmp/dex/classes4.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CsvAggregatorViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "list", "", "Lcom/example/data/db/BatchHistoryEntity;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$1$1", f = "CsvAggregatorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.example.viewmodel.CsvAggregatorViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: /tmp/dex/classes4.dex */
        public static final class C00001 extends SuspendLambda implements Function2<List<? extends BatchHistoryEntity>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CsvAggregatorViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00001(CsvAggregatorViewModel csvAggregatorViewModel, Continuation<? super C00001> continuation) {
                super(2, continuation);
                this.this$0 = csvAggregatorViewModel;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                Continuation<Unit> c00001 = new C00001(this.this$0, continuation);
                c00001.L$0 = obj;
                return c00001;
            }

            public final Object invoke(List<BatchHistoryEntity> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object $result) {
                List list = (List) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.this$0._historyList.setValue(list);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (FlowKt.collectLatest(CsvAggregatorViewModel.this.batchDao.getAllBatches(), new C00001(CsvAggregatorViewModel.this, null), (Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case BuildConfig.VERSION_CODE /* 1 */:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final void openSyncSheet() {
        this._showSyncSheet.setValue(true);
        scanRootTestDirectory();
    }

    public final void dismissSyncSheet() {
        this._showSyncSheet.setValue(false);
    }

    public final void saveRootTestUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Application context = getApplication();
        try {
            context.getContentResolver().takePersistableUriPermission(uri, 3);
        } catch (Exception e) {
        }
        this.prefs.edit().putString("saved_root_test_uri", uri.toString()).apply();
        this._rootTestUriString.setValue(uri.toString());
        this._toastMessage.setValue(context.getString(R.string.toast_root_saved));
        scanRootTestDirectory();
        this._showSyncSheet.setValue(true);
    }

    public final void clearRootTestUri() {
        this.prefs.edit().remove("saved_root_test_uri").apply();
        this._rootTestUriString.setValue((Object) null);
        this._subFoldersList.setValue(CollectionsKt.emptyList());
    }

    public final void scanRootTestDirectory() {
        String uriStr = (String) this._rootTestUriString.getValue();
        if (uriStr == null) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$scanRootTestDirectory$1(this, uriStr, null), 2, (Object) null);
    }

    public final void unmountStorage() {
        Application context = getApplication();
        String str = (String) this._rootTestUriString.getValue();
        if (str != null) {
            try {
                context.getContentResolver().releasePersistableUriPermission(Uri.parse(str), 3);
            } catch (Exception e) {
            }
        }
        this.prefs.edit().remove("saved_root_test_uri").apply();
        this._rootTestUriString.setValue((Object) null);
        this._subFoldersList.setValue(CollectionsKt.emptyList());
        this._folderName.setValue("");
        this._extractedItems.setValue(CollectionsKt.emptyList());
        this._combinedCsvContent.setValue("");
        this._summaryStats.setValue(new BatchSummaryStats(0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 127, null));
        this._selectedItemForPreview.setValue((Object) null);
        this.currentLoadedUris = CollectionsKt.emptyList();
        this._toastMessage.setValue("Storage unmounted successfully");
    }

    public final void mergeSubFolder(TestSubFolder subFolder) {
        Intrinsics.checkNotNullParameter(subFolder, "subFolder");
        Uri uri = Uri.parse(subFolder.getUriString());
        Intrinsics.checkNotNull(uri);
        loadFolderFromUri(uri);
        this._showSyncSheet.setValue(false);
    }

    public final void setTargetCell(String cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        String clean = StringsKt.trim(cell).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(clean, "toUpperCase(...)");
        this._targetCell.setValue(clean.length() == 0 ? "B9" : clean);
        if (!this.currentLoadedUris.isEmpty()) {
            processLoadedUris();
        }
    }

    public final void setOutputFormat(OutputFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this._outputFormat.setValue(format);
        rebuildCombinedCsv();
    }

    public final void clearToast() {
        this._toastMessage.setValue((Object) null);
    }

    public final void selectItemForPreview(CsvSampleItem item) {
        this._selectedItemForPreview.setValue(item);
    }

    public final void loadFolderFromUri(Uri treeUri) {
        Intrinsics.checkNotNullParameter(treeUri, "treeUri");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$loadFolderFromUri$1(this, treeUri, null), 2, (Object) null);
    }

    public final void loadMultipleFilesFromUris(List<? extends Uri> uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        if (uris.isEmpty()) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$loadMultipleFilesFromUris$1(this, uris, null), 2, (Object) null);
    }

    public final void loadDemoFolder() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$loadDemoFolder$1(this, null), 2, (Object) null);
    }

    public final void combineCurrentBatch() {
        if (this.currentLoadedUris.isEmpty()) {
            this._toastMessage.setValue("Please select a folder containing CSV files first");
        } else {
            processLoadedUris();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processLoadedUris() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$processLoadedUris$1(this, null), 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoSaveToInternalAdrLog(String folderName, String csvContent) {
        if (StringsKt.isBlank(csvContent)) {
            return;
        }
        try {
            getApplication();
            String replace = new Regex("[^a-zA-Z0-9_\\-]").replace(folderName, "_");
            if (replace.length() == 0) {
                replace = "LOG";
            }
            String safeFolderName = replace;
            String timeStr = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
            String fileName = safeFolderName + "_" + timeStr + ".csv";
            try {
                File docsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
                File publicAdrLogDir = new File(docsDir, "ADR LOG");
                if (!publicAdrLogDir.exists()) {
                    publicAdrLogDir.mkdirs();
                }
                FilesKt.writeText(new File(publicAdrLogDir, fileName), csvContent, Charsets.UTF_8);
                this._toastMessage.setValue("Merged and auto-saved to Documents/ADR LOG");
            } catch (Exception e) {
                try {
                    File downDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    File publicAdrLogDir2 = new File(downDir, "ADR LOG");
                    if (!publicAdrLogDir2.exists()) {
                        publicAdrLogDir2.mkdirs();
                    }
                    FilesKt.writeText(new File(publicAdrLogDir2, fileName), csvContent, Charsets.UTF_8);
                    this._toastMessage.setValue("Merged and auto-saved to Download/ADR LOG");
                } catch (Exception e2) {
                    this._toastMessage.setValue("Merged successfully (" + folderName + "). Could not save to public folder.");
                }
            }
        } catch (Exception e3) {
            this._toastMessage.setValue("Merged successfully (" + folderName + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebuildCombinedCsv() {
        List items = (List) this._extractedItems.getValue();
        String csvStr = CsvParserUtil.INSTANCE.buildCombinedCsvString(items, (String) this._targetCell.getValue(), (OutputFormat) this._outputFormat.getValue());
        this._combinedCsvContent.setValue(csvStr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveToHistoryDb(String folderName, List<CsvSampleItem> items, BatchSummaryStats stats, String csvOutput) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$saveToHistoryDb$1(items, folderName, stats, this, csvOutput, null), 2, (Object) null);
    }

    public final void shareCombinedCsv(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String content = (String) this._combinedCsvContent.getValue();
        if (content.length() == 0) {
            this._toastMessage.setValue("No content to merge and share");
            return;
        }
        try {
            CharSequence charSequence = (CharSequence) this._folderName.getValue();
            if (charSequence.length() == 0) {
                charSequence = "29_07_26";
            }
            String folder = (String) charSequence;
            String timeStr = new SimpleDateFormat("yyyyMMdd_HHmm", Locale.US).format(new Date());
            String tempFileName = "Compression_Merge_" + folder + "_" + timeStr + ".csv";
            File file = new File(context.getCacheDir(), tempFileName);
            FilesKt.writeText(file, content, Charsets.UTF_8);
            Uri uri = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/csv");
            intent.putExtra("android.intent.extra.SUBJECT", "Compression Files Merger Results - " + folder);
            intent.putExtra("android.intent.extra.TEXT", "Extracted cell " + this._targetCell.getValue() + " values for " + ((BatchSummaryStats) this.summaryStats.getValue()).getTotalFiles() + " samples from folder " + folder);
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, "Share Merged CSV File"));
        } catch (Exception e) {
            this._toastMessage.setValue("Failed to share: " + e.getLocalizedMessage());
        }
    }

    public final void copyToClipboard(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String content = (String) this._combinedCsvContent.getValue();
        if (content.length() == 0) {
            this._toastMessage.setValue("No data to copy");
            return;
        }
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboard = (ClipboardManager) systemService;
        ClipData clip = ClipData.newPlainText("Merged Results", content);
        clipboard.setPrimaryClip(clip);
        this._toastMessage.setValue("Successfully copied B9 results to clipboard");
    }

    public final void writeCombinedCsvToUri(Context context, Uri destUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destUri, "destUri");
        try {
            String content = (String) this._combinedCsvContent.getValue();
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(destUri);
            if (openOutputStream != null) {
                OutputStream outputStream = openOutputStream;
                try {
                    byte[] bytes = content.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    outputStream.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, (Throwable) null);
                } finally {
                }
            }
            this._toastMessage.setValue("File saved successfully");
        } catch (Exception e) {
            this._toastMessage.setValue("Error saving: " + e.getLocalizedMessage());
        }
    }

    public final void loadHistoryBatch(BatchHistoryEntity history) {
        Intrinsics.checkNotNullParameter(history, "history");
        this._folderName.setValue(history.getFolderName());
        this._targetCell.setValue(history.getTargetCell());
        this._combinedCsvContent.setValue(history.getCsvOutputText());
        this._toastMessage.setValue("Loaded history for " + history.getFolderName());
    }

    public final void deleteHistoryItem(long id) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((ViewModel) this), Dispatchers.getIO(), (CoroutineStart) null, new CsvAggregatorViewModel$deleteHistoryItem$1(this, id, null), 2, (Object) null);
    }
}
