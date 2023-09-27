import java.util.Scanner;

public class Menu {
  CostSystem system;

  public Menu() {
    system = new CostSystem();
  }


  //MOCK
  public void mock() {
    system.addEmployee(new Employee("Ana", 23165420, "Financial"));
    system.addEmployee(new Employee("Carlos", 23101550, "IT"));
    system.addEmployee(new Employee("Mariagit ", 23101550, "Accounting"));
    system.addEmployee(new Employee("Camila", 23101550, "Purchasing"));
    system.addEmployee(new Employee("Sandra", 23101550, "Financial"));
  }
  

  public void menu() {
    mock();
    Scanner in = new Scanner(System.in);
    int option = 0;
    
    System.out.println();
    System.out.println("------------------------------------------");
    System.out.println("Welcome to the Cost System Menu");
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
      System.out.println("10 - Choose functionality1");
      System.out.println("11 - Choose functionality2");
      System.out.println("0 - To Finish Execution");
      System.out.println("");
      System.out.print("Choose an option above: ");

      option = in.nextInt();

      switch(option) {
        case 0: 
          System.out.println("Finished System");
          break;
        case 1: //Choose Employee
          system.printEmployList(); 
          System.out.println("");
          System.out.print("Choose an employee to be user: "); 
          String choosenEmployee = in.next();
          system.chooseEmployee(choosenEmployee);  
          System.out.println(); 

          if(system.isEmployeeRegistered(choosenEmployee)) {
            System.out.println(" >> Employee: " + choosenEmployee + " successfully selected" );
          } else {
            System.out.println(" >> Employee " + choosenEmployee + " does not have a registration.");
          }
          break;
        case 2://Verify Employee Currently Logged In
          System.out.print(" >> Employee currently Logged in the System: " + system.employeeCurrentlyLoggedIn());
          System.out.println();
          break;
        case 3://Include Employee
          System.out.print("Inform the employee name: ");
          String NameIncludeEmployee = in.next();
          System.out.print("Inform the employee registry: ");
          int registryIncludeEmployee = in.nextInt();
          System.out.print("Inform the employee department: ");
          String DepIncludeEmployee = in.next();

          Employee employeeToBeIncluded = new Employee(NameIncludeEmployee, registryIncludeEmployee, DepIncludeEmployee);
          System.out.println("");

          if(!(system.isEmployeeRegistered(NameIncludeEmployee))) {
            system.addEmployee(employeeToBeIncluded);
            System.out.println(" >> Employee " + NameIncludeEmployee + " successfully registered" );
            system.printEmployList();
          } else {
            System.out.println(" >> Employee " + NameIncludeEmployee + " already exist in the system.");
          }
          break;
        case 4://Add Cost Record
          Employee employeeAux;
          System.out.println("To add a new Cost Record inform: ");
          System.out.print("Inform the employee name: ");
          String employeeName = in.next();
          if(system.isEmployeeRegistered(employeeName)) {
            employeeAux = system.chooseEmployee(employeeName);
           // String department = employeeAux.getDepartment();
            //EMPLOYEEAUX É TIPO EMPLOYEE, MAS DEPARTAMENTO É TIPO STRING, NÃO PODE APLICAR, E STRING DEPARTMENT NÃO PODE RECEBER TIPO EMPLOYEE
           // String employeeRegister = employeeAux.getRegister();
            //EMPLOYEEAUX É TIPO EMPLOYEE, MAS REGISTER É TIPO STRING, NÃO PODE APLICAR, E STRING DEPARTMENT NÃO PODE RECEBER TIPO EMPLOYEE
          }else {
            System.out.print("Inform the employee department: ");
            String department = in.next();
            System.out.print("Inform the employee register: ");
            String employeeRegister = in.next();
          }
          System.out.print("Inform the cost value: ");
          double value = in.nextDouble();
          System.out.print("Inform the month of the cost: ");
          String month = in.next();
          System.out.print("Inform the description: ");
          String description = in.next();
          System.out.print("Inform the cost category: ");
          String category = in.next();
          system.newCostRecord();
          break;
        case 5://delete record
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
              System.out.println(system.findCostRecordByDate(wantedDate));
              System.out.println();
              break;
            case 2:
              String wantedDescription;
              System.out.print("Please select the description you want to search: ");
              wantedDescription = in.nextLine();
              System.out.println("\nTotal costs by this description");

              System.out.println();
              break;
            case 3:
              String wantedCategory;
              System.out.print("Please select the category you want to search: ");
              wantedCategory = in.nextLine();
              System.out.println("\nTotal costs by this category");
              //System.out.println(system.findCostRecordByCategory(wantedCategory));
              System.out.println();
              break;
            case 4:
              String wantedDepartament;
              System.out.print("Please select the departament you want to search: ");
              wantedDepartament = in.nextLine();
              System.out.println("\nTotal costs by this departament");
              System.out.println(system.findCostRecordByDepartment(wantedDepartament));
              System.out.println();
              break;
            case 0:
              break;
          }
          break;
        case 8://Verify Total Costs For The Month
          String wantedMonth;
          System.out.print("Please select the month you want to consult: ");
          wantedMonth = in.nextLine();
          System.out.println(system.totalCostsForTheMonth(wantedMonth));
          System.out.println();
          break;
        case 9://Verify Total Costs For The Last 3 Months

          break;
        case 10://Choose functionality1
          break;
        case 11://Choose functionality2
          break;

      }
    }while(option != 0);
    in.close();
  }  
}
