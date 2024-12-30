package p011.p012;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.beingyi.encrypt.BYDecoder;
import com.beingyi.encrypt.StringPool;

/* renamed from: ˈ.ʿ.ʿ */
/* loaded from: classes.dex */
public class C0043 {
    public C0043(Context context, String text) {
        ((Activity) context).runOnUiThread(new RunnableC0044(context, text));
    }

    /* renamed from: ˈ.ʿ.ʿ$ʿ */
    public class RunnableC0044 implements Runnable {

        /* renamed from: ʿ */
        public final /* synthetic */ Context f270;

        /* renamed from: ˆ */
        public final /* synthetic */ String f271;

        /* renamed from: AhLLPʼˎˆٴˆˋˑˊˎˉʻᐧˉــˉיʼʿᵎיــᵔᵢʾᐧˈAOqkg */
        public static String m355AhLLPAOqkg() {
            return BYDecoder.decode(StringPool.f152jPTOgegUsi, "c5b4e294dbf26dab");
        }

        public RunnableC0044(Context context, String str) {
            this.f270 = context;
            this.f271 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog dialog = new AlertDialog.Builder(this.f270).setMessage(this.f271).setCancelable(false).setPositiveButton(m355AhLLPAOqkg(), new DialogInterfaceOnClickListenerC0045()).create();
            dialog.show();
        }

        /* renamed from: ˈ.ʿ.ʿ$ʿ$ʿ */
        public class DialogInterfaceOnClickListenerC0045 implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0045() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }
    }
}
