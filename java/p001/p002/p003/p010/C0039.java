package p001.p002.p003.p010;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p001.p002.p003.C0007;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ᐧ */
/* loaded from: classes.dex */
public class C0039 {
    /* renamed from: BChVqˉˑʾʾˊˏˎˆﹶـﹳᵢﹶˆʻـٴʻˑᵔʼᵎˆᐧʻᵢٴᵎʼᴵZIatZ */
    public static String m334BChVqZIatZ() {
        return BYDecoder.decode(StringPool.f137fapBNetKPU, "0d862b400eaf3f45");
    }

    /* renamed from: ZkDIXˉˈˎﹶˈʼʿᐧⁱʼᵎﹳﹳـٴˉﹶˎﾞٴˊˊʽʼᵔʼʿˆˑsnVjb */
    public static String m335ZkDIXsnVjb() {
        return BYDecoder.decode(StringPool.f57KRojFnsGJe, "0d862b400eaf3f45");
    }

    /* renamed from: zJCyGʽⁱˊˏﹳˏʿⁱᴵⁱʻˉˉⁱˊʻˋˉᐧˈˉʼʻʼᵎⁱﾞـˊʼXQAKb */
    public static String m336zJCyGXQAKb() {
        return BYDecoder.decode(StringPool.f170oTwqdFXrsg, "0d862b400eaf3f45");
    }

    /* renamed from: ʿ */
    public static String m337(ArrayList<String> list) {
        if (list.size() == 0) {
            return C0007.f228;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String m335ZkDIXsnVjb = m335ZkDIXsnVjb();
            if (hasNext) {
                String s = it.next();
                sb.append(m335ZkDIXsnVjb);
                sb.append(s);
            } else {
                return new String(sb).replaceFirst(m335ZkDIXsnVjb, C0007.f228);
            }
        }
    }

    /* renamed from: ʿ */
    public static String m338(List<String> list) {
        if (list.size() == 0) {
            return C0007.f228;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String m334BChVqZIatZ = m334BChVqZIatZ();
            if (hasNext) {
                String s = it.next();
                sb.append(m334BChVqZIatZ);
                sb.append(s);
            } else {
                return new String(sb).replaceFirst(m334BChVqZIatZ, C0007.f228);
            }
        }
    }

    /* renamed from: ʿ */
    public static ArrayList<String> m339(String str) {
        String m336zJCyGXQAKb = m336zJCyGXQAKb();
        if (str.contains(m336zJCyGXQAKb)) {
            return new ArrayList<>(Arrays.asList(str.split(m336zJCyGXQAKb)));
        }
        if (str.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(C0007.f228);
            return result;
        }
        ArrayList<String> result2 = new ArrayList<>();
        result2.add(str);
        return result2;
    }
}
