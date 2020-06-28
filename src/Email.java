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
        System.out.print("         |________________________\n");

        System.out.println("          _________________________");
        System.out.print("Password | ");
        typePassword = keyboard.nextLine();
        System.out.print("         |________________________\n");


        if(username.equals(email) && userPassword.equals(typePassword)){
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.print("Welcome to your mailbox!\n");
            System.out.println("You have one unread email");
            
            System.out.print("Type your command here(1.read, 2.exit, 3.mark as unread)");
            String action = keyboard.nextLine();

            if (action.equals("1")){
                
            } else if (action.equals("2")){

            } else if(action.equals("3")){

            } else {
                System.out.println("Sorry that is not a command, please type 1 2 or 3");
            }



        } else {
            System.out.print("Sorry your username or password is incorrect. ");
            
            System.out.println("LOGIN PAGE");
            System.out.println("          _________________________");
            System.out.print("Username | ");
            username = keyboard.nextLine();
            System.out.print("         |________________________\n");

            System.out.println("          _________________________");
            System.out.print("Password | ");
            typePassword = keyboard.nextLine();
            System.out.print("         |________________________\n");
        }

       

      
    }
}