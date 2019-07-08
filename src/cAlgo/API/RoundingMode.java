package cAlgo.API;

public enum RoundingMode {
  ToNearest(0L),
  Down(1L),
  Up(2L),
  ;
  private long numVal;

  RoundingMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
