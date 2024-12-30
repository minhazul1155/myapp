package p001.p002.p003.p010;

import android.app.Application;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.lang.reflect.Method;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0033 {
    /* renamed from: DoAaGﹶˎᴵˋᵔᴵˉʽᵎˊᵔﾞⁱᵢʼˏˑˆᵔᴵᐧⁱיʼˏˊﾞˉʻᵎLQoSY, reason: contains not printable characters */
    public static String m245DoAaGLQoSY() {
        return BYDecoder.decode(StringPool.f45FxgfMHkSAy, "4111aa3cad6e1f67");
    }

    /* renamed from: DozAAⁱʻˎʻﾞᵔʿـʼᵢـˈˉᴵⁱᴵˏʾᴵʿˎˑʽˈˈٴˎˏˑʾKxriZ, reason: contains not printable characters */
    public static String m246DozAAKxriZ() {
        return BYDecoder.decode(StringPool.f200vqibMVCzDn, "4111aa3cad6e1f67");
    }

    /* renamed from: pmloCˋᵔˆᵎיⁱˎˈᵔــᵔˉˆˋˋٴﹳˏʼᵎˆˑˎـᵔᴵᴵﹳᴵCaBDP, reason: contains not printable characters */
    public static String m247pmloCCaBDP() {
        return BYDecoder.decode(StringPool.f151jMuxspwPGB, "4111aa3cad6e1f67");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Application m248() {
        try {
            Class<?> activityThreadClass = Class.forName(m245DoAaGLQoSY());
            Method method2 = activityThreadClass.getMethod(m246DozAAKxriZ(), new Class[0]);
            Object localObject = method2.invoke(null, null);
            Method method = activityThreadClass.getMethod(m247pmloCCaBDP(), new Class[0]);
            Application application = (Application) method.invoke(localObject, null);
            return application;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
