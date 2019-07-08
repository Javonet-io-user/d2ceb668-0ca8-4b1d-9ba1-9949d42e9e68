package cAlgo.API;

public enum TradeType {
  Buy(0L),
  Sell(1L),
  ;
  private long numVal;

  TradeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
