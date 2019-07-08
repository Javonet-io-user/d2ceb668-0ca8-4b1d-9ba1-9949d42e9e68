package cAlgo.API;

public enum PendingOrderType {
  Limit(0L),
  Stop(1L),
  ;
  private long numVal;

  PendingOrderType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
