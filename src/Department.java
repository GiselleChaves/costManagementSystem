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

  public static void verifyRegisteredDepartments() {
    for (Department departmentAux : values()) {
      System.out.println(departmentAux.value);
      }
  }

  @Override
  public String toString() {
    return ("Department: " + value);
  }

}
