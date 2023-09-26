import java.util.LinkedList;

public class CostSystem {
  public static Object out;
  private Employee loggedIn;
  LinkedList<Employee> employee = new LinkedList<>();
  LinkedList<Department> department = new LinkedList<>();

  /**
   * 
   */
  public void newCostRecord() {} //Nicolli
  
  /**
   * 
   */
  public void chooseEmployee() {}//Matheus
  
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
  public void employeeCurrentlyLoggedIn(Employee e) {
    if (loggedIn != null) {
      System.out.println("Employee currently logged in: " + loggedIn.getName());
    } else {
      System.out.println("No employees are currently logged in.");
    }
  }//Nicolli

  public void loggedIn(Employee e) {
    loggedIn = e;
  }

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
}
