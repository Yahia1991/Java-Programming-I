
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int fNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int sNumber = Integer.valueOf(scan.nextLine());
        
        if ( fNumber > sNumber){
            System.out.println("Greater number is: " + fNumber);
        } else if ( sNumber > fNumber){
            System.out.println("Greater number is: " + sNumber);
        }else {
            System.out.println("The numbers are equal!");
        }

    }
}
