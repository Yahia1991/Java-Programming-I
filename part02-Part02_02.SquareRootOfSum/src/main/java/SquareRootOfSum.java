
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fNumber = Double.valueOf(scanner.nextLine());
        double sNumber = Double.valueOf(scanner.nextLine());
        double sum = fNumber + sNumber;
        double sqSum = Math.sqrt(sum);
        System.out.println(sqSum);
        

    }
}
