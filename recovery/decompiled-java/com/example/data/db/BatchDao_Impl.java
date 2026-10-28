package com.example.data.db;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.example.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BatchDao_Impl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/example/data/db/BatchDao_Impl;", "Lcom/example/data/db/BatchDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfBatchHistoryEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/db/BatchHistoryEntity;", "insertBatch", "", "batch", "(Lcom/example/data/db/BatchHistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBatches", "Lkotlinx/coroutines/flow/Flow;", "", "deleteBatch", "", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllBatches", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes4.dex */
public final class BatchDao_Impl implements BatchDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<BatchHistoryEntity> __insertAdapterOfBatchHistoryEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public BatchDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfBatchHistoryEntity = new EntityInsertAdapter<BatchHistoryEntity>() { // from class: com.example.data.db.BatchDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `batch_history` (`id`,`folderName`,`processedTimestamp`,`sampleCount`,`targetCell`,`summaryAverage`,`summaryMax`,`summaryMin`,`extractedValuesJson`,`csvOutputText`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, BatchHistoryEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindLong(1, entity.getId());
                statement.bindText(2, entity.getFolderName());
                statement.bindLong(3, entity.getProcessedTimestamp());
                statement.bindLong(4, entity.getSampleCount());
                statement.bindText(5, entity.getTargetCell());
                statement.bindDouble(6, entity.getSummaryAverage());
                statement.bindDouble(7, entity.getSummaryMax());
                statement.bindDouble(8, entity.getSummaryMin());
                statement.bindText(9, entity.getExtractedValuesJson());
                statement.bindText(10, entity.getCsvOutputText());
            }
        };
    }

    @Override // com.example.data.db.BatchDao
    public Object insertBatch(final BatchHistoryEntity batch, Continuation<? super Long> continuation) {
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.db.BatchDao_Impl$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return Long.valueOf(BatchDao_Impl.insertBatch$lambda$0(BatchDao_Impl.this, batch, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long insertBatch$lambda$0(BatchDao_Impl this$0, BatchHistoryEntity $batch, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        long _result = this$0.__insertAdapterOfBatchHistoryEntity.insertAndReturnId(_connection, $batch);
        return _result;
    }

    @Override // com.example.data.db.BatchDao
    public Flow<List<BatchHistoryEntity>> getAllBatches() {
        final String _sql = "SELECT * FROM batch_history ORDER BY processedTimestamp DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"batch_history"}, new Function1() { // from class: com.example.data.db.BatchDao_Impl$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return BatchDao_Impl.getAllBatches$lambda$1(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List getAllBatches$lambda$1(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfFolderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "folderName");
            int _columnIndexOfProcessedTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "processedTimestamp");
            int _columnIndexOfSampleCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sampleCount");
            int _columnIndexOfTargetCell = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "targetCell");
            int _columnIndexOfSummaryAverage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "summaryAverage");
            int _columnIndexOfSummaryMax = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "summaryMax");
            int _columnIndexOfSummaryMin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "summaryMin");
            int _columnIndexOfExtractedValuesJson = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "extractedValuesJson");
            int _columnIndexOfCsvOutputText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "csvOutputText");
            List _result = new ArrayList();
            while (_stmt.step()) {
                long _tmpId = _stmt.getLong(_columnIndexOfId);
                String _tmpFolderName = _stmt.getText(_columnIndexOfFolderName);
                long _tmpProcessedTimestamp = _stmt.getLong(_columnIndexOfProcessedTimestamp);
                int _columnIndexOfId2 = _columnIndexOfId;
                int _tmpSampleCount = (int) _stmt.getLong(_columnIndexOfSampleCount);
                String _tmpTargetCell = _stmt.getText(_columnIndexOfTargetCell);
                double _tmpSummaryAverage = _stmt.getDouble(_columnIndexOfSummaryAverage);
                double _tmpSummaryMax = _stmt.getDouble(_columnIndexOfSummaryMax);
                double _tmpSummaryMin = _stmt.getDouble(_columnIndexOfSummaryMin);
                String _tmpExtractedValuesJson = _stmt.getText(_columnIndexOfExtractedValuesJson);
                String _tmpCsvOutputText = _stmt.getText(_columnIndexOfCsvOutputText);
                BatchHistoryEntity _item = new BatchHistoryEntity(_tmpId, _tmpFolderName, _tmpProcessedTimestamp, _tmpSampleCount, _tmpTargetCell, _tmpSummaryAverage, _tmpSummaryMax, _tmpSummaryMin, _tmpExtractedValuesJson, _tmpCsvOutputText);
                _result.add(_item);
                _columnIndexOfId = _columnIndexOfId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.db.BatchDao
    public Object deleteBatch(final long id, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM batch_history WHERE id = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.db.BatchDao_Impl$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return BatchDao_Impl.deleteBatch$lambda$2(_sql, id, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit deleteBatch$lambda$2(String $_sql, long $id, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindLong(1, $id);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.example.data.db.BatchDao
    public Object clearAllBatches(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM batch_history";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.example.data.db.BatchDao_Impl$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return BatchDao_Impl.clearAllBatches$lambda$3(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit clearAllBatches$lambda$3(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: BatchDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/db/BatchDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /tmp/dex/classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
