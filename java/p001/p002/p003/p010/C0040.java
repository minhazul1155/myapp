package p001.p002.p003.p010;

import android.text.TextUtils;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p001.p002.p003.C0007;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ᴵ */
/* loaded from: classes.dex */
public class C0040 {
    /* renamed from: qhPUPʿˊᵎᵔʾʿـˉٴﾞᵎⁱʿⁱיᵢﹳʾˆˋˎˈᵔʻʿⁱˆʿـᵎRfMof */
    public static String m340qhPUPRfMof() {
        return BYDecoder.decode(StringPool.f133eOYqEijvhO, "b4c2216305f287d3");
    }

    /* renamed from: vyNKXˊʼˆˆˉـיᐧיـʽᐧיʾٴﹳיٴⁱﾞⁱᴵﾞˆʼᵔˈˈﹳAEfAB */
    public static String m341vyNKXAEfAB() {
        return BYDecoder.decode(StringPool.f72OcxqcTJYFo, "b4c2216305f287d3");
    }

    /* renamed from: ʿ */
    public static String m342(String string) {
        if (TextUtils.isEmpty(string)) {
            return C0007.f228;
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance(m340qhPUPRfMof());
            byte[] bytes = md5.digest(string.getBytes());
            String result = C0007.f228;
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 255);
                if (temp.length() == 1) {
                    temp = m341vyNKXAEfAB() + temp;
                }
                result = result + temp;
            }
            return result;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return C0007.f228;
        }
    }

    /* renamed from: ˆ */
    public static String m343(String encryptStr) {
        return m342(encryptStr).substring(8, 24);
    }
}
