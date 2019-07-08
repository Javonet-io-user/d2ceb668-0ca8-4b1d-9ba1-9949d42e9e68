package cAlgo.API.Internals;

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
import cAlgo.API.Requests.*;

public interface ITrade {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Close(Position position);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateBuyMarketOrder(Symbol symbol, java.lang.Integer volume);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateSellMarketOrder(Symbol symbol, java.lang.Integer volume);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateMarketOrder(TradeType tradeType, Symbol symbol, java.lang.Integer volume);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateBuyLimitOrder(
      Symbol symbol,
      java.lang.Integer volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      Nullable<DateTime> expiration);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateSellLimitOrder(
      Symbol symbol,
      java.lang.Integer volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      Nullable<DateTime> expiration);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateBuyStopOrder(
      Symbol symbol,
      java.lang.Integer volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      Nullable<DateTime> expiration);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CreateSellStopOrder(
      Symbol symbol,
      java.lang.Integer volume,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      Nullable<DateTime> expiration);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ModifyPosition(
      Position position,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DeletePendingOrder(PendingOrder order);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ModifyPendingOrder(
      PendingOrder order,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      Nullable<DateTime> expirationTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void ModifyPendingOrder(
      PendingOrder order,
      java.lang.Double targetPrice,
      Nullable<java.lang.Double> stopLoss,
      Nullable<java.lang.Double> takeProfit,
      Nullable<DateTime> expirationTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Send(Request request);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsExecuting();
}
