package cAlgo.API;

public enum PlotType {
  Line(0L),
  Histogram(1L),
  Points(2L),
  DiscontinuousLine(3L),
  ;
  private long numVal;

  PlotType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
