import java.util.LinkedList;

public class CostSystem {
  public static Object out;
  private Employee loggedIn;
  LinkedList<Employee> employee = new LinkedList<>();
  LinkedList<Department> department = new LinkedList<>();
  private LinkedList<Record> costRecords = new LinkedList<>();

  /**
   * 
   */
  public void newCostRecord(double costValue, String description, String date, String categoryCost, String department) {
    if (loggedIn != null && isValidDepartment(department)) {
      Record record = new Record(costValue, description, date, categoryCost, department);
      costRecords.add(record);

      System.out.println("Registro de custo adicionado com sucesso.");
    } else {
      System.out.println("Falha ao adicionar registro de custo. Verifique o departamento ou faça login.");
    }
  }

  private boolean isValidDepartment(String departmentName) {
    Department[] departments = new Department[0];
    for (Department department : departments) {
      if (department.getDepartmentName().equals(departmentName)) {
        return true;
      }
    }
    return false;
  }//Nicolli

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
