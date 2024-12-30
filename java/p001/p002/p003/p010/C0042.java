package p001.p002.p003.p010;

import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ᵔ */
/* loaded from: classes.dex */
public class C0042 {

    /* renamed from: ʿ */
    public ZipFile f264;

    /* renamed from: ˆ */
    public String f265;

    /* renamed from: ˈ */
    public ZipOutputStream f266;

    /* renamed from: ˉ */
    public List<String> f267 = new ArrayList();

    /* renamed from: ˊ */
    public List<String> f268 = new ArrayList();

    /* renamed from: ˋ */
    public List<String> f269 = new ArrayList();

    /* renamed from: iCOdSˎˆٴיⁱˈיʽˆᵎˑˈˏˎᵎᵔˏˉﹶיᐧיʽˆˎˉﾞˆᐧʾLmfJu */
    public static String m349iCOdSLmfJu() {
        return BYDecoder.decode(StringPool.f59KioaIkQwAs, "00eb98f18ad094d7");
    }

    public C0042(String outPath) {
        this.f265 = outPath;
        this.f266 = new ZipOutputStream(new FileOutputStream(outPath));
    }

    /* renamed from: ʿ */
    public C0042 m351(ZipFile zipFile) {
        this.f264 = zipFile;
        m350(this.f264);
        return this;
    }

    /* renamed from: ʿ */
    public void m354(String entry, byte[] data) {
        this.f266.putNextEntry(new ZipEntry(entry));
        this.f266.write(data);
        this.f266.closeEntry();
        this.f267.add(entry);
    }

    /* renamed from: ʿ */
    public void m353(String entry) {
        this.f268.add(entry);
    }

    /* renamed from: ʿ */
    public void m352() {
        if (this.f264 == null) {
            throw new FileNotFoundException(m349iCOdSLmfJu());
        }
        for (String key : this.f269) {
            if (!this.f268.contains(key) && !this.f267.contains(key)) {
                ZipFile zipFile = this.f264;
                byte[] data = C0037.m320(zipFile.getInputStream(zipFile.getEntry(key)));
                this.f266.putNextEntry(new ZipEntry(key));
                this.f266.write(data);
                this.f266.closeEntry();
            }
        }
        this.f266.close();
        this.f264.close();
    }

    /* renamed from: ˆ */
    private void m350(ZipFile zip) {
        Enumeration enums = zip.entries();
        while (enums.hasMoreElements()) {
            ZipEntry entry = enums.nextElement();
            String entryName = entry.getName();
            this.f269.add(entryName);
        }
    }
}
