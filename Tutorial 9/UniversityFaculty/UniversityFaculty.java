class Person {
  String name;
  String address;
  String phoneNumber;
  String dateOfBirth;

  String COLOR_RESET = "\u001B[0m";
  String COLOR_YELLOW = "\u001B[33m";
  String COLOR_RED = "\u001B[31m";
  String COLOR_BLUE = "\u001B[34m";


  public Person(String name, String address, String phoneNumber, String dateOfBirth) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.dateOfBirth = dateOfBirth;
  }

  public void printRecords() {
    System.out.println(COLOR_YELLOW + "Name: " + COLOR_BLUE + name + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Address: " + COLOR_BLUE + address + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Phone Number: " + COLOR_BLUE + phoneNumber + COLOR_RESET);
    System.out.println(COLOR_YELLOW + "Date of Birth: " + COLOR_BLUE + dateOfBirth + COLOR_RESET);
  }
}

class Employee extends Person {
  String employeeId;

  public Employee(String name, String address, String phoneNumber, String dateOfBirth, String employeeId) {
    super(name, address, phoneNumber, dateOfBirth);
    this.employeeId = employeeId;
  }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Employee ID: " + COLOR_RED + employeeId + COLOR_RESET);
  }
}

class Academician extends Employee {
  String department;

  public Academician(String name, String address, String phoneNumber, String dateOfBirth, String employeeId, String department) {
    super(name, address, phoneNumber, dateOfBirth, employeeId);
    this.department = department;
  }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Department: " + COLOR_RED + department + COLOR_RESET);
  }
}

class Administration extends Employee {
  String adminId;

  public Administration(String name, String address, String phoneNumber, String dateOfBirth, String employeeId, String adminId) {
    super(name, address, phoneNumber, dateOfBirth, employeeId);
    this.adminId = adminId;
  }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Administrator ID: " + COLOR_RED + adminId + COLOR_RESET);
  }
}

class Student extends Person {
  String studentId;

  public Student(String name, String address, String phoneNumber, String dateOfBirth, String studentId) {
    super(name, address, phoneNumber, dateOfBirth);
    this.studentId = studentId;
  }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Student ID: " + COLOR_RED + studentId + COLOR_RESET);
  }
}

class UndergraduateStudent extends Student {
  String major;

  public UndergraduateStudent(String name, String address, String phoneNumber, String dateOfBirth, String studentId, String major) {
    super(name, address, phoneNumber, dateOfBirth, studentId);
    this.major = major;
  }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Major: " + COLOR_RED + major + COLOR_RESET);
  }
}

class PostGraduateStudent extends Student {
  String degree;

  public PostGraduateStudent(String name, String address, String phoneNumber, String dateOfBirth, String studentId, String degree) {
    super(name, address, phoneNumber, dateOfBirth, studentId);
    this.degree = degree;
  }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Degree: " + COLOR_RED + degree + COLOR_RESET);
  }
}

class DoctoralStudent extends PostGraduateStudent {
  String researchTopic;

  public DoctoralStudent(
      String name,
      String address,
      String phoneNumber,
      String dateOfBirth,
      String studentId,
      String degree,
      String researchTopic) {
    super(name, address, phoneNumber, dateOfBirth, studentId, degree);
    this.researchTopic = researchTopic;
      }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Topic of Research: " + COLOR_RED + researchTopic + COLOR_RESET);
  }
}

class MastersStudent extends PostGraduateStudent {
  protected String thesisTopic;

  public MastersStudent(
      String name,
      String address,
      String phoneNumber,
      String dateOfBirth,
      String studentId,
      String degree,
      String thesisTopic) {
    super(name, address, phoneNumber, dateOfBirth, studentId, degree);
    this.thesisTopic = thesisTopic;
      }

  public void printRecords() {
    super.printRecords();
    System.out.println(COLOR_YELLOW + "Topic of Thesis: " + COLOR_RED + thesisTopic + COLOR_RESET);
  }
}

public class UniversityFaculty {
  public static void main(String[] args) {
    Academician academician = new Academician(
        "Superman",
        "123 Main St",
        "123456789",
        "1990-01-01",
        "1234",
        "Computer Science");
    Administration administration = new Administration(
        "The Flash",
        "456 Everywhere",
        "9876543210",
        "1985-01-01",
        "1235",
        "Manager");
    UndergraduateStudent undergraduate = new UndergraduateStudent(
        "Thor",
        "789 Asgard",
        "5551234567",
        "2000-01-01",
        "1236",
        "Computer Science");
    DoctoralStudent doctoral = new DoctoralStudent(
        "Doctor Strange",
        "321 Multiverse",
        "5559876543",
        "1995-01-01",
        "1237",
        "PhD",
        "AI");

    System.out.println();
    academician.printRecords();
    System.out.println();
    administration.printRecords();
    System.out.println();
    undergraduate.printRecords();
    System.out.println();
    doctoral.printRecords();
    System.out.println();
  }
}
