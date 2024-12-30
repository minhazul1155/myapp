package p000;

import java.io.OutputStream;

/* renamed from: ʿ.ˆ */
/* loaded from: classes.dex */
public class C0004 extends AbstractC0006 {

    /* renamed from: ˆ */
    public static final char[] f223 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    @Override // p000.AbstractC0006
    /* renamed from: ʿ */
    public int mo49() {
        return 3;
    }

    @Override // p000.AbstractC0006
    /* renamed from: ˆ */
    public int mo51() {
        return 57;
    }

    @Override // p000.AbstractC0006
    /* renamed from: ʿ */
    public void mo50(OutputStream outStream, byte[] data, int offset, int len) {
        if (len == 1) {
            byte a = data[offset];
            outStream.write(f223[(a >>> 2) & 63]);
            outStream.write(f223[((a << 4) & 48) + ((0 >>> 4) & 15)]);
            outStream.write(61);
            outStream.write(61);
            return;
        }
        if (len == 2) {
            byte a2 = data[offset];
            byte b = data[offset + 1];
            outStream.write(f223[(a2 >>> 2) & 63]);
            outStream.write(f223[((a2 << 4) & 48) + ((b >>> 4) & 15)]);
            outStream.write(f223[((b << 2) & 60) + ((0 >>> 6) & 3)]);
            outStream.write(61);
            return;
        }
        byte a3 = data[offset];
        byte b2 = data[offset + 1];
        byte c = data[offset + 2];
        outStream.write(f223[(a3 >>> 2) & 63]);
        outStream.write(f223[((a3 << 4) & 48) + ((b2 >>> 4) & 15)]);
        outStream.write(f223[((b2 << 2) & 60) + ((c >>> 6) & 3)]);
        outStream.write(f223[c & 63]);
    }
}
