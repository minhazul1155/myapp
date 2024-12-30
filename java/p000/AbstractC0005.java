package p000;

import Decoder.CEStreamExhausted;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;

/* renamed from: ʿ.ˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0005 {
    /* renamed from: ʿ */
    public abstract int mo46();

    /* renamed from: ˆ */
    public abstract int mo48();

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m54(PushbackInputStream aStream, OutputStream bStream) {
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m59(PushbackInputStream aStream, OutputStream bStream) {
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m60(PushbackInputStream aStream, OutputStream bStream) {
        return mo48();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m61(PushbackInputStream aStream, OutputStream bStream) {
    }

    /* renamed from: ʿ */
    public void mo47(PushbackInputStream aStream, OutputStream bStream, int l) {
        throw new CEStreamExhausted();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m52(InputStream in, byte[] buffer, int offset, int len) {
        for (int i = 0; i < len; i++) {
            int q = in.read();
            if (q == -1) {
                if (i == 0) {
                    return -1;
                }
                return i;
            }
            buffer[i + offset] = (byte) q;
        }
        return len;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m53(InputStream aStream, OutputStream bStream) {
        int totalBytes = 0;
        PushbackInputStream ps = new PushbackInputStream(aStream);
        m54(ps, bStream);
        while (true) {
            try {
                int length = m60(ps, bStream);
                int i = 0;
                while (mo46() + i < length) {
                    mo47(ps, bStream, mo46());
                    totalBytes += mo46();
                    i += mo46();
                }
                if (mo46() + i == length) {
                    mo47(ps, bStream, mo46());
                    totalBytes += mo46();
                } else {
                    mo47(ps, bStream, length - i);
                    totalBytes += length - i;
                }
                m61(ps, bStream);
            } catch (CEStreamExhausted e) {
                m59(ps, bStream);
                return;
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public byte[] m56(String inputString) {
        byte[] inputBuffer = new byte[inputString.length()];
        inputString.getBytes(0, inputString.length(), inputBuffer, 0);
        InputStream inStream = new ByteArrayInputStream(inputBuffer);
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        m53(inStream, outStream);
        return outStream.toByteArray();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public byte[] m55(InputStream in) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        m53(in, outStream);
        return outStream.toByteArray();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public ByteBuffer m58(String inputString) {
        return ByteBuffer.wrap(m56(inputString));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public ByteBuffer m57(InputStream in) {
        return ByteBuffer.wrap(m55(in));
    }
}
