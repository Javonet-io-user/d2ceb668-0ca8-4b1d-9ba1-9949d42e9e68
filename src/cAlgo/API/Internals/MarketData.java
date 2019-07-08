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

public interface MarketData {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MarketDepth GetMarketDepth(java.lang.String symbolCode);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MarketDepth GetMarketDepth(Symbol symbol);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MarketSeries GetSeries(TimeFrame timeFrame);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MarketSeries GetSeries(java.lang.String symbolCode, TimeFrame timeFrame);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public MarketSeries GetSeries(Symbol symbol, TimeFrame timeFrame);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Symbol GetSymbol(java.lang.String symbolCode);
}
