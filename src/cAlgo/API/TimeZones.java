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

public class TimeZones {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDatelineStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("DatelineStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDatelineStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("DatelineStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSamoaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("SamoaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSamoaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("SamoaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getHawaiianStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("HawaiianStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setHawaiianStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("HawaiianStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAlaskanStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("AlaskanStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAlaskanStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("AlaskanStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPacificStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("PacificStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPacificStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("PacificStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMountainStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("MountainStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMountainStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("MountainStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCentralStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("CentralStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCentralStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CentralStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCanadaCentralStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("CanadaCentralStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCanadaCentralStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CanadaCentralStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCentralAmericaStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("CentralAmericaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCentralAmericaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CentralAmericaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEasternStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("EasternStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEasternStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("EasternStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAtlanticStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("AtlanticStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAtlanticStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("AtlanticStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getESouthAmericaStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("ESouthAmericaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setESouthAmericaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("ESouthAmericaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGreenlandStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("GreenlandStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGreenlandStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("GreenlandStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMidAtlanticStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("MidAtlanticStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMidAtlanticStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("MidAtlanticStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAzoresStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("AzoresStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAzoresStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("AzoresStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCapeVerdeStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("CapeVerdeStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCapeVerdeStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CapeVerdeStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGMTStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("GMTStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGMTStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("GMTStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGreenwichStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("GreenwichStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGreenwichStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("GreenwichStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCentralEuropeStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("CentralEuropeStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCentralEuropeStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CentralEuropeStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCentralEuropeanStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("CentralEuropeanStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCentralEuropeanStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CentralEuropeanStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRomanceStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("RomanceStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRomanceStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("RomanceStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWEuropeStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("WEuropeStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWEuropeStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("WEuropeStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWCentralAfricaStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("WCentralAfricaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWCentralAfricaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("WCentralAfricaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEEuropeStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("EEuropeStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEEuropeStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("EEuropeStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEgyptStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("EgyptStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEgyptStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("EgyptStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFLEStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("FLEStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFLEStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("FLEStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGTBStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("GTBStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGTBStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("GTBStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIsraelStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("IsraelStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIsraelStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("IsraelStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSouthAfricaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("SouthAfricaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSouthAfricaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("SouthAfricaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRussianStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("RussianStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRussianStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("RussianStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getArabStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("ArabStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setArabStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("ArabStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEAfricaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("EAfricaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEAfricaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("EAfricaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getArabicStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("ArabicStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setArabicStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("ArabicStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIranStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("IranStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIranStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("IranStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getArabianStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("ArabianStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setArabianStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("ArabianStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCaucasusStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("CaucasusStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCaucasusStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CaucasusStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEkaterinburgStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("EkaterinburgStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEkaterinburgStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("EkaterinburgStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWestAsiaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("WestAsiaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWestAsiaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("WestAsiaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIndiaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("IndiaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIndiaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("IndiaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNepalStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("NepalStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNepalStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("NepalStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCentralAsiaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("CentralAsiaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCentralAsiaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CentralAsiaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSriLankaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("SriLankaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSriLankaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("SriLankaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNCentralAsiaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("NCentralAsiaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNCentralAsiaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("NCentralAsiaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMyanmarStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("MyanmarStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMyanmarStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("MyanmarStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNorthAsiaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("NorthAsiaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNorthAsiaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("NorthAsiaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getChinaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("ChinaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setChinaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("ChinaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSingaporeStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("SingaporeStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSingaporeStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("SingaporeStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTaipeiStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("TaipeiStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTaipeiStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("TaipeiStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWAustraliaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("WAustraliaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWAustraliaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("WAustraliaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNorthAsiaEastStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("NorthAsiaEastStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNorthAsiaEastStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("NorthAsiaEastStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getKoreaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("KoreaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setKoreaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("KoreaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTokyoStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("TokyoStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTokyoStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("TokyoStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getYakutskStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("YakutskStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setYakutskStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("YakutskStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCenAustraliaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("CenAustraliaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCenAustraliaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CenAustraliaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEAustraliaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("EAustraliaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEAustraliaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("EAustraliaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTasmaniaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("TasmaniaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTasmaniaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("TasmaniaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getVladivostokStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("VladivostokStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setVladivostokStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("VladivostokStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWestPacificStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("WestPacificStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWestPacificStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("WestPacificStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCentralPacificStandardTime() {
    try {
      java.lang.String res =
          Javonet.getType("cAlgo.API.TimeZones").get("CentralPacificStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCentralPacificStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("CentralPacificStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNewZealandStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("NewZealandStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNewZealandStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("NewZealandStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTongaStandardTime() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("TongaStandardTime");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTongaStandardTime(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("TongaStandardTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUTC() {
    try {
      java.lang.String res = Javonet.getType("cAlgo.API.TimeZones").get("UTC");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUTC(java.lang.String param) {
    try {
      Javonet.getType("cAlgo.API.TimeZones").set("UTC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
