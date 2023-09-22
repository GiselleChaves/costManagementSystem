import java.util.ArrayList;
import java.util.List;

public class CostSystem {
  private List<Employee> employeeList;

  public CostSystem() {
    employeeList = new ArrayList<>();
  }

  /**
   * Method of adding employees to the register
   * @param employee
   */
  public void addEmployee(Employee employee) {
    this.employeeList.add(employee);
  }

  public void printEmployList() {
    if(employeeList.isEmpty()) {
      System.out.println("Empty Employee List!"); //Lista esta vazia
    } else {
      for(Employee employee : employeeList) {
        System.out.println(employee.getName());
      }
    }
  }

  /**
   * 
   */
  public void newCostRecord() {} //Nicolli      giselle menu
  
  /**
   * 
   */
  public Employee chooseEmployee(String employee) { //giselle menu
    for(Employee chosenEmployee : employeeList) {
      if (chosenEmployee.getName().equals(employee)) {
        return chosenEmployee; 
      }
      break;
    }
    return null;
  }

  public boolean isEmployeeRegistered(String employee) {    //giselle menu
    for(Employee chosenEmployee : employeeList) {
      if (chosenEmployee.getName().equals(employee)) {
        return true;
      }
    }
    return false;
  }

  /**
   * 
   */
  public void showEmployeeList() {      //giselle menu
    for(Employee employee : employeeList) {
      System.out.println(employee.getName());
    }
  }
  /**
   * 
   */
  public void findCostRecordByDate() {}//Augusto   giselle menu
  
  /**
   * 
   */
  public void findCostRecordByCategory() {}//Daniele    giselle menu
  
  /**
   * 
   */
  public void findCostRecordByDepartment() {}//Lucas    giselle menu
  
  /**
   * 
   */
  public void deleteRecord() {}//Oliver      gustavo menu
  
  /**
   * 
   */
  public void employeeCurrentlyLoggedIn() {}//     giselle menu
  
  /**
   * 
   */
  // public void totalCostsForTheMonth() {     gustavo menu
  //   float totalCosts = 0;
  //   for(Employee employee : employeeList) {
  //     totalCosts += employee.getTotalCosts();
  //   }
  // }//Matheus
  
  /**
   * 
   */
  public void totalCostsForTheLast3Months() {}//Augusto      gustavo menu
  
  /**
   * 
   */
  public void employeesWithHighestSumOfRecordedCosts() {}//Daniele    giselle menu
  
  /**
   * 
   */
  public void chooseFunctionality1() {}//Arthur     gustavo menu
  
  /**
   * 
   */
  public void chooseFunctionality2() {}//Athur      gustavo menu

  /**
   * @return
   */
  /*public List<Employee> employeeList() { 
    return employee;
  }*/
}