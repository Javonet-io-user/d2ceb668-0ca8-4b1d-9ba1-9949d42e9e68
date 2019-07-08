package cAlgo.API;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import cAlgo.API.*;

public class TimeFrame {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute2() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute2");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute2(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute3() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute3");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute3(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute4() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute4");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute4(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute5() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute5");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute5(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute5", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute6() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute6");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute6(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute7() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute7");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute7(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute7", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute8() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute8");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute8(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute9() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute9");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute9(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute9", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute10() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute10");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute10(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute10", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute15() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute15");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute15(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute15", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute20() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute20");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute20(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute20", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute30() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute30");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute30(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute30", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMinute45() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Minute45");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMinute45(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Minute45", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour2() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour2");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour2(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour3() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour3");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour3(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour4() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour4");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour4(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour6() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour6");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour6(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour6", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour8() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour8");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour8(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour8", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getHour12() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Hour12");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHour12(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Hour12", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getDaily() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Daily");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDaily(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Daily", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getDay2() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Day2");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDay2(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Day2", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getDay3() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Day3");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDay3(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Day3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getWeekly() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Weekly");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWeekly(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Weekly", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TimeFrame getMonthly() {
    try {
      Object res = Javonet.getType("cAlgo.API.TimeFrame").<NObject>get("Monthly");
      if (res == null) return null;
      return new TimeFrame((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMonthly(TimeFrame param) {
    try {
      Javonet.getType("cAlgo.API.TimeFrame").set("Monthly", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TimeFrame(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
