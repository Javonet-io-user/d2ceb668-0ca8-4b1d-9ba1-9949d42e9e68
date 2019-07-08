package cAlgo.API;

public enum LineStyle {
  Solid(0L),
  Dots(1L),
  DotsRare(2L),
  DotsVeryRare(3L),
  LinesDots(4L),
  Lines(5L),
  ;
  private long numVal;

  LineStyle(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
