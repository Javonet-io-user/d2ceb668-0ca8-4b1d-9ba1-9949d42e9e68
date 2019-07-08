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

public interface MarketSeries {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getOpen();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getHigh();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getLow();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getClose();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getTickVolume();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getMedian();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getTypical();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getWeighted();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DataSeries getWeightedClose();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public TimeSeries getOpenTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public TimeFrame getTimeFrame();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSymbolCode();
}
