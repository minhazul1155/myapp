package p000;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;

/* renamed from: ʿ.ˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0006 {

    /* renamed from: ʿ, reason: contains not printable characters */
    public PrintStream f224;

    /* renamed from: SXRsiˋˏـʾʻᵔˈˑˑʻﾞʽיʻˊʻʾʼﾞﾞʾⁱⁱˋـʾˎـʾQeTbg, reason: contains not printable characters */
    public static String m62SXRsiQeTbg() {
        return BYDecoder.decode(StringPool.f14AgOsChFzhx, "5029d5ea2be93328");
    }

    /* renamed from: gOocRᵢᐧˏᐧᐧﾞʽʾʿʿᵔʽˆٴʻˎʿʾﹳﾞˎʽˑٴˑⁱʽⁱᐧhsVOB, reason: contains not printable characters */
    public static String m63gOocRhsVOB() {
        return BYDecoder.decode(StringPool.f12AEwToMguCE, "5029d5ea2be93328");
    }

    /* renamed from: ziauUˋᵔʻיᵔᵔᐧﹳᵢʼˎʻˆˎיٴˊˑˏיﹳﹶᵔʻﾞﾞᵢʾٴʽspxZq, reason: contains not printable characters */
    public static String m64ziauUspxZq() {
        return BYDecoder.decode(StringPool.f117ajUXzXiWOi, "5029d5ea2be93328");
    }

    /* renamed from: ʿ */
    public abstract int mo49();

    /* renamed from: ʿ */
    public abstract void mo50(OutputStream outputStream, byte[] bArr, int i, int i2);

    /* renamed from: ˆ */
    public abstract int mo51();

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m70(OutputStream aStream) {
        this.f224 = new PrintStream(aStream);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m77(OutputStream aStream) {
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m71(OutputStream aStream, int aLength) {
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m80(OutputStream aStream) {
        this.f224.println();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m66(InputStream in, byte[] buffer) {
        for (int i = 0; i < buffer.length; i++) {
            int q = in.read();
            if (q == -1) {
                return i;
            }
            buffer[i] = (byte) q;
        }
        int i2 = buffer.length;
        return i2;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m69(InputStream inStream, OutputStream outStream) {
        byte[] tmpbuffer = new byte[mo51()];
        m70(outStream);
        while (true) {
            int numBytes = m66(inStream, tmpbuffer);
            if (numBytes == 0) {
                break;
            }
            m71(outStream, numBytes);
            int j = 0;
            while (j < numBytes) {
                if (mo49() + j <= numBytes) {
                    mo50(outStream, tmpbuffer, j, mo49());
                } else {
                    mo50(outStream, tmpbuffer, j, numBytes - j);
                }
                j += mo49();
            }
            if (numBytes < mo51()) {
                break;
            } else {
                m80(outStream);
            }
        }
        m77(outStream);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m73(byte[] aBuffer, OutputStream aStream) {
        ByteArrayInputStream inStream = new ByteArrayInputStream(aBuffer);
        m69(inStream, aStream);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m68(byte[] aBuffer) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        InputStream inStream = new ByteArrayInputStream(aBuffer);
        try {
            m69(inStream, outStream);
            String retVal = outStream.toString(m62SXRsiQeTbg());
            return retVal;
        } catch (Exception e) {
            throw new Error(m63gOocRhsVOB());
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private byte[] m65(ByteBuffer bb) {
        byte[] buf = null;
        if (bb.hasArray()) {
            byte[] tmp = bb.array();
            if (tmp.length == bb.capacity() && tmp.length == bb.remaining()) {
                buf = tmp;
                bb.position(bb.limit());
            }
        }
        if (buf == null) {
            byte[] buf2 = new byte[bb.remaining()];
            bb.get(buf2);
            return buf2;
        }
        return buf;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m72(ByteBuffer aBuffer, OutputStream aStream) {
        byte[] buf = m65(aBuffer);
        m73(buf, aStream);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m67(ByteBuffer aBuffer) {
        byte[] buf = m65(aBuffer);
        return m68(buf);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m76(InputStream inStream, OutputStream outStream) {
        int numBytes;
        byte[] tmpbuffer = new byte[mo51()];
        m70(outStream);
        do {
            numBytes = m66(inStream, tmpbuffer);
            if (numBytes == 0) {
                break;
            }
            m71(outStream, numBytes);
            int j = 0;
            while (j < numBytes) {
                if (mo49() + j <= numBytes) {
                    mo50(outStream, tmpbuffer, j, mo49());
                } else {
                    mo50(outStream, tmpbuffer, j, numBytes - j);
                }
                j += mo49();
            }
            m80(outStream);
        } while (numBytes >= mo51());
        m77(outStream);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m79(byte[] aBuffer, OutputStream aStream) {
        ByteArrayInputStream inStream = new ByteArrayInputStream(aBuffer);
        m76(inStream, aStream);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public String m75(byte[] aBuffer) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        InputStream inStream = new ByteArrayInputStream(aBuffer);
        try {
            m76(inStream, outStream);
            return outStream.toString();
        } catch (Exception e) {
            throw new Error(m64ziauUspxZq());
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m78(ByteBuffer aBuffer, OutputStream aStream) {
        byte[] buf = m65(aBuffer);
        m79(buf, aStream);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public String m74(ByteBuffer aBuffer) {
        byte[] buf = m65(aBuffer);
        return m75(buf);
    }
}
