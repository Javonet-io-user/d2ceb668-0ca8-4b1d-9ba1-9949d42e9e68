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

public interface GetFitnessArgs {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public History getHistory();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Positions getPositions();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public PendingOrders getPendingOrders();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getEquity();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getNetProfit();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getMaxBalanceDrawdownPercentages();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getMaxEquityDrawdownPercentages();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getMaxBalanceDrawdown();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getMaxEquityDrawdown();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getWinningTrades();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getLosingTrades();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getTotalTrades();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getAverageTrade();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getProfitFactor();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getSharpeRatio();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getSortinoRatio();
}
