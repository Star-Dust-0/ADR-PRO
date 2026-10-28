package com.example.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CsvAggregatorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.viewmodel.CsvAggregatorViewModel$scanRootTestDirectory$1", f = "CsvAggregatorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes4.dex */
public final class CsvAggregatorViewModel$scanRootTestDirectory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $uriStr;
    int label;
    final /* synthetic */ CsvAggregatorViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsvAggregatorViewModel$scanRootTestDirectory$1(CsvAggregatorViewModel csvAggregatorViewModel, String str, Continuation<? super CsvAggregatorViewModel$scanRootTestDirectory$1> continuation) {
        super(2, continuation);
        this.this$0 = csvAggregatorViewModel;
        this.$uriStr = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CsvAggregatorViewModel$scanRootTestDirectory$1(this.this$0, this.$uriStr, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb A[Catch: Exception -> 0x01f8, all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:16:0x01ce, B:37:0x00bd, B:41:0x00cb, B:43:0x00d1, B:49:0x00e8, B:51:0x00ea, B:65:0x0205, B:59:0x00ef, B:61:0x0121, B:76:0x012b, B:78:0x0135, B:80:0x013d, B:82:0x0147, B:84:0x014f, B:88:0x0160, B:90:0x0166, B:97:0x0181, B:99:0x0183, B:111:0x0192, B:114:0x019c, B:115:0x01b3), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8 A[Catch: Exception -> 0x01f8, all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:16:0x01ce, B:37:0x00bd, B:41:0x00cb, B:43:0x00d1, B:49:0x00e8, B:51:0x00ea, B:65:0x0205, B:59:0x00ef, B:61:0x0121, B:76:0x012b, B:78:0x0135, B:80:0x013d, B:82:0x0147, B:84:0x014f, B:88:0x0160, B:90:0x0166, B:97:0x0181, B:99:0x0183, B:111:0x0192, B:114:0x019c, B:115:0x01b3), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[Catch: Exception -> 0x01f8, all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:16:0x01ce, B:37:0x00bd, B:41:0x00cb, B:43:0x00d1, B:49:0x00e8, B:51:0x00ea, B:65:0x0205, B:59:0x00ef, B:61:0x0121, B:76:0x012b, B:78:0x0135, B:80:0x013d, B:82:0x0147, B:84:0x014f, B:88:0x0160, B:90:0x0166, B:97:0x0181, B:99:0x0183, B:111:0x0192, B:114:0x019c, B:115:0x01b3), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0181 A[Catch: Exception -> 0x01f8, all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:16:0x01ce, B:37:0x00bd, B:41:0x00cb, B:43:0x00d1, B:49:0x00e8, B:51:0x00ea, B:65:0x0205, B:59:0x00ef, B:61:0x0121, B:76:0x012b, B:78:0x0135, B:80:0x013d, B:82:0x0147, B:84:0x014f, B:88:0x0160, B:90:0x0166, B:97:0x0181, B:99:0x0183, B:111:0x0192, B:114:0x019c, B:115:0x01b3), top: B:7:0x002c }] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.viewmodel.CsvAggregatorViewModel$scanRootTestDirectory$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
