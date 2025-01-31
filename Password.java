 import java.util.Random;
import java.util.Scanner;

public class Password{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // character which are used for password creating by us;

    String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    String digits = "0123456789";
    String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    // Password must contain all strings above so we are commanding the compiler to maintain all strings;

    String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;
    
    //Entering password manually;
    System.out.print("Enter your desired password: ");
    int passwordLength = scanner.nextInt();
        
    // we r giving a condition that the password must contain 10 or above 10 character;

    if (passwordLength >= 10) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }
        
    } else {
        System.out.println("Password length must be at least 10 characters. Please try again.");
    }

   
    // password id being accepted by th compiler
    StringBuilder password = new StringBuilder();

    // Displaying the password 
    System.out.println("Generated Password: " + password.toString());
    
    scanner.close();
}
}