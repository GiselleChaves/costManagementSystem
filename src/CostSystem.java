import java.util.ArrayList;
import java.util.List;

public class CostSystem {
  private List<Employee> employeeList;
  private List<CostRecord> costRecordList;
  Employee employeeSelected;

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

  /**
   * Method show the list of registered employees 
   */
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
   * Method find and select the employee received by parameter 
   * @param employee
   * @return the employee selected
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

  /**
   * Return the employ currently Logged in the system
   */
  public Employee employeeCurrentlyLoggedIn() {
    return employeeSelected;
  }

  /**
   * Return a boolean value. True if is registered or false if not
   */
  public boolean isEmployeeRegistered(String employee) {    //giselle menu
    for(Employee chosenEmployee : employeeList) {
      if (chosenEmployee.getName().equals(employee)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Show a list with all the employees registereds
   */
  public void showEmployeeList() {      //giselle menu
    for(Employee employee : employeeList) {
      System.out.println(employee.getName());
    }
  }

  /**
   * Method add a new cost record on the list costRecords
   */
  public void newCostRecord() {} //Nicolli      giselle menu
  

  /**
   * Method find a cost record with the date received by parameter
   * @param dataRecord
   * @return the cost record with the date received by parameter
   */
  public void findCostRecordByDate() {}//Augusto   giselle menu
  
  /**
   * Method find a cost record with the date received by parameter
   * @param category
   * @return the cost record with the category received by parameter
   */
  public void findCostRecordByCategory() {}//Daniele    giselle menu
  
  /**
   * Method find a cost record with the department received by parameter
   * @param department
   * @return the cost record with the department received by parameter
   */
  public void findCostRecordByDepartment() {}//Lucas    giselle menu
  
  /**
   * Method find and delete a cost record with the id received by parameter
   * @param department
   * @return the cost record with the department received by parameter
   */
  public void deleteRecord() {}//Oliver      gustavo menu
  
    
  /**
   * Method return the total value of cost records registereds
   * @param costRecordList
   * @return totalCosts
   */
  public double getTotalCosts() {
    int totalCosts = 0;
    for(CostRecord cr : costRecordList) {
      if(cr.getMonth() != null){
        totalCosts += cr.getValue();
      }
    }
    return totalCosts;
  }

  /**
   * 
   */
  public float totalCostsForTheMonth() {
    return getTotalCosts();
  }//Matheus


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
  //Funcionalidade escolhida 1
  public double calculateAverageCostPerEmployee() {
    if (employeeList.isEmpty() || costRecordList.isEmpty()) {
      return 0;
    }

    double totalCost = 0;
    for (int i = 0; i < costRecordList.size(); i++) {
      CostRecord record = costRecordList.get(i);
      totalCost += record.getValue();
    }

    double averageCost = totalCost / employeeList.size();
    return averageCost;
}
//Arthur     gustavo menu
  
  /**
   * 
   */
  //Funcionalidade escolhida 2
  public int countEmployeesWithCostOver500() {
    int count = 0;

    for (Employee employee : employeeList) {
        boolean hasCostOver500 = false;

        for (CostRecord record : costRecordList) {
            if (record.getValue() > 500) {
                hasCostOver500 = true;
                break;
            }
        }

        if (hasCostOver500) {
            count++;
        }
    }

    return count;
}
//Arthur      gustavo menu
}