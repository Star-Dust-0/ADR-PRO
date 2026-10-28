package com.example.data.util;

import android.content.Context;
import android.net.Uri;
import com.example.BuildConfig;
import com.example.data.model.CsvSampleItem;
import com.example.data.model.ExtractionStatus;
import com.example.data.model.OutputFormat;
import com.example.data.model.TestSubFolder;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: CsvParserUtil.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u0017*\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eJ\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u001cj\b\u0012\u0004\u0012\u00020\b`\u001eJ(\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020#J*\u0010$\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\n0\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\b¨\u0006'"}, d2 = {"Lcom/example/data/util/CsvParserUtil;", "", "<init>", "()V", "parseCellReference", "Lkotlin/Pair;", "", "cellRef", "", "parseCsvLine", "", "line", "cleanCellValue", "raw", "extractCellFromCsvUri", "Lcom/example/data/model/CsvSampleItem;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "fileName", "targetCell", "isNull_or_blank", "", "parseDateFromFolderName", "Ljava/util/Date;", "name", "dateComparatorNewestFirst", "Ljava/util/Comparator;", "Lcom/example/data/model/TestSubFolder;", "Lkotlin/Comparator;", "naturalSortComparator", "buildCombinedCsvString", "items", "format", "Lcom/example/data/model/OutputFormat;", "createDemoLabFolder", "Ljava/io/File;", "folderName", "app"}, k = BuildConfig.VERSION_CODE, mv = {2, 2, 0}, xi = 48)
/* loaded from: /tmp/dex/classes5.dex */
public final class CsvParserUtil {
    public static final int $stable = 0;
    public static final CsvParserUtil INSTANCE = new CsvParserUtil();

    /* compiled from: CsvParserUtil.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /tmp/dex/classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExtractionStatus.values().length];
            try {
                iArr[ExtractionStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ExtractionStatus.EMPTY_CELL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ExtractionStatus.FILE_TOO_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ExtractionStatus.READ_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OutputFormat.values().length];
            try {
                iArr2[OutputFormat.SINGLE_COLUMN_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[OutputFormat.DETAILED_WITH_FILENAMES.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private CsvParserUtil() {
    }

    public final Pair<Integer, Integer> parseCellReference(String cellRef) {
        String colStr;
        String rowStr;
        Integer intOrNull;
        int row;
        Intrinsics.checkNotNullParameter(cellRef, "cellRef");
        String clean = StringsKt.trim(cellRef).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(clean, "toUpperCase(...)");
        Pattern pattern = Pattern.compile("^([A-Z]+)([0-9]+)$");
        Matcher matcher = pattern.matcher(clean);
        if (!matcher.matches() || (colStr = matcher.group(1)) == null || (rowStr = matcher.group(2)) == null || (intOrNull = StringsKt.toIntOrNull(rowStr)) == null || (row = intOrNull.intValue() - 1) < 0) {
            return null;
        }
        int col = 0;
        for (int i = 0; i < colStr.length(); i++) {
            col = (col * 26) + (colStr.charAt(i) - 'A') + 1;
        }
        return new Pair<>(Integer.valueOf(row), Integer.valueOf(col - 1));
    }

    public final List<String> parseCsvLine(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        if (line.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char delimiter = (!StringsKt.contains$default(line, ";", false, 2, (Object) null) || StringsKt.contains$default(line, ",", false, 2, (Object) null)) ? ',' : ';';
        List result = new ArrayList();
        StringBuilder current = new StringBuilder();
        boolean inQuotes = false;
        int length = line.length();
        for (int i = 0; i < length; i++) {
            char ch = line.charAt(i);
            if (ch == '\"') {
                boolean inQuotes2 = !inQuotes;
                Unit unit = Unit.INSTANCE;
                inQuotes = inQuotes2;
            } else if (ch == delimiter && !inQuotes) {
                String sb = current.toString();
                Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
                result.add(cleanCellValue(sb));
                StringsKt.clear(current);
            } else {
                current.append(ch);
            }
        }
        String sb2 = current.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        result.add(cleanCellValue(sb2));
        return result;
    }

    private final String cleanCellValue(String raw) {
        return StringsKt.trim(StringsKt.removeSurrounding(StringsKt.removeSurrounding(StringsKt.trim(raw).toString(), "\""), "'")).toString();
    }

    public static /* synthetic */ CsvSampleItem extractCellFromCsvUri$default(CsvParserUtil csvParserUtil, Context context, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "B9";
        }
        return csvParserUtil.extractCellFromCsvUri(context, uri, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public final CsvSampleItem extractCellFromCsvUri(Context context, Uri uri, String fileName, String targetCell) {
        ?? r14;
        Throwable th;
        Object obj;
        String uri2;
        int i;
        StringBuilder sb;
        int i2;
        StringBuilder sb2;
        String str;
        int i3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Pair<Integer, Integer> parseCellReference = parseCellReference(targetCell);
        if (parseCellReference == null) {
            String uri3 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
            return new CsvSampleItem(fileName, fileName, uri3, "Format Error", null, targetCell, 0, null, ExtractionStatus.READ_ERROR, "Invalid Cell Code (e.g. B9)", null, 1216, null);
        }
        int intValue = ((Number) parseCellReference.getFirst()).intValue();
        int intValue2 = ((Number) parseCellReference.getSecond()).intValue();
        ArrayList arrayList = new ArrayList();
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                try {
                    String uri4 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
                    try {
                        return new CsvSampleItem(fileName, fileName, uri4, "Read Error", null, targetCell, 0, null, ExtractionStatus.READ_ERROR, "Could not open file", null, 1216, null);
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList;
                        r14 = "toString(...)";
                    }
                } catch (Exception e2) {
                    e = e2;
                    r14 = "toString(...)";
                }
            } else {
                int i4 = intValue;
                int i5 = intValue2;
                ArrayList arrayList2 = arrayList;
                r14 = openInputStream;
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) r14, "UTF-8"));
                        try {
                            BufferedReader bufferedReader2 = bufferedReader;
                            int i6 = 0;
                            String readLine = bufferedReader2.readLine();
                            String str2 = null;
                            while (readLine != null) {
                                try {
                                    List<String> parseCsvLine = INSTANCE.parseCsvLine(readLine);
                                    if (arrayList2.size() < 20) {
                                        arrayList = arrayList2;
                                        try {
                                            arrayList.add(parseCsvLine);
                                        } catch (Throwable th2) {
                                            r14 = "toString(...)";
                                            th = th2;
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                CloseableKt.closeFinally(bufferedReader, th);
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                    if (i6 == i4) {
                                        try {
                                            i3 = i5;
                                            if (i3 < parseCsvLine.size()) {
                                                try {
                                                    str2 = parseCsvLine.get(i3);
                                                } catch (Throwable th4) {
                                                    r14 = "toString(...)";
                                                    th = th4;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            r14 = "toString(...)";
                                            th = th5;
                                            throw th;
                                        }
                                    } else {
                                        i3 = i5;
                                    }
                                    i6++;
                                    readLine = bufferedReader2.readLine();
                                    i5 = i3;
                                    arrayList2 = arrayList;
                                } catch (Throwable th6) {
                                    arrayList = arrayList2;
                                    r14 = "toString(...)";
                                    th = th6;
                                }
                            }
                            arrayList = arrayList2;
                            try {
                                if (i6 > i4) {
                                    String str3 = str2;
                                    if (INSTANCE.isNull_or_blank(str3)) {
                                        String uri5 = uri.toString();
                                        Intrinsics.checkNotNullExpressionValue(uri5, "toString(...)");
                                        int i7 = i4 + 1;
                                        String str4 = targetCell;
                                        StringBuilder sb3 = new StringBuilder();
                                        int length = str4.length();
                                        for (int i8 = 0; i8 < length; i8++) {
                                            char charAt = str4.charAt(i8);
                                            if (Character.isLetter(charAt)) {
                                                sb3.append(charAt);
                                            }
                                        }
                                        CsvSampleItem csvSampleItem = new CsvSampleItem(fileName, fileName, uri5, "Empty Cell", null, targetCell, i7, sb3.toString(), ExtractionStatus.EMPTY_CELL, "Cell " + targetCell + " is empty in this file", arrayList);
                                        CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                                        return csvSampleItem;
                                    }
                                    String str5 = str3 == null ? "" : str3;
                                    Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.replace$default(str5, ",", ".", false, 4, (Object) null));
                                    String uri6 = uri.toString();
                                    Intrinsics.checkNotNullExpressionValue(uri6, "toString(...)");
                                    int i9 = i4 + 1;
                                    String str6 = targetCell;
                                    StringBuilder sb4 = new StringBuilder();
                                    int length2 = str6.length();
                                    for (int i10 = 0; i10 < length2; i10++) {
                                        char charAt2 = str6.charAt(i10);
                                        if (Character.isLetter(charAt2)) {
                                            sb4.append(charAt2);
                                        }
                                    }
                                    CsvSampleItem csvSampleItem2 = new CsvSampleItem(fileName, fileName, uri6, str5, doubleOrNull, targetCell, i9, sb4.toString(), ExtractionStatus.SUCCESS, null, arrayList);
                                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                                    return csvSampleItem2;
                                }
                                try {
                                    uri2 = uri.toString();
                                    try {
                                        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                                        i = i4 + 1;
                                        sb = new StringBuilder();
                                        String str7 = targetCell;
                                        int length3 = str7.length();
                                        int i11 = 0;
                                        while (i11 < length3) {
                                            int i12 = i4;
                                            String str8 = str7;
                                            try {
                                                char charAt3 = str8.charAt(i11);
                                                if (Character.isLetter(charAt3)) {
                                                    i2 = i11;
                                                    sb2 = sb;
                                                    str = str8;
                                                    sb2.append(charAt3);
                                                } else {
                                                    i2 = i11;
                                                    sb2 = sb;
                                                    str = str8;
                                                }
                                                int i13 = i2 + 1;
                                                str7 = str;
                                                sb = sb2;
                                                i11 = i13;
                                                i4 = i12;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                r14 = "toString(...)";
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj = "toString(...)";
                                        th = th;
                                        r14 = obj;
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj = "toString(...)";
                                }
                                try {
                                    CsvSampleItem csvSampleItem3 = new CsvSampleItem(fileName, fileName, uri2, "Short File", null, targetCell, i, sb.toString(), ExtractionStatus.FILE_TOO_SHORT, "File only has " + i6 + " rows (Required row " + (i4 + 1) + ")", arrayList);
                                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                                    return csvSampleItem3;
                                } catch (Throwable th10) {
                                    r14 = "toString(...)";
                                    th = th10;
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                r14 = r14;
                            }
                        } catch (Throwable th12) {
                            r14 = "toString(...)";
                            arrayList = arrayList2;
                            th = th12;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        arrayList = arrayList2;
                        r14 = "toString(...)";
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        } catch (Exception e5) {
            e = e5;
            r14 = "toString(...)";
        }
        String uri7 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri7, (String) r14);
        ExtractionStatus extractionStatus = ExtractionStatus.READ_ERROR;
        String localizedMessage = e.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Error occurred while reading file";
        }
        return new CsvSampleItem(fileName, fileName, uri7, "Error", null, targetCell, 0, null, extractionStatus, localizedMessage, arrayList, 192, null);
    }

    private final boolean isNull_or_blank(String $this$isNull_or_blank) {
        if ($this$isNull_or_blank != null) {
            return StringsKt.trim($this$isNull_or_blank).toString().length() == 0;
        }
        return true;
    }

    public final Date parseDateFromFolderName(String name) {
        Date parsed;
        Intrinsics.checkNotNullParameter(name, "name");
        String clean = StringsKt.trim(name).toString();
        List<String> datePatterns = CollectionsKt.listOf(new String[]{"dd_MM_yy", "dd_MM_yyyy", "dd-MM-yy", "dd-MM-yyyy", "dd.MM.yy", "dd.MM.yyyy", "yyyy_MM_dd", "yyyy-MM-dd", "yy_MM_dd", "yy-MM-dd"});
        for (String pattern : datePatterns) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
                sdf.setLenient(false);
                parsed = sdf.parse(clean);
            } catch (Exception e) {
            }
            if (parsed != null) {
                return parsed;
            }
        }
        return null;
    }

    public final Comparator<TestSubFolder> dateComparatorNewestFirst() {
        return new Comparator() { // from class: com.example.data.util.CsvParserUtil$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CsvParserUtil.dateComparatorNewestFirst$lambda$4((TestSubFolder) obj, (TestSubFolder) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int dateComparatorNewestFirst$lambda$4(TestSubFolder f1, TestSubFolder f2) {
        Date d1 = INSTANCE.parseDateFromFolderName(f1.getFolderName());
        Date d2 = INSTANCE.parseDateFromFolderName(f2.getFolderName());
        if (d1 != null && d2 != null) {
            int dateComp = d2.compareTo(d1);
            if (dateComp != 0) {
                return dateComp;
            }
        } else {
            if (d1 != null) {
                return -1;
            }
            if (d2 != null) {
                return 1;
            }
        }
        int timeComp = Intrinsics.compare(f2.getLastModified(), f1.getLastModified());
        if (timeComp != 0 && f1.getLastModified() > 0 && f2.getLastModified() > 0) {
            return timeComp;
        }
        return INSTANCE.naturalSortComparator().compare(f2.getFolderName(), f1.getFolderName());
    }

    public final Comparator<String> naturalSortComparator() {
        return new Comparator() { // from class: com.example.data.util.CsvParserUtil$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CsvParserUtil.naturalSortComparator$lambda$5((String) obj, (String) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int naturalSortComparator$lambda$5(String s1, String s2) {
        int result;
        Pattern p = Pattern.compile("(\\d+)|(\\D+)");
        Matcher m1 = p.matcher(s1);
        Matcher m2 = p.matcher(s2);
        while (m1.find() && m2.find()) {
            String g1 = m1.group();
            String g2 = m2.group();
            if (Character.isDigit(g1.charAt(0)) && Character.isDigit(g2.charAt(0))) {
                Intrinsics.checkNotNull(g1);
                BigInteger n1 = StringsKt.toBigIntegerOrNull(g1);
                Intrinsics.checkNotNull(g2);
                BigInteger n2 = StringsKt.toBigIntegerOrNull(g2);
                result = (n1 == null || n2 == null) ? g1.compareTo(g2) : n1.compareTo(n2);
            } else {
                Intrinsics.checkNotNull(g1);
                Intrinsics.checkNotNull(g2);
                result = StringsKt.compareTo(g1, g2, true);
            }
            if (result != 0) {
                return result;
            }
        }
        return Intrinsics.compare(s1.length(), s2.length());
    }

    public static /* synthetic */ String buildCombinedCsvString$default(CsvParserUtil csvParserUtil, List list, String str, OutputFormat outputFormat, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "B9";
        }
        if ((i & 4) != 0) {
            outputFormat = OutputFormat.SINGLE_COLUMN_ONLY;
        }
        return csvParserUtil.buildCombinedCsvString(list, str, outputFormat);
    }

    public final String buildCombinedCsvString(List<CsvSampleItem> items, String targetCell, OutputFormat format) {
        String str;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(targetCell, "targetCell");
        Intrinsics.checkNotNullParameter(format, "format");
        StringBuilder sb = new StringBuilder();
        switch (WhenMappings.$EnumSwitchMapping$1[format.ordinal()]) {
            case BuildConfig.VERSION_CODE /* 1 */:
                for (CsvSampleItem csvSampleItem : items) {
                    if (csvSampleItem.getStatus() == ExtractionStatus.SUCCESS) {
                        sb.append(csvSampleItem.getExtractedValue()).append("\n");
                    } else {
                        sb.append("-").append("\n");
                    }
                }
                break;
            case 2:
                sb.append("File Name,Cell Value " + targetCell + ",Status\n");
                for (CsvSampleItem csvSampleItem2 : items) {
                    switch (WhenMappings.$EnumSwitchMapping$0[csvSampleItem2.getStatus().ordinal()]) {
                        case BuildConfig.VERSION_CODE /* 1 */:
                            str = "Success";
                            break;
                        case 2:
                            str = "Empty Cell";
                            break;
                        case 3:
                            str = "Short File";
                            break;
                        case 4:
                            str = "Read Error";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    sb.append("\"" + csvSampleItem2.getFileName() + "\",\"" + csvSampleItem2.getExtractedValue() + "\",\"" + str + "\"\n");
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ Pair createDemoLabFolder$default(CsvParserUtil csvParserUtil, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "29_07_26";
        }
        return csvParserUtil.createDemoLabFolder(context, str);
    }

    public final Pair<File, List<File>> createDemoLabFolder(Context context, String folderName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        File demoDir = new File(context.getCacheDir(), folderName);
        if (!demoDir.exists()) {
            demoDir.mkdirs();
        }
        List generatedFiles = new ArrayList();
        List sampleValues = CollectionsKt.listOf(new Double[]{Double.valueOf(28.45d), Double.valueOf(29.8d), Double.valueOf(31.1d), Double.valueOf(27.95d), Double.valueOf(30.5d), Double.valueOf(32.15d), Double.valueOf(28.9d), Double.valueOf(29.3d), Double.valueOf(30.8d), Double.valueOf(31.75d)});
        for (int i = 1; i < 11; i++) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String fileName = "Sample_" + format + ".csv";
            File file = new File(demoDir, fileName);
            double b9Val = ((Number) sampleValues.get((i - 1) % sampleValues.size())).doubleValue();
            StringBuilder csvContent = new StringBuilder();
            csvContent.append("Lab Name,Central Concrete & Materials Lab\n");
            csvContent.append("Test Type,Cube Compression Test (150x150mm)\n");
            csvContent.append("Folder Date," + folderName + "\n");
            csvContent.append("Sample ID,Sample-" + i + "\n");
            csvContent.append("Curing Days,28 Days\n");
            csvContent.append("Machine Model,Hydraulic Press 2000kN\n");
            csvContent.append("Operator,Eng. Lab Tech\n");
            csvContent.append("Parameter,Value,Unit\n");
            csvContent.append("Peak Compressive Load," + b9Val + ",kN\n");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(b9Val / 22.5d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            csvContent.append("Compressive Strength," + format2 + ",MPa\n");
            csvContent.append("Failure Mode,Normal Columnar\n");
            csvContent.append("Test Status,PASSED\n");
            String sb = csvContent.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
            FilesKt.writeText(file, sb, Charsets.UTF_8);
            generatedFiles.add(file);
        }
        return new Pair<>(demoDir, generatedFiles);
    }
}
