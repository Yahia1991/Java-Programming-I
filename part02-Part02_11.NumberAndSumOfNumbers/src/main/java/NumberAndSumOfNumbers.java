
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nOn = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if ( number == 0 ){
                break;
            }
            nOn++;
            sum += number;
        }
        System.out.print("Number of numbers: " + nOn);
        System.out.print("Sum of the numbers: " + sum);
    }
}
