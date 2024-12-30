package p001.p002.p003.p010;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0024 {
    /* renamed from: jZjIDﹳᐧˉˊﹳˏٴˋٴᴵˈˉـˊᵢᵔʻˉﹳˑٴיᵎˊᵎˉʻיﹶיJrGwN, reason: contains not printable characters */
    public static String m149jZjIDJrGwN() {
        return BYDecoder.decode(StringPool.f179qiMDeApZhe, "325c29153a8e201f");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static String m150(Context context, String apkPath) {
        PackageManager pm = context.getPackageManager();
        PackageInfo info = pm.getPackageArchiveInfo(apkPath, 1);
        if (info != null) {
            ApplicationInfo appInfo = info.applicationInfo;
            appInfo.sourceDir = apkPath;
            appInfo.publicSourceDir = apkPath;
            try {
                return appInfo.loadLabel(pm).toString();
            } catch (OutOfMemoryError e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static String m151(Context context, String apkPath) {
        PackageManager pm = context.getPackageManager();
        PackageInfo info = pm.getPackageArchiveInfo(apkPath, 1);
        if (info != null) {
            ApplicationInfo appInfo = info.applicationInfo;
            appInfo.sourceDir = apkPath;
            appInfo.publicSourceDir = apkPath;
            try {
                return appInfo.packageName.toString();
            } catch (OutOfMemoryError e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m155(Context context, String apkPath) {
        PackageManager pm = context.getPackageManager();
        PackageInfo info = pm.getPackageArchiveInfo(apkPath, 1);
        if (info != null) {
            ApplicationInfo appInfo = info.applicationInfo;
            appInfo.sourceDir = apkPath;
            appInfo.publicSourceDir = apkPath;
            try {
                appInfo.packageName.toString();
                return true;
            } catch (OutOfMemoryError e) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static int m152(Context context, String apkPath) {
        PackageManager pm = context.getPackageManager();
        PackageInfo info = pm.getPackageArchiveInfo(apkPath, 1);
        if (info != null) {
            ApplicationInfo appInfo = info.applicationInfo;
            appInfo.sourceDir = apkPath;
            appInfo.publicSourceDir = apkPath;
            try {
                if (info.versionCode == 0) {
                    return 0;
                }
                return info.versionCode;
            } catch (OutOfMemoryError e) {
            }
        }
        return 0;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static String m153(Context context, String apkPath) {
        PackageManager pm = context.getPackageManager();
        PackageInfo info = pm.getPackageArchiveInfo(apkPath, 1);
        if (info != null) {
            ApplicationInfo appInfo = info.applicationInfo;
            appInfo.sourceDir = apkPath;
            appInfo.publicSourceDir = apkPath;
            try {
                return info.versionName == null ? m149jZjIDJrGwN() : info.versionName;
            } catch (OutOfMemoryError e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m154(Context context, String packagename) {
        PackageManager localPackageManager = ((Activity) context).getPackageManager();
        try {
            localPackageManager.getPackageInfo(packagename, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m156(Context context, String packagename) {
        PackageManager packageManager = context.getPackageManager();
        new Intent();
        Intent intent = packageManager.getLaunchIntentForPackage(packagename);
        context.startActivity(intent);
    }
}
