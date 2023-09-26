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
     *
     * @param employee
     */
    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void printEmployList() {
        if (employeeList.isEmpty()) {
            System.out.println("Empty Employee List!"); //Lista esta vazia
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee.getName());
            }
        }
    }

    /**
     *
     */
    public void newCostRecord() {
    } //Nicolli      giselle menu

    /**
     *
     */
    public Employee chooseEmployee(String employee) { //giselle menu
        for (Employee chosenEmployee : employeeList) {
            if (chosenEmployee.getName().equals(employee)) {
                return chosenEmployee;
            }
            break;
        }
        return null;
    }

    public boolean isEmployeeRegistered(String employee) {    //giselle menu
        for (Employee chosenEmployee : employeeList) {
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
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }

    /**
     *
     */
    public void findCostRecordByDescription(){

    }

    /**
     *
     */
    public void findCostRecordByDate() {
    }//Augusto   giselle menu

    /**
     *
     */
    public void findCostRecordByCategory(String targetCategory) {
        System.out.println("Filtro por gasto por Categoria: ");

        for (CostRecord cost : costRecordList) {
            if (cost.getCategory().equalsIgnoreCase(targetCategory)) {
                System.out.println("ID: " + cost.getId());
            }
        }
    }//Daniele    giselle menu



    public void findCostRecordByDepartment(Department departmentToFind) {
        System.out.println("Filtro por Gasto por Departamento");
        for (CostRecord cost : costRecordList ) {
            if (departmentToFind.equals(cost.getDepartament())) {
                System.out.println(cost);
            }
        }
    }

    /**
     *
     */
    public void deleteRecord() {
    }//Oliver      gustavo menu

    /**
     *
     */
    public void employeeCurrentlyLoggedIn() {
    }//     giselle menu

    /**
     *
     */
<<<<<<<HEAD

    public float totalCostsForTheMonth() {
        return getTotalCosts();
    }//Matheus

    public int getTotalCosts() {
        int totalCosts = 0;
        for (int i = 0; i < costRecordList.length; i++) {
            totalCosts += costRecordList[i];
        }
    }//Matheus
=======
        // public void totalCostsForTheMonth() {     gustavo menu
        //   float totalCosts = 0;
        //   for(Employee employee : employeeList) {
        //     totalCosts += employee.getTotalCosts();
        //   }
        // }//Matheus
        >>>>>>>7070dcf1444ca8761242653c986d4426efc3df5e

    /**
     *
     */
    public void totalCostsForTheLast3Months() {
    }//Augusto      gustavo menu

    /**
     *
     */
    public void employeesWithHighestSumOfRecordedCosts() {
    }//Daniele    giselle menu

    /**
     *
     */
  /*
  "Uma parte do trabalho foi designada para mim, mas acabei não percebendo que fiz
   o push para a minha branch principal (main) em vez da branch de desenvolvimento (developer).
    Recebi feedback do Mateus de que ele havia revisado e estava tudo bem, no entanto,
     o código não estava na branch de desenvolvimento. Agora percebi que outra pessoa assumiu a funcionalidade.
      Estou preocupado que isso possa me prejudicar, já que era apenas um método simples. Portanto,
      será criada uma terceira funcionalidade para o novo colega de trabalho. Por favor, faça as correções necessárias."
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

    /**
     *
     */
    public void chooseFunctionality2() {
    }//Athur      gustavo menu

    /**
     * @return
     */
  /*public List<Employee> employeeList() { 
    return employee;
  }*/
}