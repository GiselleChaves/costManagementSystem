//armazena todos os custos dos lançamentos dos funcionarios

public class CostRecord {
    private double costValue;
    private String costDate;
    private String costDescription;
    private String costCategory;
    private String costDepartament;

    public CostRecord(){

    }

    public double getCostValue() {
        return costValue;
    }

    public void setCostValue(double costValue) {
        this.costValue = costValue;
    }

    public String getCostDate() {
        return costDate;
    }

    public void setCostDate(String costDate) {
        this.costDate = costDate;
    }

    public String getCostDescription() {
        return costDescription;
    }

    public void setCostDescription(String costDescription) {
        this.costDescription = costDescription;
    }

    public String getCostCategory() {
        return costCategory;
    }

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }

    public String getCostDepartament() {
        return costDepartament;
    }

    public void setCostDepartament(String costDepartament) {
        this.costDepartament = costDepartament;
    }
}
