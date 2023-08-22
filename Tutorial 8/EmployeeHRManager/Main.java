public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        employee.getSalary();

        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
    }
}