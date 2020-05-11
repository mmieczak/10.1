import java.util.Scanner;

public class Utils {

    public static String[] collectPersonDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name: ");
        String name = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Age: ");
        String age = scanner.nextLine();
        System.out.print("PESEL: ");
        String pesel = scanner.nextLine();
        scanner.close();

        return new String[] {name, lastName, age, pesel};
    }
}
