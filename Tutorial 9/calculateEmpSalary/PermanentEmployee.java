public class PermanentEmployee extends Employee {
  long basicSalary;

  PermanentEmployee(String employeeName, String employeeNumber, long basicSalary) {
    super();
    this.employeeType = "Permanent";
    this.basicSalary = basicSalary;
  }

  long getSalary() {
    return basicSalary + 300;
  }

  double calculateEmpSalary() {
    return basicSalary;
  }
}
