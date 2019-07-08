package cAlgo.API;

public enum MovingAverageType {
  Simple(0L),
  Exponential(1L),
  TimeSeries(2L),
  Triangular(3L),
  VIDYA(4L),
  Weighted(5L),
  WilderSmoothing(6L),
  ;
  private long numVal;

  MovingAverageType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
