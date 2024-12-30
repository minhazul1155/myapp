package p001.p002.p003.p009;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;

/* renamed from: ˆ.ʿ.ʿ.ˊ.ˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0020 {
    /* renamed from: KtkpCʿˏʻˈˋʼʿˑʻʾᴵⁱʼיᵔᐧʿᴵᵎˈﹳיˉˆʼᵔʿﹶᴵˆshLQq, reason: contains not printable characters */
    public static String m110KtkpCshLQq() {
        return BYDecoder.decode(StringPool.f94UxCGhxeccc, "51f259db5f20f78f");
    }

    /* renamed from: vPvybˈᵢﹳᵔˑﹶˎˈʿـˎᵢˏᵔˑˑˑﹳʾˎٴٴˈˋﹳיʻﹶᐧiqqBk, reason: contains not printable characters */
    public static String m111vPvybiqqBk() {
        return BYDecoder.decode(StringPool.f141gQgDnKzyFp, "51f259db5f20f78f");
    }

    public C0020(Context context, String text) {
        AlertDialog dialog = new AlertDialog.Builder(context).setMessage(text).setCancelable(false).setPositiveButton(m110KtkpCshLQq(), new DialogInterfaceOnClickListenerC0022()).setNeutralButton(m111vPvybiqqBk(), new DialogInterfaceOnClickListenerC0021(context, text)).create();
        dialog.show();
    }

    /* renamed from: ˆ.ʿ.ʿ.ˊ.ˆ$ˆ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0022 implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0022() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }

    /* renamed from: ˆ.ʿ.ʿ.ˊ.ˆ$ʿ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0021 implements DialogInterface.OnClickListener {

        /* renamed from: ʿ, reason: contains not printable characters */
        public final /* synthetic */ Context f234;

        /* renamed from: ˆ, reason: contains not printable characters */
        public final /* synthetic */ String f235;

        /* renamed from: LoMiRﾞʼﾞﾞˎٴﹳﹳᐧˏᴵᵎٴˎᵔˏᵎʻˈˉٴᵔˋٴˑʻʿﹳvGUTA, reason: contains not printable characters */
        public static String m112LoMiRvGUTA() {
            return BYDecoder.decode(StringPool.f86RcarhCxWEQ, "a16364aaaa2a5364");
        }

        public DialogInterfaceOnClickListenerC0021(Context context, String str) {
            this.f234 = context;
            this.f235 = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ClipboardManager clipboard = (ClipboardManager) this.f234.getSystemService(m112LoMiRvGUTA());
            if (clipboard != null) {
                clipboard.setPrimaryClip(ClipData.newPlainText(null, this.f235));
            }
            dialog.dismiss();
        }
    }
}
