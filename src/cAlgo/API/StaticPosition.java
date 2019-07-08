package cAlgo.API;

public enum StaticPosition {
  TopLeft(0L),
  TopRight(1L),
  TopCenter(2L),
  Left(3L),
  Right(4L),
  Center(5L),
  BottomLeft(6L),
  BottomRight(7L),
  BottomCenter(8L),
  ;
  private long numVal;

  StaticPosition(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
