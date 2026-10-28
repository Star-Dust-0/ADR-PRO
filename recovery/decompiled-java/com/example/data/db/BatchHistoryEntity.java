package com.example.data.db;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchHistoryEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00060"}, d2 = {"Lcom/example/data/db/BatchHistoryEntity;", "", "id", "", "folderName", "", "processedTimestamp", "sampleCount", "", "targetCell", "summaryAverage", "", "summaryMax", "summaryMin", "extractedValuesJson", "csvOutputText", "<init>", "(JLjava/lang/String;JILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getFolderName", "()Ljava/lang/String;", "getProcessedTimestamp", "getSampleCount", "()I", "getTargetCell", "getSummaryAverage", "()D", "getSummaryMax", "getSummaryMin", "getExtractedValuesJson", "getCsvOutputText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes4.dex */
public final /* data */ class BatchHistoryEntity {
    public static final int $stable = 0;
    private final String csvOutputText;
    private final String extractedValuesJson;
    private final String folderName;
    private final long id;
    private final long processedTimestamp;
    private final int sampleCount;
    private final double summaryAverage;
    private final double summaryMax;
    private final double summaryMin;
    private final String targetCell;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCsvOutputText() {
        return this.csvOutputText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFolderName() {
        return this.folderName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getProcessedTimestamp() {
        return this.processedTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTargetCell() {
        return this.targetCell;
    }

    /* renamed from: component6, reason: from getter */
    public final double getSummaryAverage() {
        return this.summaryAverage;
    }

    /* renamed from: component7, reason: from getter */
    public final double getSummaryMax() {
        return this.summaryMax;
    }

    /* renamed from: component8, reason: from getter */
    public final double getSummaryMin() {
        return this.summaryMin;
    }

    /* renamed from: component9, reason: from getter */
    public final String getExtractedValuesJson() {
        return this.extractedValuesJson;
    }

    public final BatchHistoryEntity copy(long id, String folderName, long processedTimestamp, int sampleCount, String targetCell, double summaryAverage, double summaryMax, double summaryMin, String extractedValuesJson, String csvOutputText) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(extractedValuesJson, "extractedValuesJson");
        Intrinsics.checkNotNullParameter(csvOutputText, "csvOutputText");
        return new BatchHistoryEntity(id, folderName, processedTimestamp, sampleCount, targetCell, summaryAverage, summaryMax, summaryMin, extractedValuesJson, csvOutputText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchHistoryEntity)) {
            return false;
        }
        BatchHistoryEntity batchHistoryEntity = (BatchHistoryEntity) other;
        return this.id == batchHistoryEntity.id && Intrinsics.areEqual(this.folderName, batchHistoryEntity.folderName) && this.processedTimestamp == batchHistoryEntity.processedTimestamp && this.sampleCount == batchHistoryEntity.sampleCount && Intrinsics.areEqual(this.targetCell, batchHistoryEntity.targetCell) && Double.compare(this.summaryAverage, batchHistoryEntity.summaryAverage) == 0 && Double.compare(this.summaryMax, batchHistoryEntity.summaryMax) == 0 && Double.compare(this.summaryMin, batchHistoryEntity.summaryMin) == 0 && Intrinsics.areEqual(this.extractedValuesJson, batchHistoryEntity.extractedValuesJson) && Intrinsics.areEqual(this.csvOutputText, batchHistoryEntity.csvOutputText);
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.id) * 31) + this.folderName.hashCode()) * 31) + Long.hashCode(this.processedTimestamp)) * 31) + Integer.hashCode(this.sampleCount)) * 31) + this.targetCell.hashCode()) * 31) + Double.hashCode(this.summaryAverage)) * 31) + Double.hashCode(this.summaryMax)) * 31) + Double.hashCode(this.summaryMin)) * 31) + this.extractedValuesJson.hashCode()) * 31) + this.csvOutputText.hashCode();
    }

    public String toString() {
        return "BatchHistoryEntity(id=" + this.id + ", folderName=" + this.folderName + ", processedTimestamp=" + this.processedTimestamp + ", sampleCount=" + this.sampleCount + ", targetCell=" + this.targetCell + ", summaryAverage=" + this.summaryAverage + ", summaryMax=" + this.summaryMax + ", summaryMin=" + this.summaryMin + ", extractedValuesJson=" + this.extractedValuesJson + ", csvOutputText=" + this.csvOutputText + ")";
    }

    public BatchHistoryEntity(long id, String folderName, long processedTimestamp, int sampleCount, String targetCell, double summaryAverage, double summaryMax, double summaryMin, String extractedValuesJson, String csvOutputText) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(extractedValuesJson, "extractedValuesJson");
        Intrinsics.checkNotNullParameter(csvOutputText, "csvOutputText");
        this.id = id;
        this.folderName = folderName;
        this.processedTimestamp = processedTimestamp;
        this.sampleCount = sampleCount;
        this.targetCell = targetCell;
        this.summaryAverage = summaryAverage;
        this.summaryMax = summaryMax;
        this.summaryMin = summaryMin;
        this.extractedValuesJson = extractedValuesJson;
        this.csvOutputText = csvOutputText;
    }

    public /* synthetic */ BatchHistoryEntity(long j, String str, long j2, int i, String str2, double d, double d2, double d3, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, str, j2, i, (i2 & 16) != 0 ? "B9" : str2, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, str3, str4);
    }

    public final long getId() {
        return this.id;
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final long getProcessedTimestamp() {
        return this.processedTimestamp;
    }

    public final int getSampleCount() {
        return this.sampleCount;
    }

    public final String getTargetCell() {
        return this.targetCell;
    }

    public final double getSummaryAverage() {
        return this.summaryAverage;
    }

    public final double getSummaryMax() {
        return this.summaryMax;
    }

    public final double getSummaryMin() {
        return this.summaryMin;
    }

    public final String getExtractedValuesJson() {
        return this.extractedValuesJson;
    }

    public final String getCsvOutputText() {
        return this.csvOutputText;
    }
}
