
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int fNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        int sNumber = Integer.valueOf(scanner.nextLine());

        int i = fNumber;
        int sum = 0;
        while ( i <= sNumber ) {
            sum += i;
            i++;
        } 
        System.out.println("The sum is " + sum);
    }
}
