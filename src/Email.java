//import statements
import java.util.*;

public class Email {
    public static void main(final String[] args) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        String email = "", firstName, lastName, company;
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final Scanner keyboard = new Scanner(System.in);

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

        final Random rand = new Random();
        final int password = rand.nextInt(3) + 5;
        final int length = chars.length();
        String userPassword = "";

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Your company email is ");
        System.out.print(email);
        System.out.println("\n");

        for (int i = 0; i < password; i++) {
            final int numIndex = rand.nextInt(length);
            final char ch1 = chars.charAt(numIndex);
            userPassword = userPassword + ch1;
        }

        String username = "";
        String typePassword = "";
        System.out.print("Your password is ");
        System.out.print(userPassword);
        System.out.print("\n\n");

        System.out.println("LOGIN PAGE");
        System.out.println("          _________________________");
        System.out.print("Username | ");
        username = keyboard.nextLine();
        System.out.print("        |________________________\n");

        System.out.println("          _________________________");
        System.out.print("Password | ");
        typePassword = keyboard.nextLine();
        System.out.print("        |________________________\n");

       

      
    }
}