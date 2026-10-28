package com.example.data.db;

import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BatchDao.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH'J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/example/data/db/BatchDao;", "", "insertBatch", "", "batch", "Lcom/example/data/db/BatchHistoryEntity;", "(Lcom/example/data/db/BatchHistoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBatches", "Lkotlinx/coroutines/flow/Flow;", "", "deleteBatch", "", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllBatches", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes4.dex */
public interface BatchDao {
    Object clearAllBatches(Continuation<? super Unit> continuation);

    Object deleteBatch(long j, Continuation<? super Unit> continuation);

    Flow<List<BatchHistoryEntity>> getAllBatches();

    Object insertBatch(BatchHistoryEntity batchHistoryEntity, Continuation<? super Long> continuation);
}
