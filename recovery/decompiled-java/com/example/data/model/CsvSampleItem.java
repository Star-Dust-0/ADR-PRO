package com.example.data.model;

import com.example.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CsvSampleItem.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u0011HÆ\u0003J\u008c\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u000bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lcom/example/data/model/CsvSampleItem;", "", "id", "", "fileName", "uriString", "extractedValue", "numericValue", "", "targetCell", "rowNumber", "", "columnLetter", "status", "Lcom/example/data/model/ExtractionStatus;", "errorMessage", "rawPreviewGrid", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/String;Lcom/example/data/model/ExtractionStatus;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getFileName", "getUriString", "getExtractedValue", "getNumericValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTargetCell", "getRowNumber", "()I", "getColumnLetter", "getStatus", "()Lcom/example/data/model/ExtractionStatus;", "getErrorMessage", "getRawPreviewGrid", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/String;Lcom/example/data/model/ExtractionStatus;Ljava/lang/String;Ljava/util/List;)Lcom/example/data/model/CsvSampleItem;", "equals", "", "other", "hashCode", "toString", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes7.dex */
public final /* data */ class CsvSampleItem {
    public static final int $stable = 8;
    private final String columnLetter;
    private final String errorMessage;
    private final String extractedValue;
    private final String fileName;
    private final String id;
    private final Double numericValue;
    private final List<List<String>> rawPreviewGrid;
    private final int rowNumber;
    private final ExtractionStatus status;
    private final String targetCell;
    private final String uriString;

    public static /* synthetic */ CsvSampleItem copy$default(CsvSampleItem csvSampleItem, String str, String str2, String str3, String str4, Double d, String str5, int i, String str6, ExtractionStatus extractionStatus, String str7, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = csvSampleItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = csvSampleItem.fileName;
        }
        if ((i2 & 4) != 0) {
            str3 = csvSampleItem.uriString;
        }
        if ((i2 & 8) != 0) {
            str4 = csvSampleItem.extractedValue;
        }
        if ((i2 & 16) != 0) {
            d = csvSampleItem.numericValue;
        }
        if ((i2 & 32) != 0) {
            str5 = csvSampleItem.targetCell;
        }
        if ((i2 & 64) != 0) {
            i = csvSampleItem.rowNumber;
        }
        if ((i2 & 128) != 0) {
            str6 = csvSampleItem.columnLetter;
        }
        if ((i2 & 256) != 0) {
            extractionStatus = csvSampleItem.status;
        }
        if ((i2 & 512) != 0) {
            str7 = csvSampleItem.errorMessage;
        }
        if ((i2 & 1024) != 0) {
            list = csvSampleItem.rawPreviewGrid;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str6;
        ExtractionStatus extractionStatus2 = extractionStatus;
        String str10 = str5;
        int i3 = i;
        Double d2 = d;
        String str11 = str3;
        return csvSampleItem.copy(str, str2, str11, str4, d2, str10, i3, str9, extractionStatus2, str8, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<List<String>> component11() {
        return this.rawPreviewGrid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUriString() {
        return this.uriString;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExtractedValue() {
        return this.extractedValue;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getNumericValue() {
        return this.numericValue;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTargetCell() {
        return this.targetCell;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRowNumber() {
        return this.rowNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final String getColumnLetter() {
        return this.columnLetter;
    }

    /* renamed from: component9, reason: from getter */
    public final ExtractionStatus getStatus() {
        return this.status;
    }

    public final CsvSampleItem copy(String id, String fileName, String uriString, String extractedValue, Double numericValue, String targetCell, int rowNumber, String columnLetter, ExtractionStatus status, String errorMessage, List<? extends List<String>> rawPreviewGrid) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(columnLetter, "columnLetter");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rawPreviewGrid, "rawPreviewGrid");
        return new CsvSampleItem(id, fileName, uriString, extractedValue, numericValue, targetCell, rowNumber, columnLetter, status, errorMessage, rawPreviewGrid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CsvSampleItem)) {
            return false;
        }
        CsvSampleItem csvSampleItem = (CsvSampleItem) other;
        return Intrinsics.areEqual(this.id, csvSampleItem.id) && Intrinsics.areEqual(this.fileName, csvSampleItem.fileName) && Intrinsics.areEqual(this.uriString, csvSampleItem.uriString) && Intrinsics.areEqual(this.extractedValue, csvSampleItem.extractedValue) && Intrinsics.areEqual(this.numericValue, csvSampleItem.numericValue) && Intrinsics.areEqual(this.targetCell, csvSampleItem.targetCell) && this.rowNumber == csvSampleItem.rowNumber && Intrinsics.areEqual(this.columnLetter, csvSampleItem.columnLetter) && this.status == csvSampleItem.status && Intrinsics.areEqual(this.errorMessage, csvSampleItem.errorMessage) && Intrinsics.areEqual(this.rawPreviewGrid, csvSampleItem.rawPreviewGrid);
    }

    public int hashCode() {
        return (((((((((((((((((((this.id.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.uriString.hashCode()) * 31) + this.extractedValue.hashCode()) * 31) + (this.numericValue == null ? 0 : this.numericValue.hashCode())) * 31) + this.targetCell.hashCode()) * 31) + Integer.hashCode(this.rowNumber)) * 31) + this.columnLetter.hashCode()) * 31) + this.status.hashCode()) * 31) + (this.errorMessage != null ? this.errorMessage.hashCode() : 0)) * 31) + this.rawPreviewGrid.hashCode();
    }

    public String toString() {
        return "CsvSampleItem(id=" + this.id + ", fileName=" + this.fileName + ", uriString=" + this.uriString + ", extractedValue=" + this.extractedValue + ", numericValue=" + this.numericValue + ", targetCell=" + this.targetCell + ", rowNumber=" + this.rowNumber + ", columnLetter=" + this.columnLetter + ", status=" + this.status + ", errorMessage=" + this.errorMessage + ", rawPreviewGrid=" + this.rawPreviewGrid + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CsvSampleItem(String id, String fileName, String uriString, String extractedValue, Double numericValue, String targetCell, int rowNumber, String columnLetter, ExtractionStatus status, String errorMessage, List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(columnLetter, "columnLetter");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(list, "rawPreviewGrid");
        this.id = id;
        this.fileName = fileName;
        this.uriString = uriString;
        this.extractedValue = extractedValue;
        this.numericValue = numericValue;
        this.targetCell = targetCell;
        this.rowNumber = rowNumber;
        this.columnLetter = columnLetter;
        this.status = status;
        this.errorMessage = errorMessage;
        this.rawPreviewGrid = list;
    }

    public /* synthetic */ CsvSampleItem(String str, String str2, String str3, String str4, Double d, String str5, int i, String str6, ExtractionStatus extractionStatus, String str7, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, d, (i2 & 32) != 0 ? "B9" : str5, (i2 & 64) != 0 ? 9 : i, (i2 & 128) != 0 ? "B" : str6, (i2 & 256) != 0 ? ExtractionStatus.SUCCESS : extractionStatus, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getId() {
        return this.id;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getUriString() {
        return this.uriString;
    }

    public final String getExtractedValue() {
        return this.extractedValue;
    }

    public final Double getNumericValue() {
        return this.numericValue;
    }

    public final String getTargetCell() {
        return this.targetCell;
    }

    public final int getRowNumber() {
        return this.rowNumber;
    }

    public final String getColumnLetter() {
        return this.columnLetter;
    }

    public final ExtractionStatus getStatus() {
        return this.status;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<List<String>> getRawPreviewGrid() {
        return this.rawPreviewGrid;
    }
}
