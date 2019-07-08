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

public interface TimeSeries {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public DateTime Last(java.lang.Integer index);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetIndexByExactTime(DateTime dateTime);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetIndexByTime(DateTime dateTime);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getItem(java.lang.Integer index);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getLastValue();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount();
}
