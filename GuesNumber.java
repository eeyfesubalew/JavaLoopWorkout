import java.util.Scanner;

public class GuesNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = (int)(Math.random()*5)+1;
        System.out.println("Guess a number from 1 to 5");
        int guess = scan.nextInt();

        while(guess!=number){
            System.out.println("Guess again");
            guess = scan.nextInt();
        }
        System.out.println("You got it");
        scan.close();
    }
}
