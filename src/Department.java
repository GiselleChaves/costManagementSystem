public class Department {
  private Department deparmentName;

  /**
   * @param deparmentName
   */
  public Department(Department deparmentName) {
    if(this.deparmentName == null) {
      this.deparmentName = new Department(deparmentName);
    }
  }

  /**
   * @return
   */
  public Department getDeparmentName() {
    return deparmentName;
  }

  /**
   * @param departmentName
   */
  public void setDeparmentName(Department deparmentName) {
    this.deparmentName = deparmentName;
  }
}
