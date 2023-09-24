//armazena todos os custos dos lançamentos dos funcionarios

public class CostRecord {
    private int id = 0;
    private String employeeRegister;
    private double value;
    private String month;
    private String description;
    private String category;
    private String department;

    public CostRecord(int id, String employeeRegister, double value, String month, String description, String category, 
                    String department){
        this.id++;
        this.employeeRegister = employeeRegister;
        this.value = value;
        this.month = month;
        this.description = description;
        this.category = category;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeRegister() {
        return employeeRegister;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepartament() {
        return department;
    }

    public void setDepartament(String departament) {
        this.department = departament;
    }
}
