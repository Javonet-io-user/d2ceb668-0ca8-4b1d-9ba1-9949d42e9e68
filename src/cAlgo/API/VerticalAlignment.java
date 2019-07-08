package cAlgo.API;

public enum VerticalAlignment {
  Center(0L),
  Top(1L),
  Bottom(2L),
  ;
  private long numVal;

  VerticalAlignment(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
