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
      System.out.println("5 - Find Cost Record"); //Encontrar registro de custo
      System.out.println("6 - Verify Employees With Highest Sum Of Recorded Costs"); //verificar funcionários com maior soma de custos registrados
      System.out.println("7 - Find Cost Record"); //Encontrar registro de custo
      System.out.println("8 - Delete Record"); //apagar registro
      System.out.println("9 - Verify Total Costs For The Month");//verificar os custos totais do mês
      System.out.println("10 - Verify Total Costs For The Last 3 Months");//verificar os custos totais dos últimos 3 meses
      System.out.println("11 - Choose functionality1");
      System.out.println("12 - Choose functionality1");
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
            String department = employeeAux.getDepartament(); 
            //EMPLOYEEAUX É TIPO EMPLOYEE, MAS DEPARTAMENTO É TIPO STRING, NÃO PODE APLICAR, E STRING DEPARTMENT NÃO PODE RECEBER TIPO EMPLOYEE
            String employeeRegister = employeeAux.getRegister();
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

      }
    }while(option != 0);
    in.close();
  }  
}
