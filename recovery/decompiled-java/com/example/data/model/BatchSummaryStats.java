package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CsvSampleItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006$"}, d2 = {"Lcom/example/data/model/BatchSummaryStats;", "", "totalFiles", "", "successCount", "errorCount", "averageValue", "", "maxValue", "minValue", "totalSum", "<init>", "(IIIDDDD)V", "getTotalFiles", "()I", "getSuccessCount", "getErrorCount", "getAverageValue", "()D", "getMaxValue", "getMinValue", "getTotalSum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes7.dex */
public final /* data */ class BatchSummaryStats {
    public static final int $stable = 0;
    private final double averageValue;
    private final int errorCount;
    private final double maxValue;
    private final double minValue;
    private final int successCount;
    private final int totalFiles;
    private final double totalSum;

    public BatchSummaryStats() {
        this(0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 127, null);
    }

    public static /* synthetic */ BatchSummaryStats copy$default(BatchSummaryStats batchSummaryStats, int i, int i2, int i3, double d, double d2, double d3, double d4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = batchSummaryStats.totalFiles;
        }
        if ((i4 & 2) != 0) {
            i2 = batchSummaryStats.successCount;
        }
        if ((i4 & 4) != 0) {
            i3 = batchSummaryStats.errorCount;
        }
        if ((i4 & 8) != 0) {
            d = batchSummaryStats.averageValue;
        }
        if ((i4 & 16) != 0) {
            d2 = batchSummaryStats.maxValue;
        }
        if ((i4 & 32) != 0) {
            d3 = batchSummaryStats.minValue;
        }
        if ((i4 & 64) != 0) {
            d4 = batchSummaryStats.totalSum;
        }
        double d5 = d4;
        double d6 = d3;
        double d7 = d2;
        int i5 = i3;
        return batchSummaryStats.copy(i, i2, i5, d, d7, d6, d5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalFiles() {
        return this.totalFiles;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSuccessCount() {
        return this.successCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getErrorCount() {
        return this.errorCount;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAverageValue() {
        return this.averageValue;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component6, reason: from getter */
    public final double getMinValue() {
        return this.minValue;
    }

    /* renamed from: component7, reason: from getter */
    public final double getTotalSum() {
        return this.totalSum;
    }

    public final BatchSummaryStats copy(int totalFiles, int successCount, int errorCount, double averageValue, double maxValue, double minValue, double totalSum) {
        return new BatchSummaryStats(totalFiles, successCount, errorCount, averageValue, maxValue, minValue, totalSum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchSummaryStats)) {
            return false;
        }
        BatchSummaryStats batchSummaryStats = (BatchSummaryStats) other;
        return this.totalFiles == batchSummaryStats.totalFiles && this.successCount == batchSummaryStats.successCount && this.errorCount == batchSummaryStats.errorCount && Double.compare(this.averageValue, batchSummaryStats.averageValue) == 0 && Double.compare(this.maxValue, batchSummaryStats.maxValue) == 0 && Double.compare(this.minValue, batchSummaryStats.minValue) == 0 && Double.compare(this.totalSum, batchSummaryStats.totalSum) == 0;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.totalFiles) * 31) + Integer.hashCode(this.successCount)) * 31) + Integer.hashCode(this.errorCount)) * 31) + Double.hashCode(this.averageValue)) * 31) + Double.hashCode(this.maxValue)) * 31) + Double.hashCode(this.minValue)) * 31) + Double.hashCode(this.totalSum);
    }

    public String toString() {
        return "BatchSummaryStats(totalFiles=" + this.totalFiles + ", successCount=" + this.successCount + ", errorCount=" + this.errorCount + ", averageValue=" + this.averageValue + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", totalSum=" + this.totalSum + ")";
    }

    public BatchSummaryStats(int totalFiles, int successCount, int errorCount, double averageValue, double maxValue, double minValue, double totalSum) {
        this.totalFiles = totalFiles;
        this.successCount = successCount;
        this.errorCount = errorCount;
        this.averageValue = averageValue;
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.totalSum = totalSum;
    }

    public /* synthetic */ BatchSummaryStats(int i, int i2, int i3, double d, double d2, double d3, double d4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? 0.0d : d, (i4 & 16) != 0 ? 0.0d : d2, (i4 & 32) != 0 ? 0.0d : d3, (i4 & 64) != 0 ? 0.0d : d4);
    }

    public final int getTotalFiles() {
        return this.totalFiles;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public final int getErrorCount() {
        return this.errorCount;
    }

    public final double getAverageValue() {
        return this.averageValue;
    }

    public final double getMaxValue() {
        return this.maxValue;
    }

    public final double getMinValue() {
        return this.minValue;
    }

    public final double getTotalSum() {
        return this.totalSum;
    }
}
