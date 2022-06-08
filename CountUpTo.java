import java.util.Scanner;

public class CountUpTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number you would like count up to");
        int num = scan.nextInt();

        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
            
        }
    }
}
