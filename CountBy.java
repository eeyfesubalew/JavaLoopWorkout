import java.util.Scanner;

public class CountBy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number to count by: ");
        int countNum = scan.nextInt();

        System.out.println("Pick a number to start counting from: ");
        int countStart = scan.nextInt();

        System.out.println("Pick a number to count to: ");
        int countTo = scan.nextInt();

        for(int i = countStart; i<=countTo; i+=countNum){
            System.out.print(i+" ");
        }
    }
}
