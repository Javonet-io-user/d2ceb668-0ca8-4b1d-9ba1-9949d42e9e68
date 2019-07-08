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

public interface Symbol {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long NormalizeVolume(java.lang.Double volume, RoundingMode roundingMode);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getAsk();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getBid();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getSpread();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getPipSize();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getDigits();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getPointSize();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getTickSize();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getVolumeMin();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getVolumeMax();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getVolumeStep();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getPipValue();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getTickValue();
}
