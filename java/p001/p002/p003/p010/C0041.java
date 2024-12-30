package p001.p002.p003.p010;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p001.p002.p003.C0007;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ᵎ */
/* loaded from: classes.dex */
public class C0041 {
    /* renamed from: ˉ */
    public static int m347(Context context) {
        PackageManager manager = context.getPackageManager();
        try {
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            int code = info.versionCode;
            return code;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: ˊ */
    public static String m348(Context context) {
        PackageManager manager = context.getPackageManager();
        try {
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            String name = info.versionName;
            return name;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return C0007.f228;
        }
    }

    /* renamed from: ʿ */
    public static String m344(Context context) {
        String path = context.getPackageResourcePath();
        return path;
    }

    /* renamed from: ˆ */
    public static int m345(Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 64);
            Signature[] s = pi.signatures;
            int sig = s[0].hashCode();
            return sig;
        } catch (Exception e1) {
            e1.printStackTrace();
            return 0;
        }
    }

    /* renamed from: ˈ */
    public static String m346(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            Signature[] signatures = packageInfo.signatures;
            return signatures[0].toCharsString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
