package p001.p002.p003.p004;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.IOException;
import java.util.zip.ZipFile;
import p001.p002.p003.C0007;
import p001.p002.p003.p010.C0025;
import p001.p002.p003.p010.C0034;

/* renamed from: ˆ.ʿ.ʿ.ˈ.ˆ */
/* loaded from: classes.dex */
public class ApplicationC0017 extends Application {

    /* renamed from: ʿ */
    public static Context f231;

    /* renamed from: XKEWmˑᵔʽʻˋˏᴵᵢˑᵎʾˊᵔᐧᵎـˊⁱˏˊˋⁱᵢˊʾᵢˊˎFkJOd */
    public static String m97XKEWmFkJOd() {
        return BYDecoder.decode(StringPool.f62LeipdtVYVU, "b6ce120c2422ab1c");
    }

    /* renamed from: bwzcwﹶʿיʻˎﹶˎˏᵔᐧיˋﾞʻˆᵎˉˋﹶייᵔᴵˉˊˋˑˈᵎzbbcb */
    public static String m98bwzcwzbbcb() {
        return BYDecoder.decode(StringPool.f99WBYXhrXafi, "b6ce120c2422ab1c");
    }

    /* renamed from: huolwʼˉᴵˆﹶᵔﹳˉˆˑᵎʽʾᵎˆᴵʼᴵˏʻʾʻʾˑˎˎʼʽᵢﹶSEmLb */
    public static String m99huolwSEmLb() {
        return BYDecoder.decode(StringPool.f83QkuDQRQnxv, "b6ce120c2422ab1c");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        try {
            ZipFile zipFile = new ZipFile(m102(base));
            zipFile.getEntry(m97XKEWmFkJOd() + C0025.m158(m98bwzcwzbbcb()));
            zipFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.attachBaseContext(base);
        f231 = base;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C0034 crashHandler = new C0034();
        crashHandler.m272(getApplicationContext());
        f231 = getApplicationContext();
    }

    /* renamed from: ʿ */
    public static Context m100() {
        return f231;
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        System.exit(0);
    }

    /* renamed from: ˆ */
    private String m101(Context context) {
        int pid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(m99huolwSEmLb());
        for (ActivityManager.RunningAppProcessInfo appProcess : activityManager.getRunningAppProcesses()) {
            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return C0007.f228;
    }

    /* renamed from: ʿ */
    public String m102(Context context) {
        String path = context.getPackageResourcePath();
        return path;
    }
}
