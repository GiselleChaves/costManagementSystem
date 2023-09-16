import java.util.Scanner;

public class Menu {
  CostSystem system;
  Company company;

  public Menu() {
    system = new CostSystem();
    company = new Company();
  }


  //MOCK
  public void mock() {
    system.addEmployee(new Employee("Ana", 23165420, "Financial"));
    system.addEmployee(new Employee("Carlos", 23101550, "IT"));
    system.addEmployee(new Employee("João", 23101550, "Accounting"));
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
      System.out.println("3 - Verify Employees With Highest Sum Of Recorded Costs"); //verificar funcionários com maior soma de custos registrados
      System.out.println("4 - Include Employee"); // incluir Funcionário
      System.out.println("5 - Find Cost Record"); //Encontrar registro de custo
      System.out.println("6 - Delete Record"); //apagar registro
      System.out.println("7 - Verify Total Costs For The Month");//verificar os custos totais do mês
      System.out.println("8 - Verify Total Costs For The Last 3 Months");//verificar os custos totais dos últimos 3 meses
      System.out.println("9 - Choose functionality1");
      System.out.println("10 - Choose functionality1");
      System.out.println("0 - To Finish Execution");
      System.out.println("");
      System.out.print("Choose an option above: ");

      option = in.nextInt();

      switch(option) {
        case 1:
          System.out.println("");
          System.out.println("-----------------------------------"); 
          System.out.println("| Os funcionários cadastrados são: |");
          System.out.println("-----------------------------------"); 
          system.printEmployList(); 
          System.out.println("");
          System.out.print("Choose an employee to be user:"); 
          String choosenEmployee = in.next();
          Employee employee = system.chooseEmployee(choosenEmployee);  
          System.out.println(""); 
          if(system.isEmployeeRegitered(choosenEmployee)) {
            System.out.println("Employee: " + choosenEmployee + " successfully selected" );
          } else {
            System.out.println("Employee " + choosenEmployee + " does not have a registration.");
          }
          break;
      }
    }while(option != 0);
  }
}