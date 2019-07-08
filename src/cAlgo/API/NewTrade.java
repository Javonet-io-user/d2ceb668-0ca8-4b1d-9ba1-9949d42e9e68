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
import cAlgo.API.Internals.*;
import jio.System.*;

public abstract class NewTrade {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public TradeResult getLastResult() {
    try {
      Object res = javonetHandle.<NObject>get("LastResult");
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public NewTrade(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ExecuteMarketOrder(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<java.lang.Double> slippagePips,
      java.lang.String comment) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteMarketOrder",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              label,
              stopLossPips,
              takeProfitPips,
              slippagePips,
              comment);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult PlaceLimitOrder(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<DateTime> expiration,
      java.lang.String comment) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceLimitOrder",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              targetPrice,
              label,
              stopLossPips,
              takeProfitPips,
              expiration,
              comment);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult PlaceStopOrder(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<DateTime> expiration,
      java.lang.String comment) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceStopOrder",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              targetPrice,
              label,
              stopLossPips,
              takeProfitPips,
              expiration,
              comment);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult CancelPendingOrder(PendingOrder pendingOrder) {
    try {
      Object res = javonetHandle.invoke("CancelPendingOrder", pendingOrder);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ModifyPendingOrder(
      PendingOrder pendingOrder,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<DateTime> expirationTime) {
    try {
      Object res =
          javonetHandle.invoke(
              "ModifyPendingOrder",
              pendingOrder,
              volume,
              targetPrice,
              stopLossPips,
              takeProfitPips,
              expirationTime);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ModifyPosition(
      Position position,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit) {
    try {
      Object res = javonetHandle.invoke("ModifyPosition", position, stopLoss, takeProfit);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ClosePosition(Position position, java.lang.Long volume) {
    try {
      Object res = javonetHandle.invoke("ClosePosition", position, volume);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation ExecuteMarketOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.String label,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<java.lang.Integer> slippagePips,
      java.lang.String comment,
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteMarketOrderAsync",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              label,
              stopLossPips,
              takeProfitPips,
              slippagePips,
              comment,
              callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation ClosePositionAsync(
      Position position, java.lang.Long volume, ActionT<TradeResult> callback) {
    try {
      Object res = javonetHandle.invoke("ClosePositionAsync", position, volume, callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation PlaceLimitOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<DateTime> expiration,
      java.lang.String comment,
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceLimitOrderAsync",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              targetPrice,
              label,
              stopLossPips,
              takeProfitPips,
              expiration,
              comment,
              callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation PlaceStopOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<DateTime> expiration,
      java.lang.String comment,
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceStopOrderAsync",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              targetPrice,
              label,
              stopLossPips,
              takeProfitPips,
              expiration,
              comment,
              callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation CancelPendingOrderAsync(
      PendingOrder pendingOrder, ActionT<TradeResult> callback) {
    try {
      Object res = javonetHandle.invoke("CancelPendingOrderAsync", pendingOrder, callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation ModifyPendingOrderAsync(
      PendingOrder pendingOrder,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Integer> stopLossPips,
      Nullable<java.lang.Integer> takeProfitPips,
      Nullable<DateTime> expirationTime,
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "ModifyPendingOrderAsync",
              pendingOrder,
              volume,
              targetPrice,
              stopLossPips,
              takeProfitPips,
              expirationTime,
              callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeOperation ModifyPositionAsync(
      Position position,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke("ModifyPositionAsync", position, stopLoss, takeProfit, callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
