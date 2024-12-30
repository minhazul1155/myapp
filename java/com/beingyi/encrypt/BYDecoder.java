package com.beingyi.encrypt;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class BYDecoder {
    public static String s1 = "fff";
    public static String s2 = "fsghff";

    public static String decode() {
        String text = StringPool.s1;
        String result = decode(text, "#pass");
        return result;
    }

    public static String decode(String text, String pass) {
        byte[] result;
        int hexlen = text.length();
        if (hexlen % 2 == 1) {
            hexlen++;
            result = new byte[hexlen / 2];
            text = "0" + text;
        } else {
            result = new byte[hexlen / 2];
        }
        int j = 0;
        for (int i = 0; i < hexlen; i += 2) {
            result[j] = (byte) Integer.parseInt(text.substring(i, i + 2), 16);
            j++;
        }
        byte[] decrypt = null;
        try {
            Key key = new SecretKeySpec(pass.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, key);
            decrypt = cipher.doFinal(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(decrypt);
    }
}
