package cAlgo.API;

public enum HorizontalAlignment {
  Center(0L),
  Left(1L),
  Right(2L),
  ;
  private long numVal;

  HorizontalAlignment(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
