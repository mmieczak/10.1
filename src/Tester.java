import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        String[] personDetails = Utils.collectPersonDetails();

        Person person  = new Person(personDetails[0],personDetails[1], Integer.parseInt(personDetails[2]),Long.parseLong(personDetails[3]));

        System.out.println(person);

    }
}
