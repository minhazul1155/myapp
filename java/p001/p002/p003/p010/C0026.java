package p001.p002.p003.p010;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˉ */
/* loaded from: classes.dex */
public class C0026 {

    /* renamed from: ʿ */
    public static final String f248 = "AES/ECB/PKCS5Padding";

    /* renamed from: LeyhlˎﹳˆﹶˊᐧﾞﹶˉˑˉﹳʾﹶᵢʿـˑʾˆˈـʻﹶٴﾞᐧٴʼˊHoGtN */
    public static String m159LeyhlHoGtN() {
        return BYDecoder.decode(StringPool.f149iWMLcVkfYz, "b8dd17c700631758");
    }

    /* renamed from: dhapnˉˈᵔᴵʿᵢﹶـᵎᐧᵎˎˆʾᵔﾞˋﹶٴﹳﾞˑʿـᵎﹶⁱʾˆـsscyW */
    public static String m160dhapnsscyW() {
        return BYDecoder.decode(StringPool.f55IqftAoektQ, "b8dd17c700631758");
    }

    /* renamed from: rXDwvʻˑʿٴʾˑⁱⁱˊˈﹶיʾˋˊᵢˆˏᵢˋᵢˑᵢˎᵎﹳﾞʻⁱˉayaIg */
    public static String m161rXDwvayaIg() {
        return BYDecoder.decode(StringPool.f182sJJRQlrzww, "b8dd17c700631758");
    }

    /* renamed from: ˆ */
    public static byte[] m164(byte[] data, String keyStr) {
        try {
            Key key = m162(C0040.m343(keyStr));
            Cipher cipher = Cipher.getInstance(m160dhapnsscyW());
            cipher.init(1, key);
            byte[] encrypt = cipher.doFinal(data);
            return encrypt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ʿ */
    public static byte[] m163(byte[] data, String keyStr) {
        try {
            Key key = m162(C0040.m343(keyStr));
            Cipher cipher = Cipher.getInstance(m159LeyhlHoGtN());
            cipher.init(2, key);
            byte[] decrypt = cipher.doFinal(data);
            return decrypt;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ʿ */
    public static Key m162(String key) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), m161rXDwvayaIg());
            return keySpec;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
