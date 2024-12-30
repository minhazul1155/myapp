package cn.beingyi.sub.utils;

import android.content.Context;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;

/* loaded from: classes.dex */
public class Native {
    public static native String getHead(Context context, String str);

    public static native String getKey(Context context);

    public static native String getStringKey(Context context);

    /* renamed from: umLTkٴˑٴʼˉﹶٴﾞˆʽﹶʿــﾞיٴˑـˉٴˎʻˏˎˎˏʿٴﾞLrYcR, reason: contains not printable characters */
    public static String m40umLTkLrYcR() {
        return BYDecoder.decode(StringPool.f110YinXFTdFnk, "82063f338cfc4d4c");
    }

    static {
        System.loadLibrary(m40umLTkLrYcR());
    }
}
