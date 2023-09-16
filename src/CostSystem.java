import java.util.ArrayList;
import java.util.List;

public class CostSystem {
  private List<Employee> employeeList;
  private List<Department> departmentList;
  //Company company = new Company();

  public CostSystem() {
    employeeList = new ArrayList<>();
    departmentList = new ArrayList<>();
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
        //break;
      }
    }
    return null;
  }//Matheus

  public boolean isEmployeeRegitered(String employee) {
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
  public void showEmployeeList() {//Matheus
    employee.toString();
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
  public void totalCostsForTheMonth() {}//Matheus
  
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
  public void chooseFunctionality1() {}//Lucas
  
  /**
   * 
   */
  public void chooseFunctionality2() {}//Oliver

  /**
   * @return
   */
  public List<Employee> employeeList() { // Giselle
    return employee;
  }
}