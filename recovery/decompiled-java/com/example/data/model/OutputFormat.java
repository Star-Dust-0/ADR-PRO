package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: CsvSampleItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/example/data/model/OutputFormat;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_COLUMN_ONLY", "DETAILED_WITH_FILENAMES", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes7.dex */
public enum OutputFormat {
    SINGLE_COLUMN_ONLY,
    DETAILED_WITH_FILENAMES;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<OutputFormat> getEntries() {
        return $ENTRIES;
    }
}
