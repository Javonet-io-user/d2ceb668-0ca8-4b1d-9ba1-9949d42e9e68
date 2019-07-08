package cAlgo.API;

public enum ErrorCode {
  TechnicalError(0L),
  BadVolume(1L),
  NoMoney(2L),
  MarketClosed(3L),
  Disconnected(4L),
  EntityNotFound(5L),
  Timeout(6L),
  ;
  private long numVal;

  ErrorCode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
