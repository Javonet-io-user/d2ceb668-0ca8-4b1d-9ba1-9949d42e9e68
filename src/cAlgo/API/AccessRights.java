package cAlgo.API;

public enum AccessRights {
  None(0L),
  FileSystem(1L),
  Internet(2L),
  Registry(4L),
  FullAccess(1073741824L),
  ;
  private long numVal;

  AccessRights(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
