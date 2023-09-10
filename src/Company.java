public class Company {
  CostSystem costSystem = new CostSystem();
  Menu menu = new Menu();

  //MOCK
  public void mock() {
    Employee e1 = new Employee("Ana", 23165420, "Financial");
    Employee e2 = new Employee("Carlos", 23101550, "IT");
    Employee e3 = new Employee("João", 23101550, "Accounting");
    Employee e4 = new Employee("Camila", 23101550, "Purchasing");
    Employee e5 = new Employee("Sandra", 23101550, "Financial");
  }

}
