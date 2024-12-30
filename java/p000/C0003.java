package p000;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;

/* renamed from: ʿ.ʿ */
/* loaded from: classes.dex */
public class C0003 extends AbstractC0005 {

    /* renamed from: ˆ */
    public static final char[] f220 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: ˈ */
    public static final byte[] f221 = new byte[256];

    /* renamed from: ʿ */
    public byte[] f222 = new byte[4];

    /* renamed from: ydlCxﹳיˉᵎʼᐧˊﹶᵎˎﹳᐧٴʿיᐧˉˉˑʼˆʻˈﹶˎᵢᵔﹶﾞSgGla */
    public static String m45ydlCxSgGla() {
        return BYDecoder.decode(StringPool.f168nwdPxArtWv, "0849da515f1573d3");
    }

    @Override // p000.AbstractC0005
    /* renamed from: ʿ */
    public int mo46() {
        return 4;
    }

    @Override // p000.AbstractC0005
    /* renamed from: ˆ */
    public int mo48() {
        return 72;
    }

    static {
        for (int i = 0; i < 255; i++) {
            f221[i] = -1;
        }
        int i2 = 0;
        while (true) {
            char[] cArr = f220;
            if (i2 >= cArr.length) {
                return;
            }
            f221[cArr[i2]] = (byte) i2;
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    @Override // p000.AbstractC0005
    /* renamed from: ʿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo47(java.io.PushbackInputStream r13, java.io.OutputStream r14, int r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003.mo47(java.io.PushbackInputStream, java.io.OutputStream, int):void");
    }
}
