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
import cAlgo.API.Internals.*;
import cAlgo.API.*;
import jio.System.*;

public class Robot extends Algo {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ITrade getTrade() {
    try {
      Object res = javonetHandle.<NObject>get("Trade");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IAccount getAccount() {
    try {
      Object res = javonetHandle.<NObject>get("Account");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
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

  public Robot() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("cAlgo.API.Robot");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Robot(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Stop() {
    try {
      javonetHandle.invoke("Stop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ExecuteMarketOrder(TradeType tradeType, Symbol symbol, java.lang.Long volume) {
    try {
      Object res =
          javonetHandle.invoke("ExecuteMarketOrder", NEnum.fromJavaEnum(tradeType), symbol, volume);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ExecuteMarketOrder(
      TradeType tradeType, Symbol symbol, java.lang.Long volume, java.lang.String label) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteMarketOrder", NEnum.fromJavaEnum(tradeType), symbol, volume, label);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TradeResult ExecuteMarketOrder(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteMarketOrder",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              label,
              stopLossPips,
              takeProfitPips);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
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
      Nullable<java.lang.Double> marketRangePips) {
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
              marketRangePips);
      if (res == null) return null;
      return new TradeResult((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
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
      Nullable<java.lang.Double> marketRangePips,
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
              marketRangePips,
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
      TradeType tradeType, Symbol symbol, java.lang.Long volume, java.lang.Double targetPrice) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceLimitOrder", NEnum.fromJavaEnum(tradeType), symbol, volume, targetPrice);
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
      java.lang.String label) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceLimitOrder", NEnum.fromJavaEnum(tradeType), symbol, volume, targetPrice, label);
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips) {
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
              takeProfitPips);
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<DateTime> expiration) {
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
              expiration);
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
      TradeType tradeType, Symbol symbol, java.lang.Long volume, java.lang.Double targetPrice) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceStopOrder", NEnum.fromJavaEnum(tradeType), symbol, volume, targetPrice);
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
      java.lang.String label) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceStopOrder", NEnum.fromJavaEnum(tradeType), symbol, volume, targetPrice, label);
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips) {
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
              takeProfitPips);
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<DateTime> expiration) {
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
              expiration);
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<DateTime> expirationTime) {
    try {
      Object res =
          javonetHandle.invoke(
              "ModifyPendingOrder",
              pendingOrder,
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
  public TradeResult ModifyPendingOrder(
      PendingOrder pendingOrder,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
  public TradeResult ClosePosition(Position position) {
    try {
      Object res = javonetHandle.invoke("ClosePosition", position);
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
      TradeType tradeType, Symbol symbol, java.lang.Long volume, ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteMarketOrderAsync", NEnum.fromJavaEnum(tradeType), symbol, volume, callback);
      if (res == null) return null;
      return new TradeOperation((NObject) res);
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
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "ExecuteMarketOrderAsync",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              label,
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
  public TradeOperation ExecuteMarketOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
  public TradeOperation ExecuteMarketOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<java.lang.Double> marketRangePips,
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
              marketRangePips,
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
  public TradeOperation ExecuteMarketOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<java.lang.Double> marketRangePips,
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
              marketRangePips,
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
  public TradeOperation ClosePositionAsync(Position position, ActionT<TradeResult> callback) {
    try {
      Object res = javonetHandle.invoke("ClosePositionAsync", position, callback);
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
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceLimitOrderAsync",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              targetPrice,
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
  public TradeOperation PlaceLimitOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
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
  public TradeOperation PlaceLimitOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
  public TradeOperation PlaceLimitOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<DateTime> expiration,
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
  public TradeOperation PlaceLimitOrderAsync(
      TradeType tradeType,
      Symbol symbol,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      java.lang.String label,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "PlaceStopOrderAsync",
              NEnum.fromJavaEnum(tradeType),
              symbol,
              volume,
              targetPrice,
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<DateTime> expiration,
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
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
      Nullable<DateTime> expirationTime,
      ActionT<TradeResult> callback) {
    try {
      Object res =
          javonetHandle.invoke(
              "ModifyPendingOrderAsync",
              pendingOrder,
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
  public TradeOperation ModifyPendingOrderAsync(
      PendingOrder pendingOrder,
      java.lang.Long volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLossPips,
      Nullable<java.lang.Double> takeProfitPips,
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
