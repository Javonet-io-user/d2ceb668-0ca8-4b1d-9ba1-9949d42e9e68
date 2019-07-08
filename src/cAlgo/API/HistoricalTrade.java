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

public interface HistoricalTrade {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getClosingDealId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPositionId();
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
  public DateTime getEntryTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getEntryPrice();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getClosingTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getClosingPrice();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getLabel();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getComment();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getCommissions();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getSwap();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getNetProfit();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getGrossProfit();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getBalance();
}
