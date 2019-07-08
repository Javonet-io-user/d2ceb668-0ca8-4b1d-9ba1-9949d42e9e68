package cAlgo.API.Indicators;

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
import cAlgo.API.Indicators.*;
import cAlgo.API.*;

public interface IchimokuKinkoHyo {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getKijunSen();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getTenkanSen();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getChikouSpan();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getSenkouSpanA();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getSenkouSpanB();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setKijunSen(IndicatorDataSeries value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTenkanSen(IndicatorDataSeries value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setChikouSpan(IndicatorDataSeries value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSenkouSpanA(IndicatorDataSeries value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSenkouSpanB(IndicatorDataSeries value);
}
