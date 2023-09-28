import java.util.ArrayList;
import java.util.List;

public class CostSystem {
    private List<Employee> employeeList;
    private List<CostRecord> costRecordList;
    Employee employeeSelected;

  public CostSystem() {
    employeeList = new ArrayList<>();
    costRecordList = new ArrayList<>();
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
  public boolean isEmployeeRegistered(String employee) {
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
  public void showEmployeeList() { 
    for(Employee employee : employeeList) {
      System.out.println(employee.getName());
    }
  }

  /**
   * Method add a new cost record on the list costRecords
   */
  public void newCostRecord() {} //Nicolli
  

  /**
   * Method find a cost record with the date received by parameter
  // * @param dataRecord
   * @return the cost record with the date received by parameter
   */
  public List<CostRecord> findCostRecordByDate(String targetDate) {
    List<CostRecord> costRecordListAux = new ArrayList<>();
    for(CostRecord cr : costRecordList) {
      if(cr.getMonth().equalsIgnoreCase(targetDate)) {
        costRecordListAux.add(cr);
      }
    }
    return costRecordListAux;
  }
   
 

  

  
  /**
   * Method find a cost record with the date received by parameter
 //  * @param category
   * @return the cost record with the category received by parameter
   */
  public CostRecord findCostRecordByCategory(String targetCategory) {
   // System.out.println("Filtro por gasto por Categoria: ");
      CostRecord categoryAux = null;
      for (CostRecord cost : costRecordList) {
        if (cost.getCategory().equalsIgnoreCase(targetCategory)) {
       //   System.out.println("ID: " + cost.getId());
          categoryAux = cost;
        }
      }
      return categoryAux;
  }
  
  /**
   * Method find a cost record with the department received by parameter
   * @param department
   * @return the cost record with the department received by parameter
   */
  public CostRecord findCostRecordByDepartment(String department) {
    CostRecord departmentAux = null;
    for(CostRecord cr : costRecordList) {
      if(cr.getDepartament().equals(department)) {
        departmentAux = cr;
      }
    }
    return departmentAux;
  }
  
  /**
   * Method find and delete a cost record with the id received by parameter
  // * @param department
   * @return the cost record with the department received by parameter
   */
  public void deleteRecord() {}//Oliver
  
    
  /**
   * Method return the total value of cost records registereds
 //  * @param costRecordList
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
  public double totalCostsForTheMonth(String month) {
    double totalCosts = 0;
    for(CostRecord cr : costRecordList) {
      if(cr.getMonth().equals(month)) {
        totalCosts += cr.getValue();
      }
    }
    return totalCosts;
  }
  
  /**
   * 
   */
  public double totalCostsForTheLast3Months(int currentMonthNumber) {
     double totalCosts = 0;

     int startMonthNumber = currentMonthNumber - 2;

      if (startMonthNumber <= 0) {
      startMonthNumber += 12;  
      }

     return null;

  }//Augusto               gustavo menu
 
  
  /**
   * 
   */
  public Employee employeesWithHighestSumOfRecordedCosts() {//Daniele
    int maxRegister = -1;
    double maxSum = 0.0;

    for (Employee employeeAux : employeeList) {
      int register = employeeAux.getRegister();
      String registerString = Integer.toString(register);
      double sum = 0.0;

    for (CostRecord cost : costRecordList) {
        if (cost.getEmployeeRegister() == registerString) {
            sum += cost.getValue();
        }
    }
    if (sum > maxSum) {
      maxSum = sum;
      maxRegister = register;
    }
  }

    for (Employee employee : employeeList) {
      if (employee.getRegister() == maxRegister) {
          System.out.println("Funcionário: " + employee.getName() + " - Registro: " + maxRegister + " - Soma dos Custos: " + maxSum);
          break;
      }
    }
  }

  /**
   * 
   */
  public double calculateAverageCostPerEmployee() {
    if (employeeList.isEmpty() || costRecordList.isEmpty()) {
      return 0;
    }
      return 0;
  }


  /**
   * 
   */
  public int countEmployeesWithCostOver500() {
    int count = 0;
    return count;
  }

 
  /**
   *
   */
  public void findCostRecordByDescription(){

  }

  /**
   * @param departmentToFind
   */
  public CostRecord findCostRecordByDepartment(Department departmentToFind) {
   // System.out.println("Filtro por Gasto por Departamento");
    CostRecord categoryAux = null;
    for (CostRecord cost : costRecordList ) {
      if (departmentToFind.equals(cost.getDepartament())) {
         // System.out.println(cost);
        categoryAux = cost;
      }
    }
    return categoryAux;
  }


  /**
   * @param departmentToFind
   */
  public void chooseFunctionality1(Department departmentToFind) {
    System.out.println("Media De Gasto pelo Departamento");
    int count = 0;
    double total = 0;
    double media = 0;
    double mediaSemMaximoOUminimo = 0;
    double min = 0;
    double max = 0;

    for (CostRecord cost : costRecordList) {
      if (departmentToFind.equals(cost.getDepartament())) {
        total = total + cost.getValue();
        if (cost.getValue() > max) max = cost.getValue();
        if (cost.getValue() < min) min = cost.getValue();

        count++;
      }
    }
    media = total / count;
    mediaSemMaximoOUminimo = total - min - max;
    mediaSemMaximoOUminimo = mediaSemMaximoOUminimo / count;
    // Apresentão dos dados medias maximos e minimos por departament .
    System.out.println("Valor Total Gasto por Departamento : " + total);
    System.out.println("\nValor Medio de Gasto por Departamento : " + media);
    System.out.println("\nValor medio descartando o valor max e min de Gasto do Departamento : " + mediaSemMaximoOUminimo);
    System.out.println("\nValor da maior compra do Departamento : " + max);
    System.out.println("\nValor da menor compra do Departamento  : " + min);
  }
}