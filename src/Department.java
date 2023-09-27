public enum Department {
  FINANCIAL("Financial"), IT("IT"), ACCOUNTING("Accounting"), PURCHASING("Purchasing");
  public String value;

  private Department(String department){
    this.value = department;
  }

  public static Department getDepartment(String department) {
    for (Department departmentAux : values()) {
      if (departmentAux.value.equals(department)) {
        return departmentAux;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return ("Department: " + value);
  }

}