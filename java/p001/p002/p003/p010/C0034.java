package p001.p002.p003.p010;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p001.p002.p003.C0007;
import p001.p002.p003.p009.C0019;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˎ */
/* loaded from: classes.dex */
public class C0034 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ˊ */
    public static final String f257 = "CrashHandler";

    /* renamed from: ʿ */
    public Context f258;

    /* renamed from: ˆ */
    public Thread.UncaughtExceptionHandler f259;

    /* renamed from: ˈ */
    public Map<String, String> f260 = new HashMap();

    /* renamed from: ˉ */
    public DateFormat f261 = new SimpleDateFormat(m255TNuIUQpDih());

    /* renamed from: BzJhcʻٴٴʾᵎˉיʾʿʾˈʾٴˏᵔʾיʾᵔᐧˈᵔـﹶٴˊᵎˎˑrHZiU */
    public static String m249BzJhcrHZiU() {
        return BYDecoder.decode(StringPool.f81QfKCnEZDFL, "75c97898a63b61dc");
    }

    /* renamed from: EJugRˊﾞˑʾˊʾﹳﹳᵎʽיᵢﹳˈᵔⁱˊʿˎˑˊʼﹳˑˑˋﹶʽﾞFUgKe */
    public static String m250EJugRFUgKe() {
        return BYDecoder.decode(StringPool.f41FMKSjIQIUl, "75c97898a63b61dc");
    }

    /* renamed from: HmQAJˈʿⁱʽⁱˊⁱʼיʻˆˎⁱʿˆﹳʻʼˈﹶᴵﹶˎᵔˎᵎᐧﹶˊﾞovTZK */
    public static String m251HmQAJovTZK() {
        return BYDecoder.decode(StringPool.f101WQNDleABuA, "75c97898a63b61dc");
    }

    /* renamed from: KaezKˎⁱˋˈʻʽˆˑʽʻʽـʾᵢˑᵎˑˋˑˈـˋﹳˊᐧᵎﾞˆʿˉJlOZV */
    public static String m252KaezKJlOZV() {
        return BYDecoder.decode(StringPool.f78QRFnyXsAvo, "75c97898a63b61dc");
    }

    /* renamed from: OHNuwˎʿʽˏـﹶˏˈ﻿ʿᵢʻﾞـʽˆﹳʾᐧˆﹳʿˈיʼᵢﾞﹶˈˊYWwSn */
    public static String m253OHNuwYWwSn() {
        return BYDecoder.decode(StringPool.f112ZayshAizbZ, "75c97898a63b61dc");
    }

    /* renamed from: OXVVFˈˉʾᵢˋᵢˈⁱﹶˊˑـⁱﾞᵔᵔˑʻʼⁱʼᵔˊʿˎᐧᵔˊnhyrU */
    public static String m254OXVVFnhyrU() {
        return BYDecoder.decode(StringPool.f23CbzyGOpzDB, "75c97898a63b61dc");
    }

    /* renamed from: TNuIUיˊᐧʿﹳᐧˉˏʽˋʽᵢʼᵢˉᴵٴˆـˈᐧᐧˏⁱـﾞᵔᵢـﹳQpDih */
    public static String m255TNuIUQpDih() {
        return BYDecoder.decode(StringPool.f39FCpVftlpOo, "75c97898a63b61dc");
    }

    /* renamed from: WRLCuˎˆᴵᵢˊᵢٴᵎˈⁱﾞˊﾞﹶﹶٴʻﾞˑʾⁱٴˑˎʼʼﹶʻﹶʻljdJt */
    public static String m256WRLCuljdJt() {
        return BYDecoder.decode(StringPool.f128daiIgsCSbS, "75c97898a63b61dc");
    }

    /* renamed from: XKGebˊٴˊˑٴʼˉʿˏˎʼᴵᵎٴˑיʽיﹳˈـʾיˋיʾⁱˆﹶˆchTjo */
    public static String m257XKGebchTjo() {
        return BYDecoder.decode(StringPool.f175puyQiiZQNT, "75c97898a63b61dc");
    }

    /* renamed from: XiYEvᐧˎˉʻʽˎˏᵎʼᐧﾞˉˆᐧˏᵎˆـיᵔˊᴵᴵﾞיⁱᵢٴˊqSpng */
    public static String m258XiYEvqSpng() {
        return BYDecoder.decode(StringPool.f26CvqOeDdyHU, "75c97898a63b61dc");
    }

    /* renamed from: ZMbXoˎﾞʻיـﾞיʼˑﾞⁱˏˉˆﹶᵎˆˊٴˏⁱᵢٴˎˋˋﾞˑᐧzjIoj */
    public static String m259ZMbXozjIoj() {
        return BYDecoder.decode(StringPool.f195uuROdbBqRh, "75c97898a63b61dc");
    }

    /* renamed from: euRNeᵎˆᵎיˏˋˊʼﹶﾞﹶˉᐧـⁱˋᵎʾʽʽﹳˆיᴵʿˆᵢﹳᵢwiFuz */
    public static String m260euRNewiFuz() {
        return BYDecoder.decode(StringPool.f219zajDpSNUad, "75c97898a63b61dc");
    }

    /* renamed from: kptGrᵎʻٴʼˑיʻﹶˋˊᴵʻᵔᵢˋˏˋˆᵎיʿʽˏᴵᵔʾˏᵔʾQSqdV */
    public static String m261kptGrQSqdV() {
        return BYDecoder.decode(StringPool.f32DfHIkWWNRX, "75c97898a63b61dc");
    }

    /* renamed from: mdgtuـʽᵎﾞᵢⁱˎٴﹶˆـٴﹶﾞˏʻˉᵎﾞˋᐧـˊﹳˋˈﹶʼⁱﾞLnWnp */
    public static String m262mdgtuLnWnp() {
        return BYDecoder.decode(StringPool.f106XZOdiOogdw, "75c97898a63b61dc");
    }

    /* renamed from: tXymVᐧʻˋٴﾞʻˈᵎٴʼʾˋʾˑˑᵔʼˊʻﹳˈᴵˎʽˆᴵﾞʿʼBFwQr */
    public static String m263tXymVBFwQr() {
        return BYDecoder.decode(StringPool.f194utnYNrFeGg, "75c97898a63b61dc");
    }

    /* renamed from: vLQkMʾˈᵢˈˊٴˋˆˊˋـᵢʻᐧʾـˆˆʽˋᵔˎᵎـﹳᵎﾞⁱKalFG */
    public static String m264vLQkMKalFG() {
        return BYDecoder.decode(StringPool.f189twHxtBVZYe, "75c97898a63b61dc");
    }

    /* renamed from: vMJgQﾞˎיʾᵎˏٴᵔיᴵʿˊﾞʻʾʼˎﹳˊˈʻˑˏʼˎˈﾞיʼᵎysXLC */
    public static String m265vMJgQysXLC() {
        return BYDecoder.decode(StringPool.f160lAjJzqhSQM, "75c97898a63b61dc");
    }

    /* renamed from: xPcbbʽיᐧʽᵔʼʽﾞﹳˉـᐧـˎᵎـﹳˈˈˋʿʽᵔᵢʿʿⁱˊʿʼCtUpK */
    public static String m266xPcbbCtUpK() {
        return BYDecoder.decode(StringPool.f44FxURkXZmAJ, "75c97898a63b61dc");
    }

    /* renamed from: yZUFGˎٴˊʽˎᐧˊᴵﹳʼʿʼˆˉˋᵎᵔᴵˏᴵˑˉˆˎᵔיﹳᵎˆˆkKMrX */
    public static String m267yZUFGkKMrX() {
        return BYDecoder.decode(StringPool.f47GtRpKZKZAh, "75c97898a63b61dc");
    }

    /* renamed from: ˆ */
    public void m272(Context context) {
        this.f258 = context;
        this.f259 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable ex) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (!m269(ex) && (uncaughtExceptionHandler = this.f259) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, ex);
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            Log.e(m252KaezKJlOZV(), m267yZUFGkKMrX(), e);
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: ʿ */
    private boolean m269(Throwable ex) {
        if (ex == null) {
            return false;
        }
        new C0035().start();
        m271(this.f258);
        m270(ex);
        return true;
    }

    /* renamed from: ˆ.ʿ.ʿ.ˋ.ˎ$ʿ */
    public class C0035 extends Thread {
        /* renamed from: hTwbUﹳٴᴵﹶˋﹳﹶʼˊᵎٴʼᵔʿˎᵢﹳˉˆᴵﹶⁱᵔⁱᵢˏᵢᵎˏʼgwYGQ */
        public static String m273hTwbUgwYGQ() {
            return BYDecoder.decode(StringPool.f46GPckZMfOFJ, "8a2638bea8b8e5f0");
        }

        public C0035() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            C0019.m108(C0034.this.f258, m273hTwbUgwYGQ());
            Looper.loop();
        }
    }

    /* renamed from: ʿ */
    public void m271(Context ctx) {
        String m260euRNewiFuz = m260euRNewiFuz();
        try {
            PackageManager pm = ctx.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(ctx.getPackageName(), 1);
            if (pi != null) {
                String versionName = pi.versionName == null ? m257XKGebchTjo() : pi.versionName;
                String versionCode = pi.versionCode + C0007.f228;
                this.f260.put(m259ZMbXozjIoj(), versionName);
                this.f260.put(m265vMJgQysXLC(), versionCode);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(m260euRNewiFuz, m249BzJhcrHZiU(), e);
        }
        Field[] fields = Build.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                this.f260.put(field.getName(), field.get(null).toString());
                Log.d(m260euRNewiFuz, field.getName() + m266xPcbbCtUpK() + field.get(null));
            } catch (Exception e2) {
                Log.e(m260euRNewiFuz, m264vLQkMKalFG(), e2);
            }
        }
    }

    /* renamed from: ˆ */
    private String m270(Throwable ex) {
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> entry : this.f260.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key + m254OXVVFnhyrU() + value + m263tXymVBFwQr());
        }
        Writer writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        ex.printStackTrace(printWriter);
        for (Throwable cause = ex.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        String result = writer.toString();
        sb.append(result);
        try {
            long timestamp = System.currentTimeMillis();
            String time = this.f261.format(new Date());
            String fileName = m262mdgtuLnWnp() + time + m251HmQAJovTZK() + timestamp + m256WRLCuljdJt();
            if (Environment.getExternalStorageState().equals(m258XiYEvqSpng())) {
                String path = m261kptGrQSqdV();
                File dir = new File(path);
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                FileOutputStream fos = new FileOutputStream(path + fileName);
                fos.write(sb.toString().getBytes());
                fos.close();
            }
            return fileName;
        } catch (Exception e) {
            Log.e(m253OHNuwYWwSn(), m250EJugRFUgKe(), e);
            return null;
        }
    }
}
