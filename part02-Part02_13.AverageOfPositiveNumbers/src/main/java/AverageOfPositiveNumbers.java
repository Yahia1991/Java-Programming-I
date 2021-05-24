
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nOn = 0;
        double sum = 0;
        while (true) {
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());
          
            if ( number == 0 ){
                break;
            }
            if ( number > 0 ){
                nOn++;
                sum += number;
            }
        }
        if ( sum == 0 ){
            System.out.println("Cannot calculate the average");
        }
        double average = sum / nOn;
        System.out.println( average);

    }
}
