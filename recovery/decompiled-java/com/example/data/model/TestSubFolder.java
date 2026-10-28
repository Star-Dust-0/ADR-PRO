package com.example.data.model;

import com.example.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CsvSampleItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/data/model/TestSubFolder;", "", "folderName", "", "uriString", "csvCount", "", "lastModified", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "getFolderName", "()Ljava/lang/String;", "getUriString", "getCsvCount", "()I", "getLastModified", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes7.dex */
public final /* data */ class TestSubFolder {
    public static final int $stable = 0;
    private final int csvCount;
    private final String folderName;
    private final long lastModified;
    private final String uriString;

    public static /* synthetic */ TestSubFolder copy$default(TestSubFolder testSubFolder, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = testSubFolder.folderName;
        }
        if ((i2 & 2) != 0) {
            str2 = testSubFolder.uriString;
        }
        if ((i2 & 4) != 0) {
            i = testSubFolder.csvCount;
        }
        if ((i2 & 8) != 0) {
            j = testSubFolder.lastModified;
        }
        int i3 = i;
        return testSubFolder.copy(str, str2, i3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFolderName() {
        return this.folderName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUriString() {
        return this.uriString;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCsvCount() {
        return this.csvCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLastModified() {
        return this.lastModified;
    }

    public final TestSubFolder copy(String folderName, String uriString, int csvCount, long lastModified) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        return new TestSubFolder(folderName, uriString, csvCount, lastModified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestSubFolder)) {
            return false;
        }
        TestSubFolder testSubFolder = (TestSubFolder) other;
        return Intrinsics.areEqual(this.folderName, testSubFolder.folderName) && Intrinsics.areEqual(this.uriString, testSubFolder.uriString) && this.csvCount == testSubFolder.csvCount && this.lastModified == testSubFolder.lastModified;
    }

    public int hashCode() {
        return (((((this.folderName.hashCode() * 31) + this.uriString.hashCode()) * 31) + Integer.hashCode(this.csvCount)) * 31) + Long.hashCode(this.lastModified);
    }

    public String toString() {
        return "TestSubFolder(folderName=" + this.folderName + ", uriString=" + this.uriString + ", csvCount=" + this.csvCount + ", lastModified=" + this.lastModified + ")";
    }

    public TestSubFolder(String folderName, String uriString, int csvCount, long lastModified) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        this.folderName = folderName;
        this.uriString = uriString;
        this.csvCount = csvCount;
        this.lastModified = lastModified;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TestSubFolder(java.lang.String r7, java.lang.String r8, int r9, long r10, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L8
            r10 = 0
            r4 = r10
            goto L9
        L8:
            r4 = r10
        L9:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.model.TestSubFolder.<init>(java.lang.String, java.lang.String, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final String getUriString() {
        return this.uriString;
    }

    public final int getCsvCount() {
        return this.csvCount;
    }

    public final long getLastModified() {
        return this.lastModified;
    }
}
