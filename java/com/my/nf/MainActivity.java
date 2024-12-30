package com.my.nf;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class MainActivity extends Activity {
    private Timer _timer = new Timer();
    private Intent i = new Intent();
    private SharedPreferences s;
    private TimerTask t;
    private WebView webview1;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.webview1 = (WebView) findViewById(R.id.webview1);
        this.webview1.getSettings().setJavaScriptEnabled(true);
        this.webview1.getSettings().setSupportZoom(true);
        this.s = getSharedPreferences("s", 0);
        this.webview1.setWebViewClient(new WebViewClient() { // from class: com.my.nf.MainActivity.1
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
            }
        });
    }

    private void initializeLogic() {
        this.webview1.loadUrl("http://thanosx.icu/app/");
        this.webview1.getSettings().setJavaScriptEnabled(true);
        this.webview1.setWebViewClient(new WebViewClient() { // from class: com.my.nf.MainActivity.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith("https://wa.me/") || str.startsWith("https://api.whatsapp.com/")) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent);
                        return true;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    }
                } else if (str.startsWith("https://www.youtube.com/")) {
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent2);
                        return true;
                    } catch (ActivityNotFoundException e2) {
                        e2.printStackTrace();
                    }
                } else if (str.startsWith("https://t.me/")) {
                    try {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent3);
                        return true;
                    } catch (ActivityNotFoundException e3) {
                        e3.printStackTrace();
                    }
                } else if (str.startsWith("http://thanosx.icu/app/")) {
                    try {
                        Intent intent4 = new Intent("android.intent.action.VIEW");
                        intent4.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent4);
                        return true;
                    } catch (ActivityNotFoundException e4) {
                        e4.printStackTrace();
                    }
                } else if (str.startsWith("https://www.facebook.com/")) {
                    try {
                        Intent intent5 = new Intent("android.intent.action.VIEW");
                        intent5.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent5);
                        return true;
                    } catch (ActivityNotFoundException e5) {
                        e5.printStackTrace();
                    }
                } else if (str.startsWith("https://www.instagram.com/")) {
                    try {
                        Intent intent6 = new Intent("android.intent.action.VIEW");
                        intent6.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent6);
                        return true;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
                    }
                } else if (str.startsWith("https://omar-xml.blogspot.com/")) {
                    try {
                        Intent intent7 = new Intent("android.intent.action.VIEW");
                        intent7.setData(Uri.parse(str));
                        MainActivity.this.startActivity(intent7);
                        return true;
                    } catch (ActivityNotFoundException e7) {
                        e7.printStackTrace();
                    }
                }
                return false;
            }
        });
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf(checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
