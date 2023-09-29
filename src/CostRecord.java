public class CostRecord {
    private static int countId = 0;
    private int id;
    private int employeeRegister;
    private double value;
    private String month;
    private String description;
    private String category;
    private Department department;

    public CostRecord(int employeeRegister, double value, String month, String description, String category, 
                    Department department){
        this.employeeRegister = employeeRegister;
        this.value = value;
        this.month = month;
        this.description = description;
        this.category = category;
        this.department = department;
        this.id=countId++;
    }

    public int getId() {
        return id;
    }

    public int getEmployeeRegister() {
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

    public Department getDepartament() {
        return department;
    }

    public void setDepartament(Department departament) {
        this.department = departament;
    }
}
