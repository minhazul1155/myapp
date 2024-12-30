package com.my.nf;

import android.content.Context;
import android.content.Intent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class SketchLogger {
    private static Thread loggerThread = new Thread() { // from class: com.my.nf.SketchLogger.1
        AnonymousClass1() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SketchLogger.isRunning = true;
            try {
                Runtime.getRuntime().exec("logcat -c");
                Throwable th = null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()));
                    try {
                        String readLine = bufferedReader.readLine();
                        do {
                            SketchLogger.broadcastLog(readLine);
                            if (!SketchLogger.isRunning) {
                                break;
                            } else {
                                readLine = bufferedReader.readLine();
                            }
                        } while (readLine != null);
                        if (SketchLogger.isRunning) {
                            SketchLogger.broadcastLog("Logger got killed. Restarting.");
                            SketchLogger.startLogging();
                        } else {
                            SketchLogger.broadcastLog("Logger stopped.");
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (0 == 0) {
                        throw th2;
                    }
                    if (null != th2) {
                        th.addSuppressed(th2);
                    }
                }
            } catch (Exception e) {
                SketchLogger.broadcastLog(e.toString());
            }
        }
    };
    private static volatile boolean isRunning = false;

    /* renamed from: com.my.nf.SketchLogger$1 */
    class AnonymousClass1 extends Thread {
        AnonymousClass1() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SketchLogger.isRunning = true;
            try {
                Runtime.getRuntime().exec("logcat -c");
                Throwable th = null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()));
                    try {
                        String readLine = bufferedReader.readLine();
                        do {
                            SketchLogger.broadcastLog(readLine);
                            if (!SketchLogger.isRunning) {
                                break;
                            } else {
                                readLine = bufferedReader.readLine();
                            }
                        } while (readLine != null);
                        if (SketchLogger.isRunning) {
                            SketchLogger.broadcastLog("Logger got killed. Restarting.");
                            SketchLogger.startLogging();
                        } else {
                            SketchLogger.broadcastLog("Logger stopped.");
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (0 == 0) {
                        throw th2;
                    }
                    if (null != th2) {
                        th.addSuppressed(th2);
                    }
                }
            } catch (Exception e) {
                SketchLogger.broadcastLog(e.toString());
            }
        }
    }

    public static void startLogging() {
        if (!isRunning) {
            loggerThread.start();
            return;
        }
        throw new IllegalStateException("Logger already running");
    }

    public static void broadcastLog(String str) {
        Context context = SketchApplication.getContext();
        Intent intent = new Intent();
        intent.setAction("com.sketchware.remod.ACTION_NEW_DEBUG_LOG");
        intent.putExtra("log", str);
        intent.putExtra("packageName", context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static void stopLogging() {
        if (isRunning) {
            isRunning = false;
            broadcastLog("Stopping logger by user request.");
            return;
        }
        throw new IllegalStateException("Logger not running");
    }
}
