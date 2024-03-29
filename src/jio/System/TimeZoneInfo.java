package jio.System;

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
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class TimeZoneInfo
    implements IEquatable<TimeZoneInfo>, ISerializable, IDeserializationCallback {
  protected NObject javonetHandle;

  public TimeZoneInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDeserialization(Object sender) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
          .invoke("OnDeserialization", sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class AdjustmentRule
      implements IEquatable<TimeZoneInfo.AdjustmentRule>, ISerializable, IDeserializationCallback {
    protected NObject javonetHandle;

    public AdjustmentRule(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void GetObjectData(SerializationInfo info, StreamingContext context) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
            .invoke("GetObjectData", info, context);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void OnDeserialization(Object sender) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
            .invoke("OnDeserialization", sender);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
  }

  public static class TransitionTime extends ValueType
      implements IEquatable<TransitionTime>, ISerializable, IDeserializationCallback {
    protected NObject javonetHandle;

    public TransitionTime(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void GetObjectData(SerializationInfo info, StreamingContext context) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
            .invoke("GetObjectData", info, context);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void OnDeserialization(Object sender) {
      try {
        javonetHandle
            .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
            .invoke("OnDeserialization", sender);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
