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
import jio.System.*;

public interface ChartObjects {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawText(
      java.lang.String objectName,
      java.lang.String text,
      java.lang.Integer index,
      java.lang.Double yValue,
      VerticalAlignment verticalAlignment,
      HorizontalAlignment horizontalAlignment,
      Nullable<Colors> color);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawText(
      java.lang.String objectName,
      java.lang.String text,
      StaticPosition position,
      Nullable<Colors> color);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawLine(
      java.lang.String objectName,
      java.lang.Integer index1,
      java.lang.Double y1,
      java.lang.Integer index2,
      java.lang.Double y2,
      Colors color,
      java.lang.Double thickness,
      LineStyle style);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawLine(
      java.lang.String objectName,
      DateTime date1,
      java.lang.Double y1,
      DateTime date2,
      java.lang.Double y2,
      Colors color,
      java.lang.Double thickness,
      LineStyle style);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawVerticalLine(
      java.lang.String objectName,
      DateTime date,
      Colors color,
      java.lang.Double thickness,
      LineStyle style);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawVerticalLine(
      java.lang.String objectName,
      java.lang.Integer index,
      Colors color,
      java.lang.Double thickness,
      LineStyle style);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void DrawHorizontalLine(
      java.lang.String objectName,
      java.lang.Double y,
      Colors color,
      java.lang.Double thickness,
      LineStyle style);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void RemoveObject(java.lang.String objectName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void RemoveAllObjects();
}
