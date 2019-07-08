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

public interface Timer {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Start(TimeSpan interval);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Start(java.lang.Integer intervalInSeconds);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Stop();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public TimeSpan getInterval();
}
