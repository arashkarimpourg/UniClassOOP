public class ContractEmployee extends Employee {
  int noOfHours;

  ContractEmployee(String employeeName, String employeeNumber, int noOfHours) {
    super();
    this.employeeType = "Contractor";
    this.noOfHours = noOfHours;
  }

  long getSalary() {
    return noOfHours * 30;
  }
}
