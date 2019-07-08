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
import jio.System.*;

public interface PendingOrder {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSymbolCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public TradeType getTradeType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getVolume();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public PendingOrderType getOrderType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getTargetPrice();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getExpirationTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Double> getStopLoss();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Double> getStopLossPips();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Double> getTakeProfit();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Double> getTakeProfitPips();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLabel();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getComment();
}
