import java.util.Scanner;

public class Menu {
  CostSystem system = new CostSystem();
  
  public void menu() {
    Scanner in = new Scanner(System.in);
    int option = 0;

    System.out.println("Welcome to the Cost System Menu");

    do(){
    System.out.print("Choose an option below: ");
    option = in.nextInt();

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

    switch(option) {
      case 1: System.out.println("Os funcionários cadastrados são:");
              system.employeeList(); 
              system.chooseEmployee();
    }
  } while(option != 0);
}
}
