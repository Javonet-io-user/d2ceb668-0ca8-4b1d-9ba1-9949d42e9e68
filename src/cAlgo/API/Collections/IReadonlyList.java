package cAlgo.API.Collections;

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
import cAlgo.API.Collections.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public interface IReadonlyList<T>
    extends jio.System.Collections.Generic.IEnumerable<T>, jio.System.Collections.IEnumerable {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public T getItem(java.lang.Integer index, Class<?> returnType);
}
