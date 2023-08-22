public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("Before attempting invalid settings: ");
        System.out.println("---------------------------------------");
        System.out.print("Initial universal time       | ");
        System.out.println(time.toUniversalString());
        System.out.print("Initial standard time        | ");
        System.out.println(time.toString());
        System.out.println("---------------------------------------");

        time.setTime(13,27,6);
        System.out.print("Universal time after setTime | ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime  | ");
        System.out.println(time.toString());
        System.out.println("---------------------------------------");

        try {
            time.setTime(99,99,99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }

        System.out.println("After attempting invalid settings: ");
        System.out.println("---------------------------------------");
        System.out.print("Universal Time               | ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard Time                | ");
        System.out.println(time.toString());
        System.out.println("---------------------------------------");
    }
}
