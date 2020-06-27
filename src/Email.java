//import statements
import java.util.*;

public class Email {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        String email = "", firstName, lastName, company, 
        chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
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
        
        Random rand = new Random();
        int password = rand.nextInt(3)+5;
        int length = chars.length();
        String userPassword = "";
        
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Your company email is ");
        System.out.print(email);
        System.out.println("\n");

        for(int i = 0; i < password; i++){
            int numIndex = rand.nextInt(length);
            char ch1 = chars.charAt(numIndex);
            userPassword = userPassword + ch1;
        }
        System.out.print("Your password is ");
        System.out.print(userPassword);
        System.out.print("\n\n");
       

       

      
    }
}