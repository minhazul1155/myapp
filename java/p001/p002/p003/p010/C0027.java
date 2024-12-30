package p001.p002.p003.p010;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Proxy;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import cn.beingyi.sub.utils.CheckUtils;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* renamed from: ˆ.ʿ.ʿ.ˋ.ˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0027 {

    /* renamed from: ˆ.ʿ.ʿ.ˋ.ˊ$ˆ, reason: contains not printable characters */
    public static class C0029 {
        /* renamed from: AkiVhʾˉﹶʼﹶˉᴵˏˆᐧⁱﹶᴵⁱˋᵎˆˈᴵʻˋـʾʾٴˑˏʽʼˏENSJm, reason: contains not printable characters */
        public static String m194AkiVhENSJm() {
            return BYDecoder.decode(StringPool.f156jzGKLcudLy, "1f44da252efaff49");
        }

        /* renamed from: CaEewᵢʾﹶˉᵢᵢיˉᴵﹶﹶᐧᴵᴵⁱـﹶʿʽˎﹳיʾˈⁱﹶˉʾⁱᵔtYDjk, reason: contains not printable characters */
        public static String m195CaEewtYDjk() {
            return BYDecoder.decode(StringPool.f135fAwjAIFsGH, "1f44da252efaff49");
        }

        /* renamed from: HuNwSᵔˑˊٴﹳٴﹶﹳˎˆʻᵔˎᵢـᴵᴵˈˈⁱˆᵔˊʻʿٴˊˆLMXNx, reason: contains not printable characters */
        public static String m196HuNwSLMXNx() {
            return BYDecoder.decode(StringPool.f129ddMlTndxha, "1f44da252efaff49");
        }

        /* renamed from: LnQMfˉᵎˏˋˈˑﹶʻⁱˑˎˆˋﾞˈᵢˉﹶᴵˆˈⁱˋᴵˈˏᵢᵎʾˈvXhwi, reason: contains not printable characters */
        public static String m197LnQMfvXhwi() {
            return BYDecoder.decode(StringPool.f19CCALjoNcJo, "1f44da252efaff49");
        }

        /* renamed from: gQtCMʿˈˉˎᵔˉʼʼᐧٴˉﾞʻʽˎˈᐧˑʾᵢᴵˈﾞᵢʿˉﹳʽʽˉdEhwb, reason: contains not printable characters */
        public static String m198gQtCMdEhwb() {
            return BYDecoder.decode(StringPool.f176qIfZnDUFeH, "1f44da252efaff49");
        }

        /* renamed from: jiRWXˊʼʽיﾞᐧˑʾˎﾞٴᵎˋˆﹳˉٴʻˋᐧ﻿ʿـˊʾٴʽﾞˑeUAob, reason: contains not printable characters */
        public static String m199jiRWXeUAob() {
            return BYDecoder.decode(StringPool.f18BprBOBCsdK, "1f44da252efaff49");
        }

        /* renamed from: ktQFLᴵٴʿʻˉʼᴵˋﹳᴵـʾיⁱˑʻˑˎʿˑᵎˈﾞˈˏⁱˉˑᴵﹶraVyv, reason: contains not printable characters */
        public static String m200ktQFLraVyv() {
            return BYDecoder.decode(StringPool.f174peBCCaumuP, "1f44da252efaff49");
        }

        /* renamed from: qLHxyⁱﾞᵢᵎٴᐧﾞⁱﹶʿᴵʿʽﹶﹶˎˎˏـʿﹶⁱﾞˑـᴵˆʾʻﹳBctWr, reason: contains not printable characters */
        public static String m201qLHxyBctWr() {
            return BYDecoder.decode(StringPool.f40FJnOhbBvtq, "1f44da252efaff49");
        }

        /* renamed from: xtvIOʻʾﹶˏיˏיﹶʻˋʻⁱʿˈʼיᐧˋˊˈʽᵎˎᵎᵎﹶᴵˈNkWfH, reason: contains not printable characters */
        public static String m202xtvIONkWfH() {
            return BYDecoder.decode(StringPool.f13AVJfXfbjlo, "1f44da252efaff49");
        }

        /* renamed from: zEQaxʼᵔיʼﹶˏʾיʾˏⁱᐧⁱˆᵔˈˆˑˈʻˎᴵᵢⁱﾞˆﾞﾞﹳˋkUjcI, reason: contains not printable characters */
        public static String m203zEQaxkUjcI() {
            return BYDecoder.decode(StringPool.f165nGYFQubaph, "1f44da252efaff49");
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static void m206(Context context) {
            if (m204() || m205(context)) {
                System.exit(0);
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static boolean m205(Context context) {
            String proxyAddress;
            int proxyPort;
            boolean is_ics_or_later = Build.VERSION.SDK_INT >= 14;
            String m196HuNwSLMXNx = m196HuNwSLMXNx();
            String m195CaEewtYDjk = m195CaEewtYDjk();
            if (is_ics_or_later) {
                proxyAddress = System.getProperty(m201qLHxyBctWr());
                String portstr = System.getProperty(m203zEQaxkUjcI());
                proxyPort = Integer.parseInt(portstr != null ? portstr : m199jiRWXeUAob());
                System.out.println(proxyAddress + m195CaEewtYDjk);
                System.out.println(m196HuNwSLMXNx + proxyPort);
            } else {
                proxyAddress = Proxy.getHost(context);
                proxyPort = Proxy.getPort(context);
                Log.e(m202xtvIONkWfH(), proxyAddress + m195CaEewtYDjk);
                Log.e(m196HuNwSLMXNx, proxyPort + m195CaEewtYDjk);
            }
            return (TextUtils.isEmpty(proxyAddress) || proxyPort == -1) ? false : true;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static boolean m204() {
            try {
                Enumeration niList = NetworkInterface.getNetworkInterfaces();
                if (niList != null) {
                    Iterator it = Collections.list(niList).iterator();
                    while (it.hasNext()) {
                        Object obj = it.next();
                        NetworkInterface intf = (NetworkInterface) obj;
                        if (intf.isUp() && intf.getInterfaceAddresses().size() != 0) {
                            Log.d(m198gQtCMdEhwb(), m200ktQFLraVyv() + intf.getName());
                            if (m194AkiVhENSJm().equals(intf.getName()) || m197LnQMfvXhwi().equals(intf.getName())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return false;
            } catch (Throwable e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: ˆ.ʿ.ʿ.ˋ.ˊ$ʿ, reason: contains not printable characters */
    public static class C0028 {

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final String f249 = "RootUtil";

        /* renamed from: ˆ, reason: contains not printable characters */
        public static boolean f250 = false;

        /* renamed from: ChBRwᵢﹶﹳʼˉˏﾞˏˑˉˏˏᵎˑיˈʼʾˉˉⁱˆﾞﹶــˆˈـxsTqp, reason: contains not printable characters */
        public static String m165ChBRwxsTqp() {
            return BYDecoder.decode(StringPool.f60KqGPnSuzKp, "530a5d0ca44eece7");
        }

        /* renamed from: CsdRcˈٴʿﾞـʽˈˊˋˑᵢיʽᴵˉʼˊייᵎˆˑʼﹶᵔᵢⁱˑﹶـgWlbR, reason: contains not printable characters */
        public static String m166CsdRcgWlbR() {
            return BYDecoder.decode(StringPool.f193uqjjRCKNJN, "530a5d0ca44eece7");
        }

        /* renamed from: DOclcـᐧـˈᴵʼﾞˏʽﹶⁱʻـˑᴵᵢʻˎʻᵔـᵎᵢⁱʻˑʾʻʾʿNTOwR, reason: contains not printable characters */
        public static String m167DOclcNTOwR() {
            return BYDecoder.decode(StringPool.f61LLqYwpLtEo, "530a5d0ca44eece7");
        }

        /* renamed from: DWaPxᐧʻʾᵢʾﹶٴˊᐧˋˉʻʻיᵎﾞﹳˑٴᵔﹶˈʽﹳˈˑʼﾞʾᵔQFNgj, reason: contains not printable characters */
        public static String m168DWaPxQFNgj() {
            return BYDecoder.decode(StringPool.f70OCmEofqxxa, "530a5d0ca44eece7");
        }

        /* renamed from: ItKHcᵢᵎʻᵎˎˉٴﹳˉˏˉـˈˈᐧﹳיᵢˎˊˈייᴵˆٴˏٴˎʿecwUb, reason: contains not printable characters */
        public static String m169ItKHcecwUb() {
            return BYDecoder.decode(StringPool.f31DefBqWdVJe, "530a5d0ca44eece7");
        }

        /* renamed from: JrFxLˏـˋʻʻˈˏˊˉٴـᐧـᵔʿﾞˋᵢˆʼˎⁱʾᵎיـʼʻיˊUcXrC, reason: contains not printable characters */
        public static String m170JrFxLUcXrC() {
            return BYDecoder.decode(StringPool.f98VrQMcGMPLy, "530a5d0ca44eece7");
        }

        /* renamed from: TWKVZʻˊˎⁱיˎʾٴٴـˑⁱᵢⁱᵔʿˏʻᐧˉʼʽˉʽʻˏـˊᵔˊiWADn, reason: contains not printable characters */
        public static String m171TWKVZiWADn() {
            return BYDecoder.decode(StringPool.f163mjArULBGhU, "530a5d0ca44eece7");
        }

        /* renamed from: VdOFRᵢˉˎיⁱˈʻﹶˏᐧˉˊﹶⁱˎﹳʼˆᵢⁱـᴵיﹶᐧʿˎˏˎʽINKtY, reason: contains not printable characters */
        public static String m172VdOFRINKtY() {
            return BYDecoder.decode(StringPool.f204wVfccdimeE, "530a5d0ca44eece7");
        }

        /* renamed from: YUSYhᵎᵎʽᵢᵔᴵיˑʽˈʽˉﾞٴᵢⁱˏˆⁱᵢˊᵢˉˊʽﹶˎˆᵢˋuYsoB, reason: contains not printable characters */
        public static String m173YUSYhuYsoB() {
            return BYDecoder.decode(StringPool.f196vBlSEpSsdk, "530a5d0ca44eece7");
        }

        /* renamed from: YkhXPˏـᵎˎʿᴵʽיـʻˎˎٴʼˆʾʽﹳˈʿᵢʼᐧיᵔᐧـﹳᴵOHdBo, reason: contains not printable characters */
        public static String m174YkhXPOHdBo() {
            return BYDecoder.decode(StringPool.f216zScVlIzIBd, "530a5d0ca44eece7");
        }

        /* renamed from: ZNtWnᐧᴵᵔᴵﹳٴˎˉᴵᵢﾞˉˊﾞﾞـᵢʽٴᐧᴵʻˑˏᵢᵎﹶᵔᐧʿZRbaX, reason: contains not printable characters */
        public static String m175ZNtWnZRbaX() {
            return BYDecoder.decode(StringPool.f115aFvkWlyzZj, "530a5d0ca44eece7");
        }

        /* renamed from: fUMcrˆﹶٴʿﹳᐧᵢˑʻˋˈˑⁱⁱᐧʾˈﹶـᵢʻﾞʽـˎˉʿייˈiaXpP, reason: contains not printable characters */
        public static String m176fUMcriaXpP() {
            return BYDecoder.decode(StringPool.f95VGBIkZlrjx, "530a5d0ca44eece7");
        }

        /* renamed from: hAIzYˎיᵔˑᴵˉˑﾞʾˑﾞˈᵔˎˆˋʽﾞʽᵔⁱˆʽـˆˏᵎˋʽⁱpqhnz, reason: contains not printable characters */
        public static String m177hAIzYpqhnz() {
            return BYDecoder.decode(StringPool.f15ApSsGcMIMV, "530a5d0ca44eece7");
        }

        /* renamed from: iNsMLיᵔⁱʻˎʼˈـᴵᵔˎˋᵔـᵢˉʻʽˑʿﹳˎᵎיʽˎˏˉˈefPEH, reason: contains not printable characters */
        public static String m178iNsMLefPEH() {
            return BYDecoder.decode(StringPool.f119atxBjlRJtz, "530a5d0ca44eece7");
        }

        /* renamed from: iwbdQᐧˆˏʿˏˆʿʿˊיʻᐧﹳʾﾞˋʻˉᴵʾˎˋיʻـᵔʿˋˎMuUYJ, reason: contains not printable characters */
        public static String m179iwbdQMuUYJ() {
            return BYDecoder.decode(StringPool.f54IqVlapWemk, "530a5d0ca44eece7");
        }

        /* renamed from: kvcDOᐧˋʾˋˉⁱʻᵎʻᵎᵢיᐧᴵʿـᵔⁱˈʿˏʽˊٴʾʾˉˎᵎⁱkIrKs, reason: contains not printable characters */
        public static String m180kvcDOkIrKs() {
            return BYDecoder.decode(StringPool.f76QEoxQVTRQU, "530a5d0ca44eece7");
        }

        /* renamed from: mFGulˉˈʼⁱʽˊﾞˋˑﹶﹶⁱᴵˈˎˉٴʻˊᐧˎˑˎﹳˋʼⁱʼᵎIEqwz, reason: contains not printable characters */
        public static String m181mFGulIEqwz() {
            return BYDecoder.decode(StringPool.f58KifXGZXOoH, "530a5d0ca44eece7");
        }

        /* renamed from: ttwKdˊٴʽˉˏᵔˋˋˆˏﾞⁱˊᵎﾞˊˈיʿᵢˊˊʽʿʼᵎˏﾞᵔEFEtn, reason: contains not printable characters */
        public static String m182ttwKdEFEtn() {
            return BYDecoder.decode(StringPool.f49HcTMcmVieP, "530a5d0ca44eece7");
        }

        /* renamed from: wSkLKﾞᵢˏˆـˑـʼᴵـˋᴵˎיˏﹶˋᵢᴵﾞʾﾞʿʽʿˑˆᵎʼיuJqZS, reason: contains not printable characters */
        public static String m183wSkLKuJqZS() {
            return BYDecoder.decode(StringPool.f84RCHAqXtxLI, "530a5d0ca44eece7");
        }

        /* renamed from: ykOIuˈʼᐧᵔٴˏᵢⁱـˉיⁱˉˑˈᵢʻˆٴˏᵢʽᵎˑˏᴵˏᴵʽˆzNgJl, reason: contains not printable characters */
        public static String m184ykOIuzNgJl() {
            return BYDecoder.decode(StringPool.f146iLPqnHEMTk, "530a5d0ca44eece7");
        }

        /* renamed from: yogxAˏٴᵢʾˈʻʼˉˊʻˎˋـˊـˑﹶˋﹶٴᵢᴵﹳـﹶˆᵎᵎbJqSp, reason: contains not printable characters */
        public static String m185yogxAbJqSp() {
            return BYDecoder.decode(StringPool.f217zUvXMpcOfT, "530a5d0ca44eece7");
        }

        /* renamed from: yrAnBﹶﾞיᵎﾞﹳﹳʿᴵʼʿˏˉʽייˑʽᵔˏʽˈﾞᵎיٴˉﹳﾞzHhGf, reason: contains not printable characters */
        public static String m186yrAnBzHhGf() {
            return BYDecoder.decode(StringPool.f131dunSGolZou, "530a5d0ca44eece7");
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static void m189(Context context) {
            if (m193() || m190() || m192()) {
                System.exit(0);
            }
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public static boolean m192() {
            boolean z = f250;
            String m172VdOFRINKtY = m172VdOFRINKtY();
            if (z) {
                Log.i(m172VdOFRINKtY, m177hAIzYpqhnz());
            } else {
                int ret = m187(m175ZNtWnZRbaX());
                if (ret != -1) {
                    Log.i(m172VdOFRINKtY, m166CsdRcgWlbR());
                    f250 = true;
                } else {
                    Log.i(m172VdOFRINKtY, m169ItKHcecwUb());
                }
            }
            return f250;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public static boolean m193() {
            String binPath = m171TWKVZiWADn();
            String xBinPath = m186yrAnBzHhGf();
            if (new File(binPath).exists() && m191(binPath)) {
                return true;
            }
            return new File(xBinPath).exists() && m191(xBinPath);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static boolean m191(String filePath) {
            Process p = null;
            try {
                try {
                    p = Runtime.getRuntime().exec(m181mFGulIEqwz() + filePath);
                    BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String str = in.readLine();
                    Log.i(m184ykOIuzNgJl(), str);
                    if (str != null && str.length() >= 4) {
                        char flag = str.charAt(3);
                        if (flag == 's' || flag == 'x') {
                            if (p != null) {
                                p.destroy();
                            }
                            return true;
                        }
                    }
                    if (p == null) {
                        return false;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (p == null) {
                        return false;
                    }
                }
                p.destroy();
                return false;
            } catch (Throwable th) {
                if (p != null) {
                    p.destroy();
                }
                throw th;
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static boolean m190() {
            Process process = null;
            try {
                process = Runtime.getRuntime().exec(new String[]{m173YUSYhuYsoB(), m180kvcDOkIrKs()});
                BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
                if (in.readLine() != null) {
                    if (process != null) {
                        process.destroy();
                    }
                    return true;
                }
                if (process != null) {
                    process.destroy();
                }
                return false;
            } catch (Throwable th) {
                if (process != null) {
                    process.destroy();
                }
                return false;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static File m188() {
            File file = null;
            String[] paths = {m182ttwKdEFEtn(), m167DOclcNTOwR(), m165ChBRwxsTqp(), m178iNsMLefPEH(), m183wSkLKuJqZS(), m168DWaPxQFNgj(), m176fUMcriaXpP(), m170JrFxLUcXrC()};
            for (String path : paths) {
                file = new File(path);
                if (file.exists()) {
                    return file;
                }
            }
            return file;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004f -> B:7:0x005f). Please report as a decompilation issue!!! */
        /* renamed from: ʿ, reason: contains not printable characters */
        public static int m187(String cmd) {
            int result = -1;
            DataOutputStream dos = null;
            try {
                try {
                    try {
                        Process p = Runtime.getRuntime().exec(m185yogxAbJqSp());
                        dos = new DataOutputStream(p.getOutputStream());
                        dos.writeBytes(cmd + m179iwbdQMuUYJ());
                        dos.flush();
                        dos.writeBytes(m174YkhXPOHdBo());
                        dos.flush();
                        p.waitFor();
                        result = p.exitValue();
                        dos.close();
                    } catch (Throwable th) {
                        if (dos != null) {
                            try {
                                dos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    if (dos != null) {
                        dos.close();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return result;
        }
    }

    /* renamed from: ˆ.ʿ.ʿ.ˋ.ˊ$ˉ, reason: contains not printable characters */
    public static class C0032 {
        /* renamed from: FnosUᴵʿʻˈٴᵢﾞʿˊﹳﹶˑᴵʾٴـⁱʿᵢˑـʽⁱˈʽˈᵢᴵᵔˊGZyYy, reason: contains not printable characters */
        public static String m225FnosUGZyYy() {
            return BYDecoder.decode(StringPool.f42FSgfUqsByS, "53d3c36c8c63eaff");
        }

        /* renamed from: GhdtfᴵⁱʽᐧˉˆʽʾʻᴵⁱﹶᵎיˏᴵʻﹳᐧʻˋʼʽˎˆᵎᵢˈיᴵFYmor, reason: contains not printable characters */
        public static String m226GhdtfFYmor() {
            return BYDecoder.decode(StringPool.f27CxEKTZwiqS, "53d3c36c8c63eaff");
        }

        /* renamed from: InWgXﾞᵢᵔʾᵎʿʾʽʽʿˆᵔˋᐧʻˋᴵˎᵢˊˏʼˎʻˋﹶיRnTtB, reason: contains not printable characters */
        public static String m227InWgXRnTtB() {
            return BYDecoder.decode(StringPool.f142gXQAMAsKMr, "53d3c36c8c63eaff");
        }

        /* renamed from: KCsNrˈיــﹶˎˉﹳⁱיʽˎʻˑˈˋــʿᵔʻⁱʻʻʿʿʼٴـᵔpuhBA, reason: contains not printable characters */
        public static String m228KCsNrpuhBA() {
            return BYDecoder.decode(StringPool.f71OOzWkavMzB, "53d3c36c8c63eaff");
        }

        /* renamed from: LEJeRʻˑᴵˑˑٴʿﹳʾᵢˈᴵʻˎٴʼʼᵎـᵎﾞיﹳⁱʻˏˈʼٴTXhlY, reason: contains not printable characters */
        public static String m229LEJeRTXhlY() {
            return BYDecoder.decode(StringPool.f157kDdREHOMvg, "53d3c36c8c63eaff");
        }

        /* renamed from: ZVYGnיﹶיˆˊˑᐧᵢʾˈˋٴˋﾞⁱⁱʼʽᵔˈˋᵎˆʿᴵʿʻˏᵢᵢvNGGY, reason: contains not printable characters */
        public static String m230ZVYGnvNGGY() {
            return BYDecoder.decode(StringPool.f159ktxcICVRho, "53d3c36c8c63eaff");
        }

        /* renamed from: cnGcnﹳʽˑᐧʼᵢˆٴﾞיˋˉـˈﹶˏᵔʻʻᵔᴵʻᵔᐧـʼˎʼʻˏTufpx, reason: contains not printable characters */
        public static String m231cnGcnTufpx() {
            return BYDecoder.decode(StringPool.f144hoPyCjvzfX, "53d3c36c8c63eaff");
        }

        /* renamed from: dMUmCˈˋˑʼˊᴵʾﾞﹳˋˋיʻˆˊˉʻʿʾˎיᵎⁱʾﾞˈˎʿˊuEBUL, reason: contains not printable characters */
        public static String m232dMUmCuEBUL() {
            return BYDecoder.decode(StringPool.f122benRiJBuzl, "53d3c36c8c63eaff");
        }

        /* renamed from: dgcDjᵢˏﹳᐧˑﾞﾞˆיᵔـʽˎיﹳٴᐧﹳʽﹳᵎיᵔﾞـᵎﾞﹶיʽfKBGl, reason: contains not printable characters */
        public static String m233dgcDjfKBGl() {
            return BYDecoder.decode(StringPool.f199vXgIIAKyHT, "53d3c36c8c63eaff");
        }

        /* renamed from: nCdXLˉˏﾞٴʾʼٴﹶˎﾞـⁱٴʽᐧʻʽˑˋᵢˆˎﹶـˎᵔⁱʽᵔˆxarRv, reason: contains not printable characters */
        public static String m234nCdXLxarRv() {
            return BYDecoder.decode(StringPool.f209xoiBTeLMya, "53d3c36c8c63eaff");
        }

        /* renamed from: nwUogᐧʽᵔʼʻⁱٴᐧˈיˈᵔˎﾞˎᵔˊˉʽᵎˎﹳˋˑˏˋﾞﹳˊtpXHL, reason: contains not printable characters */
        public static String m235nwUogtpXHL() {
            return BYDecoder.decode(StringPool.f80QcyfmyzGxd, "53d3c36c8c63eaff");
        }

        /* renamed from: tlNhqʿᵢﹳﹶᵢˊﹶˏـٴʼʽـˆᴵˏיﹶﹶʿٴᴵʾﹶᵢיˏʿﹶoPaPW, reason: contains not printable characters */
        public static String m236tlNhqoPaPW() {
            return BYDecoder.decode(StringPool.f167nrKARimZoT, "53d3c36c8c63eaff");
        }

        /* renamed from: uyYeLﹳﹳˋﹶٴˆיᐧـʾˋˈᵔـˋⁱﾞٴʿʿˑˊﹳʿⁱﾞﹶﹳˎᴵZerIc, reason: contains not printable characters */
        public static String m237uyYeLZerIc() {
            return BYDecoder.decode(StringPool.f90TprNlNQAgF, "53d3c36c8c63eaff");
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static void m240(Context context) {
            if (m239(context) || m241() || m242() || m238() || m243()) {
                System.exit(0);
            }
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public static boolean m243() {
            String jarName = m228KCsNrpuhBA();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(m225FnosUGZyYy() + Process.myPid() + m231cnGcnTufpx()));
                while (true) {
                    String str = bufferedReader.readLine();
                    if (str != null) {
                        if (str.endsWith(m226GhdtfFYmor()) && str.contains(jarName)) {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static boolean m238() {
            try {
                throw new Exception(m229LEJeRTXhlY());
            } catch (Exception e) {
                for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                    if (stackTraceElement.getClassName().equals(m236tlNhqoPaPW())) {
                        return true;
                    }
                }
                return false;
            }
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public static boolean m242() {
            File f = new File(m230ZVYGnvNGGY());
            if (f.exists()) {
                return true;
            }
            return false;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static boolean m241() {
            try {
                ClassLoader cl = ClassLoader.getSystemClassLoader();
                Class clazz = cl.loadClass(m235nwUogtpXHL());
                if (clazz == null) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static boolean m239(Context ctx) {
            PackageManager packageManager = ctx.getPackageManager();
            List<ApplicationInfo> applicationInfoList = packageManager.getInstalledApplications(128);
            for (ApplicationInfo applicationInfo : applicationInfoList) {
                if (applicationInfo.packageName.equals(m237uyYeLZerIc())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public static void m244() {
            try {
                Class loadClass = ClassLoader.getSystemClassLoader().loadClass(m227InWgXRnTtB());
                Field declaredField = loadClass.getDeclaredField(m233dgcDjfKBGl());
                Field declaredField2 = loadClass.getDeclaredField(m232dMUmCuEBUL());
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                declaredField.setBoolean(null, true);
                declaredField2.setInt(null, 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Object object = ClassLoader.getSystemClassLoader().loadClass(m234nCdXLxarRv()).newInstance();
                if (object != null) {
                    System.exit(0);
                }
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: ˆ.ʿ.ʿ.ˋ.ˊ$ˈ, reason: contains not printable characters */
    public static class C0030 {

        /* renamed from: ʿ, reason: contains not printable characters */
        public static String[] f251 = {m213XlAfscIRvv(), m216gjeeIxFMen(), m208DPxetlnqor()};

        /* renamed from: BTLruᴵיⁱʿˈᵎʿˋˋˎˊﹳˊˎᐧˑᐧˑﹳᵎˏˑˆᵔˑᵎﹶﾞᵔˋJFuOz, reason: contains not printable characters */
        public static String m207BTLruJFuOz() {
            return BYDecoder.decode(StringPool.f206xLPICARCKy, "0ec47edd8db3a02b");
        }

        /* renamed from: DPxetˊˈᐧﹶᐧˎﾞﹶʼʻʾˊʼﹶᵎﾞـʾˈיﹳᵔﹶʽˎʿⁱﹶˋⁱlnqor, reason: contains not printable characters */
        public static String m208DPxetlnqor() {
            return BYDecoder.decode(StringPool.f74PGkTvfmlHq, "0ec47edd8db3a02b");
        }

        /* renamed from: IIAKaⁱˎʼٴʽᵎʼᵎˉʿʻˊˑˋʿˎᵔˎᵎˈـⁱᵢʾⁱʽⁱﹶᴵﹳVMIYj, reason: contains not printable characters */
        public static String m209IIAKaVMIYj() {
            return BYDecoder.decode(StringPool.f79QcNuJZFDbN, "0ec47edd8db3a02b");
        }

        /* renamed from: NiQXjˑˊᐧˈﹶᵔᵎˆˊˎᐧיᵎˎٴـᵎיˉⁱᵔˏˆٴˋʻʾˉﾞvYSnY, reason: contains not printable characters */
        public static String m210NiQXjvYSnY() {
            return BYDecoder.decode(StringPool.f218zZUvPZFxwA, "0ec47edd8db3a02b");
        }

        /* renamed from: PCxuAˉʻﾞˆˊᵎˋﹳʼﹶˑˏᵢˉﹶﹶﹳᵎⁱˉⁱˆᐧˊٴˈᵎˊQIyfQ, reason: contains not printable characters */
        public static String m211PCxuAQIyfQ() {
            return BYDecoder.decode(StringPool.f36EvbiNBzvbv, "0ec47edd8db3a02b");
        }

        /* renamed from: TfrVtיﹶˈˆˋᵢᵔٴᐧʿᵢיˎﾞˑˉʻﹶᵎⁱـˏᴵˑˆˉﹳـhjjQV, reason: contains not printable characters */
        public static String m212TfrVthjjQV() {
            return BYDecoder.decode(StringPool.f100WLLNqjzHTI, "0ec47edd8db3a02b");
        }

        /* renamed from: XlAfsˏᵔˑⁱʾˊˆˆᵔﹶᵢˏˆﹳˉʽיᐧיˏᵔـᵔיˋʼˋʽcIRvv, reason: contains not printable characters */
        public static String m213XlAfscIRvv() {
            return BYDecoder.decode(StringPool.f16BTCZhPhFZc, "0ec47edd8db3a02b");
        }

        /* renamed from: aDGcLⁱⁱﹶᵢʿʽᵢˈﹶᴵˑⁱﾞˎʽﹶˑٴʻˈיᐧᐧᵎﾞˑˈᵢⁱٴozGbB, reason: contains not printable characters */
        public static String m214aDGcLozGbB() {
            return BYDecoder.decode(StringPool.f187spBydSqkly, "0ec47edd8db3a02b");
        }

        /* renamed from: aunHMˊﹳᐧᵢﾞˊʽʽⁱʻﾞᐧˊᵔᐧˋʽᵔⁱﾞˑˊˉʾٴˉʼـʾʾuWodQ, reason: contains not printable characters */
        public static String m215aunHMuWodQ() {
            return BYDecoder.decode(StringPool.f134eUAnIcGoIf, "0ec47edd8db3a02b");
        }

        /* renamed from: gjeeIˏˋᐧˑᵢᐧיʾיʽʻﾞᵔˎﹳᵔʾʼᵢᵢⁱـˑˋʽʿᴵˉⁱxFMen, reason: contains not printable characters */
        public static String m216gjeeIxFMen() {
            return BYDecoder.decode(StringPool.f126dEytpPRloH, "0ec47edd8db3a02b");
        }

        /* renamed from: iLjubᵔﾞˋʻᵢᵔˉˈٴˊᐧᵔʼⁱﹶˊﹶˋˊˎˑᵎﹳʾᵎʻᵎˉᵎʽdiNvt, reason: contains not printable characters */
        public static String m217iLjubdiNvt() {
            return BYDecoder.decode(StringPool.f123brICVzJjDu, "0ec47edd8db3a02b");
        }

        /* renamed from: qFPxoᐧᵢʽʻⁱˏٴˋﹳᵔᴵﹳᵢᴵˋــיˊˉﹳˋʾᴵˎᴵⁱᵎᐧˑcBwXC, reason: contains not printable characters */
        public static String m218qFPxocBwXC() {
            return BYDecoder.decode(StringPool.f25ChaCFtYLqD, "0ec47edd8db3a02b");
        }

        /* renamed from: qgHlSᵢʼⁱᵎˉᐧיˋᵔˆʾﹳʾʽᵔˈˏﾞʿᐧˈʽﹶـˑᵎʿᵎٴˆeyXYK, reason: contains not printable characters */
        public static String m219qgHlSeyXYK() {
            return BYDecoder.decode(StringPool.f77QNBgqWaKhr, "0ec47edd8db3a02b");
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static void m222(Context context) {
            try {
                if (m223() || m220() || m221(context)) {
                    System.exit(0);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static boolean m223() {
            String str = Build.FINGERPRINT;
            String m210NiQXjvYSnY = m210NiQXjvYSnY();
            if (!str.startsWith(m210NiQXjvYSnY) && !Build.FINGERPRINT.toLowerCase().contains(m209IIAKaVMIYj()) && !Build.FINGERPRINT.toLowerCase().contains(m217iLjubdiNvt())) {
                String str2 = Build.MODEL;
                String m219qgHlSeyXYK = m219qgHlSeyXYK();
                if (!str2.contains(m219qgHlSeyXYK) && !Build.MODEL.contains(m215aunHMuWodQ()) && !Build.MODEL.contains(m218qFPxocBwXC()) && !Build.MANUFACTURER.contains(m211PCxuAQIyfQ()) && ((!Build.BRAND.startsWith(m210NiQXjvYSnY) || !Build.DEVICE.startsWith(m210NiQXjvYSnY)) && !m219qgHlSeyXYK.equals(Build.PRODUCT))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static boolean m220() {
            boolean adbInEmulator = false;
            BufferedReader reader = null;
            try {
                try {
                    reader = new BufferedReader(new InputStreamReader(new FileInputStream(m207BTLruJFuOz())), 1000);
                    reader.readLine();
                    ArrayList<CheckUtils.Virtual.tcp> tcpList = new ArrayList<>();
                    while (true) {
                        String line = reader.readLine();
                        if (line == null) {
                            break;
                        }
                        tcpList.add(C0031.m224(line.split(m214aDGcLozGbB())));
                    }
                    reader.close();
                    int adbPort = -1;
                    Iterator<CheckUtils.Virtual.tcp> it = tcpList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0031 tcpItem = (C0031) it.next();
                        if (tcpItem.f253 == 0) {
                            adbPort = tcpItem.f254;
                            break;
                        }
                    }
                    if (adbPort != -1) {
                        Iterator<CheckUtils.Virtual.tcp> it2 = tcpList.iterator();
                        while (it2.hasNext()) {
                            C0031 tcpItem2 = (C0031) it2.next();
                            if (tcpItem2.f253 != 0 && tcpItem2.f254 == adbPort) {
                                adbInEmulator = true;
                            }
                        }
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                return adbInEmulator;
            } finally {
                reader.close();
            }
        }

        /* renamed from: ˆ.ʿ.ʿ.ˋ.ˊ$ˈ$ʿ, reason: contains not printable characters */
        public static class C0031 {

            /* renamed from: ʿ, reason: contains not printable characters */
            public int f252;

            /* renamed from: ˆ, reason: contains not printable characters */
            public long f253;

            /* renamed from: ˈ, reason: contains not printable characters */
            public int f254;

            /* renamed from: ˉ, reason: contains not printable characters */
            public int f255;

            /* renamed from: ˊ, reason: contains not printable characters */
            public int f256;

            /* renamed from: ʿ, reason: contains not printable characters */
            public static C0031 m224(String[] params) {
                return new C0031(params[1], params[2], params[3], params[4], params[5], params[6], params[7], params[8], params[9], params[10], params[11], params[12], params[13], params[14]);
            }

            public C0031(String id, String localIp, String localPort, String remoteIp, String remotePort, String state, String tx_queue, String rx_queue, String tr, String tm_when, String retrnsmt, String uid, String timeout, String inode) {
                this.f252 = Integer.parseInt(id, 16);
                this.f253 = Long.parseLong(localIp, 16);
                this.f254 = Integer.parseInt(localPort, 16);
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static boolean m221(Context context) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m212TfrVthjjQV());
            String deviceId = telephonyManager.getDeviceId();
            for (String known_deviceId : f251) {
                if (known_deviceId.equalsIgnoreCase(deviceId)) {
                    return true;
                }
            }
            return false;
        }
    }
}
