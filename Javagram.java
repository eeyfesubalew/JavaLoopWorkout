import java.util.Scanner;
public class Javagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "samantha";
        String password = "Java<3";
        System.out.println("Please enter username and password");

        String enteredUserName = scan.next();
        String enteredPassword = scan.next();
        System.out.println(""+enteredUserName+""+enteredPassword);
        
        while(!username.equals(enteredUserName) && !password.equals(enteredPassword)){
            System.out.println("Please try again");
             enteredUserName = scan.next();
             enteredPassword = scan.next();
        }
        System.out.println("Successfully logedin");
        scan.close();
    }
}
