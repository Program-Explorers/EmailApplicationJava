
//import statements
import java.util.*;

public class Email {
    public static void main(final String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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

        System.out.print("\033[H\033[2J");
        System.out.flush();

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

        int loginNum = 0;

        while (loginNum < 3) {
            System.out.println("\n\nLOGIN PAGE");
            System.out.println("          _________________________");
            System.out.print("Username | ");
            username = keyboard.nextLine();
            System.out.print("         |_________________________\n");

            System.out.println("          _________________________");
            System.out.print("Password | ");
            typePassword = keyboard.nextLine();
            System.out.print("         |_________________________\n");

            if (username.equals(email) && userPassword.equals(typePassword)) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Welcome to your mailbox!\n");
                System.out.println("You have one unread email");

                while (true) {

                    System.out.print("\n\nType your command here (1.read, 2.exit 3.compose an email) ");
                    final String action = keyboard.nextLine();

                    if (action.equals("1")) {
                        System.out.println("From: " + company
                                + "\nContents: You have been fired from your job!\nPlease leave with all your belongings by Monday.");
                        System.out.println("You have zero unread emails");

                    } else if (action.equals("2")) {
                        System.out.print("Enjoy the rest of your unemployed life!\nExiting...\n");
                        System.exit(0);

                    } else if (action.equals("3")) {
                        System.out.print("Who is your recipient(s): ");
                        final String recipient = keyboard.nextLine();
                        System.out.print("Subject: ");
                        final String subject = keyboard.nextLine();
                        System.out.print("What is the message: ");
                        final String message = keyboard.nextLine();

                        System.out.print("\nTo: " + recipient + "\nSubject: " + subject + "\nMessage: " + message
                                + "\nFrom: " + firstName + lastName);

                    } else {
                        System.out.println("Sorry that is not a command, please type 1 2 or 3");

                    }

                    System.out.print("\n\n\n");

                }

            } else {
                loginNum++;
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
                System.out.print("Sorry your username or password is incorrect. ");

            }

        }

        System.out.println("You attempted your login info too many times\nPlease try again later");
        System.out.println("Exiting...\n");
        keyboard.close();
        System.exit(0);

    }
}
