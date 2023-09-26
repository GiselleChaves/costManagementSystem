import java.util.LinkedList;

public class CostSystem {
  public static Object out;
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
  public void findCostRecordByDate(String month) {
    System.out.println("Filtro de gasto por data:");

    for(CostRecord CostRecord : costRecordList){
      if(costRecord.getMonth(month)){
        System.out.println("ID");
      }
    }
  }//Augusto
  
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
}
