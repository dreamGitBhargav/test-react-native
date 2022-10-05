package com.facebook.systrace;

import android.util.Log;

public class DreamLogs {

  public static void log(String tag, String extraInfo, String threadName, boolean isStartLog, long time) {
    Log.d("D11CustomLog", "===> name:" + tag + getTag(isStartLog) +
      "===> extraInfo:" + extraInfo + "===> thread:" + threadName + "===> time:" + time);
  }

  public static void d(String tag, String extraInfo) {
    Log.d("D11CustomLogFlog", "===> name:" + tag + "===> extraInfo:" + extraInfo);
  }
  public static void d(String tag, String extraInfo, Throwable throwable) {
    Log.d("D11CustomLogFlog", "===> name:" + tag + "===> extraInfo:" + extraInfo + " stackStrace:" + Log.getStackTraceString(throwable));
  }

  public static void w(String tag, String extraInfo) {
    Log.w("D11CustomLogFlog", "===> name:" + tag + "===> extraInfo:" + extraInfo);
  }

  public static void e(String tag, String extraInfo) {
    Log.e("D11CustomLogFlog", "===> name:" + tag + "===> extraInfo:" + extraInfo);
  }

  public static void e(String tag, String extraInfo, Throwable throwable) {
    Log.e("D11CustomLogFlog", "===> name:" + tag + "===> extraInfo:" + extraInfo + " stackStrace:" + Log.getStackTraceString(throwable));
  }

  public static void wtf(String tag, String extraInfo, Throwable throwable) {
    Log.d("D11CustomLogFlog", "===> name:" + tag + "===> extraInfo:" + extraInfo +" stackStrace:" + Log.getStackTraceString(throwable));
  }

  private static String getTag(boolean isStartLog) {
    if (isStartLog)
      return "_START";
    return "_END";
  }
}
