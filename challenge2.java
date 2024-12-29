import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int mark=scan.nextInt();
        if(mark>=35){
            System.out.println("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}
