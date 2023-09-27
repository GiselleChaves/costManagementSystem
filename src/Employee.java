public class Employee {
  private String name;
  private int register;
  Department department;

  /**
   * @param name
   * @param register
   * @param Department
   */
  public Employee(String name, int register, Department department) {
    this.name = name;
    this.register = register;
    this.department = department;
  }

  /**
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return
   */
  public int getRegister() {
    return register;
  }
  
  /**
   * @param register
   */
  public void setRegister(int register) {
    this.register = register;
  }  

  /**
   * @return
   */
  public Department getDepartment() {
    return department;
  }

  @Override
  public String toString() {
    return "Employee: Name: " + name + ", Register: " + register + ", Department: " + department;
  }
}
