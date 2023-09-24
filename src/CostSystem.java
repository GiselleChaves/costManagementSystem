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
      totalCost += record.getCostValue();
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
            if (record.getCostValue() > 500) {
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

  /**
   * @return
   */
  /*public List<Employee> employeeList() { 
    return employee;
  }*/
}