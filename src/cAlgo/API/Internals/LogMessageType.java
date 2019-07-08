package cAlgo.API.Internals;

public enum LogMessageType {
  Info(0L),
  Trading(1L),
  Error(2L),
  Warning(3L),
  ;
  private long numVal;

  LogMessageType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
