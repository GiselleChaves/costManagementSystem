public class Record {
    private double costValue;
    private String description;
    private String date;
    private String categoryCost;
    private String department;

    public Record(double costValue, String description, String date, String categoryCost, String department) {
        this.costValue = costValue;
        this.description = description;
        this.date = date;
        this.categoryCost = categoryCost;
        this.department = department;
    }

    public double getCostValue() {
        return costValue;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getCategoryCost() {
        return categoryCost;
    }

    public String getDepartment() {
        return department;
    }

    public void setCostValue(double costValue) {
        this.costValue = costValue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategoryCost(String categoryCost) {
        this.categoryCost = categoryCost;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Record{" +
                "costValue=" + costValue +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", categoryCost='" + categoryCost + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}