package com.my.nf;

import android.app.Activity;

/* loaded from: classes2.dex */
public class DebugActivity extends Activity {
    private String[] exceptionTypes = {"StringIndexOutOfBoundsException", "IndexOutOfBoundsException", "ArithmeticException", "NumberFormatException", "ActivityNotFoundException"};
    private String[] exceptionMessages = {"Invalid string operation\n", "Invalid list operation\n", "Invalid arithmetical operation\n", "Invalid toNumber block operation\n", "Invalid intent operation"};

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r1.isEmpty() != false) goto L9;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r2 = 0
            super.onCreate(r8)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = ""
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld3
            java.lang.String r3 = "error"
            java.lang.String r0 = r0.getStringExtra(r3)
            java.lang.String r3 = "\n"
            java.lang.String[] r3 = r0.split(r3)
        L1a:
            java.lang.String[] r4 = r7.exceptionTypes     // Catch: java.lang.Exception -> Lb5
            int r4 = r4.length     // Catch: java.lang.Exception -> Lb5
            if (r2 < r4) goto L54
        L1f:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> Lb5
            if (r2 == 0) goto Ld3
        L25:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            java.lang.String r2 = "An error occurred"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            java.lang.String r1 = "End Application"
            com.my.nf.DebugActivity$1 r2 = new com.my.nf.DebugActivity$1
            r2.<init>()
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            r1 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 1
            r0.setTextIsSelectable(r1)
            return
        L54:
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> Lb5
            java.lang.String[] r5 = r7.exceptionTypes     // Catch: java.lang.Exception -> Lb5
            r5 = r5[r2]     // Catch: java.lang.Exception -> Lb5
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Exception -> Lb5
            if (r4 == 0) goto Lb1
            java.lang.String[] r4 = r7.exceptionMessages     // Catch: java.lang.Exception -> Lb5
            r1 = r4[r2]     // Catch: java.lang.Exception -> Lb5
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> Lb5
            java.lang.String[] r5 = r7.exceptionTypes     // Catch: java.lang.Exception -> Lb5
            r5 = r5[r2]     // Catch: java.lang.Exception -> Lb5
            int r4 = r4.indexOf(r5)     // Catch: java.lang.Exception -> Lb5
            java.lang.String[] r5 = r7.exceptionTypes     // Catch: java.lang.Exception -> Lb5
            r2 = r5[r2]     // Catch: java.lang.Exception -> Lb5
            int r2 = r2.length()     // Catch: java.lang.Exception -> Lb5
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb5
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb5
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lb5
            r5 = 0
            r5 = r3[r5]     // Catch: java.lang.Exception -> Lb5
            r6 = 0
            r3 = r3[r6]     // Catch: java.lang.Exception -> Lb5
            int r3 = r3.length()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r2 = r5.substring(r2, r3)     // Catch: java.lang.Exception -> Lb5
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> Lb5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb5
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lb5
            r2.<init>(r3)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r3 = "\n\nDetailed error message:\n"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> Lb5
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> Lb5
            goto L1f
        Lb1:
            int r2 = r2 + 1
            goto L1a
        Lb5:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r1)
            java.lang.String r1 = "\n\nError while getting error: "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            goto L25
        Ld3:
            r0 = r1
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.nf.DebugActivity.onCreate(android.os.Bundle):void");
    }
}
