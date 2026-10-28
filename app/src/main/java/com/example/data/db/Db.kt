package com.example.data.db

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "batch_history")
data class BatchHistoryEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val folderName: String,
    val processedTimestamp: Long,
    val sampleCount: Int,
    val targetCell: String,
    val summaryAverage: Double,
    val summaryMax: Double,
    val summaryMin: Double,
    val extractedValuesJson: String,
    val csvOutputText: String,
)

@Dao
interface BatchDao {
    @Query("SELECT * FROM batch_history ORDER BY processedTimestamp DESC")
    fun getAllBatches(): Flow<List<BatchHistoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBatch(batch: BatchHistoryEntity)

    @Query("DELETE FROM batch_history WHERE id = :id")
    suspend fun deleteBatch(id: Long)

    @Query("DELETE FROM batch_history")
    suspend fun clearAll()
}

@Database(entities = [BatchHistoryEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun batchDao(): BatchDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "compression_lab_db",
                ).fallbackToDestructiveMigration().build().also { INSTANCE = it }
            }
    }
}
