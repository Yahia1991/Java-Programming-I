
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int i = 0;
        int even = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            }
            sum += number;
            i++;
            if ( number % 2 == 0){
                even++;
            }
        }
        double average = (double) sum / i;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + i);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        int odd = i - even;
        System.out.println("Odd: " + odd);
    }
}
