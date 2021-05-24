
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int fNumber = Integer.valueOf(scanner.nextLine());
        int sNumber = Integer.valueOf(scanner.nextLine());
        
        if ( fNumber > sNumber) {
            System.out.println( fNumber + " is greater than " + sNumber);
        } else if ( sNumber > fNumber) {
            System.out.println( fNumber + " is smaller than " + sNumber);
        } else {
            System.out.println(fNumber + " is equal to " + sNumber);
        }

    }
}
