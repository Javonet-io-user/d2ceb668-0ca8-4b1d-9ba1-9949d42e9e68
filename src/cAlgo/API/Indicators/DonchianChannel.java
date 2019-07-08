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

public interface DonchianChannel {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getTop();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getMiddle();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IndicatorDataSeries getBottom();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTop(IndicatorDataSeries value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setMiddle(IndicatorDataSeries value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setBottom(IndicatorDataSeries value);
}
