import java.util.ArrayList;
import java.util.List;

public class CostSystem {
  private List<Employee> employeeList;
  private List<CostRecord> costRecordList;

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
  public void newCostRecord() {} //Nicolli
  
  /**
   * 
   */
  public Employee chooseEmployee(String employee) {
    for(Employee chosenEmployee : employeeList) {
      if (chosenEmployee.getName().equals(employee)) {
        return chosenEmployee; 
      }
      break;
    }
    return null;
  }

  public boolean isEmployeeRegistered(String employee) {
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
  public void showEmployeeList() {
    for(Employee employee : employeeList) {
      System.out.println(employee.getName());
    }
  }
  /**
   * 
   */
  public void findCostRecordByDate() {}//Augusto
  
  /**
   * 
   */
  public void findCostRecordByCategory() {}//Daniele
  
  /**
   * 
   */
  public void findCostRecordByDepartment() {}//Lucas
  
  /**
   * 
   */
  public void deleteRecord() {}//Oliver
  
  /**
   * 
   */
  public void employeeCurrentlyLoggedIn() {}//Nicolli
  
  /**
   * 
   */
  public float totalCostsForTheMonth() {
    return getTotalCosts();
  }//Matheus

  public int getTotalCosts() {
    int totalCosts = 0;
    for (int i=0; i < costRecordList.length; i++) {
      totalCosts += costRecordList[i];
    }
  }//Matheus
  
  /**
   * 
   */
  public void totalCostsForTheLast3Months() {}//Augusto
  
  /**
   * 
   */
  public void employeesWithHighestSumOfRecordedCosts() {}//Daniele
  
  /**
   * 
   */
  public void chooseFunctionality1() {}//Arthur
  
  /**
   * 
   */
  public void chooseFunctionality2() {}//Athur

  /**
   * @return
   */
  /*public List<Employee> employeeList() { 
    return employee;
  }*/
}