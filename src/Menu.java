import java.util.Scanner;

public class Menu {
  CostSystem cost;
  CostRecord costRecord;

  public Menu() {
    cost = new CostSystem();
    //costRecord = new CostRecord(0, 0, null, null, null, null);
  }


  //MOCK
  public void mock() {
    cost.addEmployee(new Employee("Ana", 23165420, Department.FINANCIAL));
    cost.addEmployee(new Employee("Carlos", 23101550, Department.IT));
    cost.addEmployee(new Employee("Maria ", 23156250, Department.ACCOUNTING));
    cost.addEmployee(new Employee("Camila", 12564329, Department.PURCHASING));
    cost.addEmployee(new Employee("Sandra", 45856795, Department.FINANCIAL));
    cost.addEmployee(new Employee("José ", 45687235, Department.FINANCIAL));

    cost.addCostRecord = new CostRecord(23165420, 567.36, "may", "Cleaning material", "Cleaning", Department.FINANCIAL);
    cost.addCostRecord = new CostRecord(23156250, 17.98, "april", "Adm material", "Administrative", Department.ACCOUNTING);
    cost.addCostRecord = new CostRecord(23101550, 1952.74, "may", "Equipents", "IT Equipments", Department.IT);
    cost.addCostRecord = new CostRecord(45856795, 203.14, "april", "Adm material", "Administrative", Department.FINANCIAL);
    cost.addCostRecord = new CostRecord(45687235, 465.59, "december", "Adm material", "Administrative", Department.PURCHASING);
    cost.addCostRecord = new CostRecord(23101550, 756.34, "february", "Adm material", "Administrative", Department.IT);
    cost.addCostRecord = new CostRecord(12564329, 423.15, "June", "Cleaning material", "Administrative", Department.PURCHASING);
  }
  

  public void menu() {
    String choosenEmployee = null;
    mock();
    Scanner in = new Scanner(System.in);
    int option = 0;
    
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println("Welcome to the Cost cost Menu");
    System.out.println("------------------------------------------");    
    do{
      System.out.println("\n1 - Choose Employee"); //Escolha Funcionário
      System.out.println("2 - Verify Employee Currently Logged In"); //Verifique o funcionário atualmente logado
      System.out.println("3 - Include Employee"); // incluir Funcionário
      System.out.println("4 - Add Cost Record"); //Adicionar registro de custo
      System.out.println("5 - Delete Record"); //Apagar registro
      System.out.println("6 - Verify Employees With Highest Sum Of Recorded Costs"); //verificar funcionários com maior soma de custos registrados
      System.out.println("7 - Find Cost Record"); //Encontrar registro de custo
      System.out.println("8 - Verify Total Costs For The Month");//verificar os custos totais do mês
      System.out.println("9 - Verify Total Costs For The Last 3 Months");//verificar os custos totais dos últimos 3 meses
      System.out.println("10 - Average Spending by Department");
      System.out.println("11 - Choose functionality2");
      System.out.println("0 - To Finish Execution");
      System.out.println("");
      System.out.print("Choose an option above: ");

      option = in.nextInt();

      switch(option) {
        case 0: 
          System.out.println("Finished cost");
          break;
        case 1: //Choose Employee
          cost.printEmployList(); 
          System.out.println("");
          System.out.print("Choose an employee to be user: "); 
          choosenEmployee = in.next();
          cost.chooseEmployee(choosenEmployee);  
          System.out.println(); 

          if(cost.isEmployeeRegistered(choosenEmployee)) {
            System.out.println(" >> Employee: " + choosenEmployee + " successfully selected" );
          } else {
            System.out.println(" >> Employee " + choosenEmployee + " does not have a registration.");
          }
          break;
        case 2://Verify Employee Currently Logged In
          cost.employeeCurrentlyLoggedIn(choosenEmployee);
          System.out.println();
          break;
        case 3://Include Employee
          System.out.print("Inform the employee name: ");
          String NameIncludeEmployee = in.next();
          System.out.print("Inform the employee registry: ");
          int registryIncludeEmployee = in.nextInt();
          System.out.print("Inform the employee department: ");
          Department DepIncludeEmployee = Department.getDepartment(in.next());

          Employee employeeToBeIncluded = new Employee(NameIncludeEmployee, registryIncludeEmployee, DepIncludeEmployee);
          System.out.println("");

          if(!(cost.isEmployeeRegistered(NameIncludeEmployee))) {
            cost.addEmployee(employeeToBeIncluded);
            System.out.println(" >> Employee " + NameIncludeEmployee + " successfully registered" );
            cost.printEmployList();
          } else {
            System.out.println(" >> Employee " + NameIncludeEmployee + " already exist in the cost.");
          }
          break;
        case 4://Add Cost Record
          Employee employeeAux = null;
          Department departmentAdd = null;
          int employeeRegisterAdd = 0;

          System.out.println("To add a new Cost Record inform: ");
          System.out.print("Inform the employee name: ");
          String employeeName = in.next();

          employeeAux = cost.chooseEmployee(employeeName);
          if(employeeAux != null) {            
            departmentAdd = employeeAux.department;
            employeeRegisterAdd = employeeAux.getRegister();
          } else {
            System.out.print("Inform the employee department: ");
            departmentAdd = Department.getDepartment(in.next());
            System.out.print("Inform the employee register: ");
            employeeRegisterAdd = in.nextInt();
          }
          System.out.print("Inform the cost value: ");
          double value = in.nextDouble();
          System.out.print("Inform the month of the cost: ");
          String month = in.next();
          System.out.print("Inform the description: ");
          String description = in.next();
          System.out.print("Inform the cost category: ");
          String category = in.next();
          cost.newCostRecord(employeeRegisterAdd,value, month,description,category,departmentAdd);
          break;
          
        case 5://delete recordg
          System.out.println("Inform the id of the cost record that you want to delete:");
          int idDelete = in.nextInt();
          cost.deleteRecord(idDelete);
          break;

        case 7://find cost record
          int optionCostRecord = 0;
          System.out.println("Please, select the method of search to find the cost record: ");
          System.out.println("1-Find cost record by date");
          System.out.println("2-Find cost record by description");
          System.out.println("3-Find cost record by category");
          System.out.println("4-Find cost record by departament");
          System.out.println("0-Main menu");
          System.out.print("Option: ");
          optionCostRecord = in.nextInt();
          switch (optionCostRecord){
            case 1:
              String wantedDate;
              System.out.print("Please select the date you want to search: ");
              wantedDate = in.nextLine();
              System.out.println("\nTotal costs by this date:");
              System.out.println(cost.findCostRecordByDate(wantedDate));
              System.out.println();
              break;
            case 2:
              System.out.print("Please select the description you want to search: ");
              String wantedDescription = in.nextLine();
              System.out.println(cost.findCostRecordByDescription(wantedDescription));
              System.out.println("\nTotal costs by this description");
              System.out.println(cost.findCostRecordByDescription(wantedDescription));
              System.out.println();
              break;
            case 3:
              String wantedCategory;
              System.out.print("Please select the category you want to search: ");
              wantedCategory = in.nextLine();
              System.out.println("\nTotal costs by this category");
              System.out.println(cost.findCostRecordByCategory(wantedCategory));
              System.out.println();
              break;
            case 4:
              String wantedDepartament;
              System.out.print("Please select the departament you want to search: ");
              wantedDepartament = in.nextLine();
              System.out.println("\nTotal costs by this departament");
              System.out.println(cost.findCostRecordByDepartment(wantedDepartament));
              System.out.println();
              break;
            case 0:
              break;
          }
          break;
        case 8://Verify Total Costs For The Month
          String wantedMonth;
          System.out.print("Please write the month you want to consult: ");
          wantedMonth = in.nextLine();
          System.out.println(cost.totalCostsForTheMonth(wantedMonth));
          System.out.println();
          break;
        case 9://Verify Total Costs For The Last 3 Months
          int startMonth;
          System.out.println("Please, select the number of the current month");
          startMonth = in.nextInt();
          System.out.println(cost.totalCostsForTheLast3Months(startMonth));
          System.out.println();
          break;
        case 10://Average Spending by Department / Extra Funcion 1
          System.out.println();
          System.out.print("Please, inform the department name:");
          String departamentToFind = in.next();
          cost.averageSpendingByDepartment(Department.getDepartment(departamentToFind));
          break;
        case 11://Verify the registered departments / Extra Funcion2
          System.out.println();
          System.out.println("The registered departments are: ");
          Department.verifyRegisteredDepartments();
          break;

      }
    }while(option != 0);
    in.close();
  }  
}
