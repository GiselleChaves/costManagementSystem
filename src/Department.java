public enum Department {
  FINANCIAL("Financial"), IT("IT"), ACCOUNTING("Accounting"), PURCHASING("Purchasing");
  public String value;

  private Department(String value){
    this.value = value;
  }
}