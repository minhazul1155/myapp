package p001.p002.p003.p010;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˈ */
/* loaded from: classes.dex */
public class C0025 {
    /* renamed from: VeePXˉʽˑﹳʻʻᵢˈʻˏיʾˋˉـⁱﾞˆʾﹳˊʾʾˏˊˆᵢʻˊˎradkJ */
    public static String m157VeePXradkJ() {
        return BYDecoder.decode(StringPool.f184sSAFimLhbX, "0cad547eba523ed8");
    }

    /* renamed from: ʿ */
    public static String m158(String path) {
        String m157VeePXradkJ = m157VeePXradkJ();
        if (path.contains(m157VeePXradkJ)) {
            String result = path.subSequence(path.lastIndexOf(m157VeePXradkJ) + 1, path.length()).toString();
            return path.replace(result, C0040.m342(result));
        }
        return C0040.m342(path);
    }
}
