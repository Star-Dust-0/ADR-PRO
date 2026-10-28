package com.example.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.example.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: AppDatabase_Impl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00100\u000eH\u0014J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f0\u0012H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/example/data/db/AppDatabase_Impl;", "Lcom/example/data/db/AppDatabase;", "<init>", "()V", "_batchDao", "Lkotlin/Lazy;", "Lcom/example/data/db/BatchDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "batchDao", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes4.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final int $stable = 8;
    private final Lazy<BatchDao> _batchDao = LazyKt.lazy(new Function0() { // from class: com.example.data.db.AppDatabase_Impl$$ExternalSyntheticLambda0
        public final Object invoke() {
            return AppDatabase_Impl._batchDao$lambda$0(AppDatabase_Impl.this);
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final BatchDao_Impl _batchDao$lambda$0(AppDatabase_Impl this$0) {
        return new BatchDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: createOpenDelegate, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate m3createOpenDelegate() {
        RoomOpenDelegate _openDelegate = new RoomOpenDelegate() { // from class: com.example.data.db.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1, "cd9af46ff0b4aae198d04ebe3221afeb", "b1a61c66cfe7dafae6e60479efd8e9a6");
            }

            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `batch_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `folderName` TEXT NOT NULL, `processedTimestamp` INTEGER NOT NULL, `sampleCount` INTEGER NOT NULL, `targetCell` TEXT NOT NULL, `summaryAverage` REAL NOT NULL, `summaryMax` REAL NOT NULL, `summaryMin` REAL NOT NULL, `extractedValuesJson` TEXT NOT NULL, `csvOutputText` TEXT NOT NULL)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cd9af46ff0b4aae198d04ebe3221afeb')");
            }

            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `batch_history`");
            }

            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                AppDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Map _columnsBatchHistory = new LinkedHashMap();
                _columnsBatchHistory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, (String) null, 1));
                _columnsBatchHistory.put("folderName", new TableInfo.Column("folderName", "TEXT", true, 0, (String) null, 1));
                _columnsBatchHistory.put("processedTimestamp", new TableInfo.Column("processedTimestamp", "INTEGER", true, 0, (String) null, 1));
                _columnsBatchHistory.put("sampleCount", new TableInfo.Column("sampleCount", "INTEGER", true, 0, (String) null, 1));
                _columnsBatchHistory.put("targetCell", new TableInfo.Column("targetCell", "TEXT", true, 0, (String) null, 1));
                _columnsBatchHistory.put("summaryAverage", new TableInfo.Column("summaryAverage", "REAL", true, 0, (String) null, 1));
                _columnsBatchHistory.put("summaryMax", new TableInfo.Column("summaryMax", "REAL", true, 0, (String) null, 1));
                _columnsBatchHistory.put("summaryMin", new TableInfo.Column("summaryMin", "REAL", true, 0, (String) null, 1));
                _columnsBatchHistory.put("extractedValuesJson", new TableInfo.Column("extractedValuesJson", "TEXT", true, 0, (String) null, 1));
                _columnsBatchHistory.put("csvOutputText", new TableInfo.Column("csvOutputText", "TEXT", true, 0, (String) null, 1));
                Set _foreignKeysBatchHistory = new LinkedHashSet();
                Set _indicesBatchHistory = new LinkedHashSet();
                TableInfo _infoBatchHistory = new TableInfo("batch_history", _columnsBatchHistory, _foreignKeysBatchHistory, _indicesBatchHistory);
                TableInfo _existingBatchHistory = TableInfo.Companion.read(connection, "batch_history");
                if (!_infoBatchHistory.equals(_existingBatchHistory)) {
                    return new RoomOpenDelegate.ValidationResult(false, "batch_history(com.example.data.db.BatchHistoryEntity).\n Expected:\n" + _infoBatchHistory + "\n Found:\n" + _existingBatchHistory);
                }
                return new RoomOpenDelegate.ValidationResult(true, (String) null);
            }
        };
        return _openDelegate;
    }

    protected InvalidationTracker createInvalidationTracker() {
        Map _shadowTablesMap = new LinkedHashMap();
        Map _viewTables = new LinkedHashMap();
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, new String[]{"batch_history"});
    }

    public void clearAllTables() {
        super.performClear(false, new String[]{"batch_history"});
    }

    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Map _typeConvertersMap = new LinkedHashMap();
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(BatchDao.class), BatchDao_Impl.INSTANCE.getRequiredConverters());
        return _typeConvertersMap;
    }

    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set _autoMigrationSpecsSet = new LinkedHashSet();
        return _autoMigrationSpecsSet;
    }

    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // com.example.data.db.AppDatabase
    public BatchDao batchDao() {
        return (BatchDao) this._batchDao.getValue();
    }
}
