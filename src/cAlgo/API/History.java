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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public interface History
    extends jio.System.Collections.Generic.IEnumerable<HistoricalTrade>,
        jio.System.Collections.IEnumerable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalTrade FindLast(java.lang.String label);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalTrade FindLast(java.lang.String label, Symbol symbol);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalTrade FindLast(java.lang.String label, Symbol symbol, TradeType tradeType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalTrade[] FindAll(java.lang.String label, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalTrade[] FindAll(java.lang.String label, Symbol symbol, Class<?> returnArrayType);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public HistoricalTrade[] FindAll(
      java.lang.String label, Symbol symbol, TradeType tradeType, Class<?> returnArrayType);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public HistoricalTrade getItem(java.lang.Integer index);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount();
}
