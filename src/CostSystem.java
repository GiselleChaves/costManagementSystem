
import java.util.LinkedList;

public class CostSystem {
    public static Object out;
    LinkedList<Employee> employee = new LinkedList<>();
    LinkedList<Department> department = new LinkedList<>();

    /**
     *
     */
    public void newCostRecord() {
    }

    /**
     *
     */
    public void chooseEmployee() {
    }

    /**
     *
     */
    public void findCostRecordByDate() {
    }

    /**
     *
     */
    public void findCostRecordByCategory() {
    }

    /**
     *
     */
    public void findCostRecordByDepartment(Department departmentToFind) {
        System.out.println("Filtro por Gasto por Departamento");
        for (Cost cost : listCost) {
            if (departmentToFind.equals(cost.getDepartamento())) {
                System.out.println(cost);
            }
        }
    }

    /**
     *
     */
    public void deleteRecord() {
    }

    /**
     *
     */
    public void employeeCurrentlyLoggedIn() {
    }

    /**
     *
     */
    public void totalCostsForTheMonth() {
    }

    /**
     *
     */
    public void totalCostsForTheLast3Months() {
    }

    /**
     *
     */
    public void employeesWithHighestSumOfRecordedCosts() {
    }

    /**
     *
     */
    public void chooseFunctionality1(Department departmentToFind) {
        System.out.println("Media De Gasto pelo Departamento");
        int count = 0;
        double total = 0;
        double media = 0;
        double :mediaSemMaximoOUminimo = 0;
        double min = 0;
        double max = 0;

        for (Cost cost : listCost) {
            if (departmentToFind.equals(cost.getDepartamento())) {
                total = total + cost.getCusto();
                if (cost.getCusto() > max) max = cost.getCusto;
                if (cost.getCusto() < min) min = cost.getCusto;

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
    }
}
