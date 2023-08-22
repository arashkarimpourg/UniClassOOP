import java.util.Scanner;

public class EmployeeSalary {
  public static void main(String[] args) {
    String COLOR_RESET = "\u001B[0m";
    String COLOR_YELLOW = "\u001B[33m";
    String COLOR_RED = "\u001B[31m";
    String COLOR_BLUE = "\u001B[34m";

    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.print(COLOR_YELLOW + "Enter name: " + COLOR_RESET);
    String employeeName = scanner.nextLine();

    System.out.print(COLOR_YELLOW + "Enter number: " + COLOR_RESET);
    String employeeNumber = scanner.nextLine();

    Employee employee;
    String employeeType;

    System.out.print(COLOR_YELLOW + "Enter type (Permanent/Contractor): " + COLOR_RESET);
    employeeType = scanner.nextLine();
    if (employeeType.equalsIgnoreCase("Permanent") || employeeType.equalsIgnoreCase("P")) {
      employeeType = "Permanent";
      System.out.print(COLOR_YELLOW + "Enter basic salary: " + COLOR_RESET);
      long basicSalary = scanner.nextLong();
      employee = new PermanentEmployee(employeeName, employeeNumber, basicSalary);
    } else {
      employeeType = "Contractor";
      System.out.print(COLOR_YELLOW + "Enter number of hours: " + COLOR_RESET);
      int noOfHours = scanner.nextInt();
      employee = new ContractEmployee(employeeName, employeeNumber, noOfHours);
    }
    long salary = employee.getSalary();
    System.out.println();
    System.out.println(COLOR_YELLOW + "Name: " + COLOR_BLUE + employeeName + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Number: " + COLOR_BLUE + employeeNumber + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Type: " + COLOR_BLUE + employeeType + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Salary: " + COLOR_BLUE + salary + COLOR_RESET);
    System.out.println();
  }
}
