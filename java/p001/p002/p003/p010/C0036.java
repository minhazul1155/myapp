package p001.p002.p003.p010;

import android.os.Process;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.IOException;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0036 {
    /* renamed from: nsduKˋˏˑˈﹶˎˊـʽˈיᵔʽٴـᵢᴵˆᴵـᴵᐧˋﹶʾˎˏﹳˑיQCvPe, reason: contains not printable characters */
    public static String m274nsduKQCvPe() {
        return BYDecoder.decode(StringPool.f34EXMSyWGfgL, "ff8bd5d3032a28df");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m275() {
        String exitCmd = m274nsduKQCvPe() + Process.myPid();
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(exitCmd);
        } catch (IOException e) {
        }
    }
}
