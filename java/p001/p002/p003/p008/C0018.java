package p001.p002.p003.p008;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Method;

/* renamed from: ˆ.ʿ.ʿ.ˉ.ʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0018 extends DexClassLoader {

    /* renamed from: ʿ, reason: contains not printable characters */
    public ClassLoader f232;

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f233;

    /* renamed from: IzYlhٴᵢʾـٴʻᵎˋⁱˈיˉˑˎʻˊˉﹳᵎˋᵎᵢﾞʼᵎˉᵢٴʻˎComCk, reason: contains not printable characters */
    public static String m103IzYlhComCk() {
        return BYDecoder.decode(StringPool.f65MbflnRWGAS, "00e55b083e0e324e");
    }

    /* renamed from: YZQiQﹳˋʿˉᵔˊـᵢˉˎˉﹳⁱᴵʻˑˉᐧˉיˈᵔﹶʿᵎᵢˆיˉᵢhbzLS, reason: contains not printable characters */
    public static String m104YZQiQhbzLS() {
        return BYDecoder.decode(StringPool.f188swoCCbBFLY, "00e55b083e0e324e");
    }

    /* renamed from: fQkYFˎʿﾞᵢﹳˋᴵˊˎיˊˏﾞﾞˆﹶᵎᵢˎˈᵔʽـˈʽˑﾞʽʾˑjzOkw, reason: contains not printable characters */
    public static String m105fQkYFjzOkw() {
        return BYDecoder.decode(StringPool.f51IAQieEiQeU, "00e55b083e0e324e");
    }

    /* renamed from: wxSDOˏˆᴵʻᵢʼᵢﹳⁱˆʾﾞـᴵٴˉـᵢˏʼˏʼᴵʿﹳﹶיᵔʿʾVmbuC, reason: contains not printable characters */
    public static String m106wxSDOVmbuC() {
        return BYDecoder.decode(StringPool.f89TZlhPkbaxn, "00e55b083e0e324e");
    }

    public C0018(byte[] bytes, String dexPath, String optimizedDirectory, String librarySearchPath, ClassLoader parent) {
        super(dexPath, optimizedDirectory, librarySearchPath, parent);
        m107(bytes, parent);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m107(byte[] bytes, ClassLoader parent) {
        this.f232 = parent;
        try {
            Class clz = Class.forName(m106wxSDOVmbuC());
            Method method = clz.getDeclaredMethod(m103IzYlhComCk(), byte[].class);
            method.setAccessible(true);
            this.f233 = ((Integer) method.invoke(null, bytes)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String name) {
        try {
            Class dexFile = Class.forName(m105fQkYFjzOkw());
            Method method = dexFile.getDeclaredMethod(m104YZQiQhbzLS(), String.class, ClassLoader.class, Integer.TYPE);
            method.setAccessible(true);
            Class c = (Class) method.invoke(null, name, this.f232, Integer.valueOf(this.f233));
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return super.loadClass(name);
        }
    }
}
