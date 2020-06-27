
//import statements
import java.util.*;

public class Email {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        String email = "", firstName, lastName, company;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first name? ");
        firstName = keyboard.nextLine();
        email = email + firstName.toLowerCase();

        System.out.print("What is your last name? ");
        lastName = keyboard.nextLine();
        email = email + lastName.toLowerCase();
        email = email + '@';

        System.out.print("What is the name of your company? ");
        company = keyboard.nextLine();
        email = email + company.toLowerCase();
        email = email + ".com";

        System.out.print("\n");
        System.out.print(email);
        System.out.println("\n");

    }
}