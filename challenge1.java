// USER INPUTS
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        scan.nextLine();
        String userName=scan.nextLine();
        System.out.println("Sum of two inputs: "+(a+b));
        System.out.print(userName);

    }
}
