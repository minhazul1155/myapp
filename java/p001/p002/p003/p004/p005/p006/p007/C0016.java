package p001.p002.p003.p004.p005.p006.p007;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: ˆ.ʿ.ʿ.ˈ.ʿ.ʿ.ʿ.ˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0016 {
    /* renamed from: EZqJMˊˎⁱˉˏⁱⁱᵎˉᴵˉיﹶˉـﹳʿˋˏˋᵎʽ﻿ʿˈᵢٴᵎﾞZWlKa, reason: contains not printable characters */
    public static String m88EZqJMZWlKa() {
        return BYDecoder.decode(StringPool.f127dTQNeBIiah, "05be71f8b6c3c2f9");
    }

    /* renamed from: FvfEaˋˏˋʾʻـˋـᵎᵢʻʿᐧʿˉⁱʾˏˋˋˎˆⁱˑﾞʿˆיᵎˏSYAmF, reason: contains not printable characters */
    public static String m89FvfEaSYAmF() {
        return BYDecoder.decode(StringPool.f186sjpAwmvwwc, "05be71f8b6c3c2f9");
    }

    /* renamed from: JvhAiˏﹳיٴʿˋᵢʾʼﹳˎﹳᵎᴵʽיᵢˏˑﾞⁱˋـˑﹶˎˑᴵˊmVUuQ, reason: contains not printable characters */
    public static String m90JvhAimVUuQ() {
        return BYDecoder.decode(StringPool.f73OoKylEpTng, "05be71f8b6c3c2f9");
    }

    /* renamed from: fjDnrˎˋᵔﹶᵢᵎˈـˋʼˑﹳˉᵔˎʻʾﾞﾞʼⁱﹳʻᐧﾞˈﾞʾʾﹳydfhn, reason: contains not printable characters */
    public static String m91fjDnrydfhn() {
        return BYDecoder.decode(StringPool.f113ZyOkTCIjfM, "05be71f8b6c3c2f9");
    }

    /* renamed from: lPaCzʿﹳﹳᵢᵔﹳʽיʻⁱʽﹶˊﹳˑᵎᴵﹳـᵎـʾˉﾞﹶˆﾞᐧˎᴵxhcYI, reason: contains not printable characters */
    public static String m92lPaCzxhcYI() {
        return BYDecoder.decode(StringPool.f48HEcbDEkKXe, "05be71f8b6c3c2f9");
    }

    /* renamed from: qscLyˉˏⁱיﾞʾʽⁱʿᴵˉٴﹶᴵʽـᴵᵎˆᵢʾـᵔʼᴵﾞـﹳʿwATbU, reason: contains not printable characters */
    public static String m93qscLywATbU() {
        return BYDecoder.decode(StringPool.f124cAFBTnVRKi, "05be71f8b6c3c2f9");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static byte[] m96(File file) {
        RandomAccessFile r = new RandomAccessFile(file, m93qscLywATbU());
        byte[] buffer = new byte[(int) r.length()];
        r.readFully(buffer);
        r.close();
        return buffer;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Field m94(Object instance, String name) {
        for (Class clazz = instance.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            try {
                Field field = clazz.getDeclaredField(name);
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            } catch (NoSuchFieldException e) {
            }
        }
        throw new NoSuchFieldException(m90JvhAimVUuQ() + name + m88EZqJMZWlKa() + instance.getClass());
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Method m95(Object instance, String name, Class... parameterTypes) {
        for (Class clazz = instance.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            try {
                Method method = clazz.getDeclaredMethod(name, parameterTypes);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                return method;
            } catch (NoSuchMethodException e) {
            }
        }
        throw new NoSuchMethodException(m89FvfEaSYAmF() + name + m91fjDnrydfhn() + Arrays.asList(parameterTypes) + m92lPaCzxhcYI() + instance.getClass());
    }
}
