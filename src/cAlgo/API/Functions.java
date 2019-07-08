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

public class Functions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsRising(DataSeries series) {
    try {
      java.lang.Boolean res = Javonet.getType("cAlgo.API.Functions").invoke("IsRising", series);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsFalling(DataSeries series) {
    try {
      java.lang.Boolean res = Javonet.getType("cAlgo.API.Functions").invoke("IsFalling", series);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double Maximum(DataSeries series, java.lang.Integer period) {
    try {
      java.lang.Double res =
          Javonet.getType("cAlgo.API.Functions").invoke("Maximum", series, period);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double Minimum(DataSeries series, java.lang.Integer period) {
    try {
      java.lang.Double res =
          Javonet.getType("cAlgo.API.Functions").invoke("Minimum", series, period);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean HasCrossedAbove(
      DataSeries crossingSeries, DataSeries crossedSeries, java.lang.Integer period) {
    try {
      java.lang.Boolean res =
          Javonet.getType("cAlgo.API.Functions")
              .invoke("HasCrossedAbove", crossingSeries, crossedSeries, period);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean HasCrossedBelow(
      DataSeries crossingSeries, DataSeries crossedSeries, java.lang.Integer period) {
    try {
      java.lang.Boolean res =
          Javonet.getType("cAlgo.API.Functions")
              .invoke("HasCrossedBelow", crossingSeries, crossedSeries, period);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean HasCrossedAbove(
      DataSeries crossingSeries, java.lang.Double value, java.lang.Integer period) {
    try {
      java.lang.Boolean res =
          Javonet.getType("cAlgo.API.Functions")
              .invoke("HasCrossedAbove", crossingSeries, value, period);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean HasCrossedBelow(
      DataSeries crossingSeries, java.lang.Double value, java.lang.Integer period) {
    try {
      java.lang.Boolean res =
          Javonet.getType("cAlgo.API.Functions")
              .invoke("HasCrossedBelow", crossingSeries, value, period);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double Sum(DataSeries series, java.lang.Integer period) {
    try {
      java.lang.Double res = Javonet.getType("cAlgo.API.Functions").invoke("Sum", series, period);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
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
