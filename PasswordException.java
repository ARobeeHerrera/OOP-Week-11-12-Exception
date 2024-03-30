import java.util.Scanner;

public class PasswordException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maxAttempts = 3, attempts = 0;

        try {
            while (attempts < maxAttempts) {
                System.out.print("Enter Password: ");
                String password = input.next();

                try {
                    new correctPassword(password);
                    System.out.println("Login Successfully!");
                    break;
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    attempts++;
                }
            }
            if(attempts == maxAttempts) {
                throw new maxLoginAttemptsException("Max Attempts reached");
            }
        }catch (maxLoginAttemptsException e) {
            System.out.println(e.getMessage());
        }
    }
}