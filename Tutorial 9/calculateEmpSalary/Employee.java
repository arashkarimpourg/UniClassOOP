public class Employee {
  String employeeName;
  String employeeNumber;
  String employeeType;
  long basicSalary;
  int noOfHours;

  long getSalary() {
    if (employeeType.equals("Contractor")) {
      return noOfHours * 30;
    } else {
      return basicSalary + 300;
    }
  }

  double calculateEmpSalary() {
    return basicSalary;
  }
}
