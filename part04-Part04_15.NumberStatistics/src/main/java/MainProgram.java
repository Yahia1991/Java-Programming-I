
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics eStatistics = new Statistics();
        Statistics oStatistics = new Statistics();

        System.out.println("Enter numbers: ");
        while (true){
            int nu = Integer.valueOf(scanner.nextLine());
            
            if (nu < 0){
                break;
            }
            statistics.addNumber(nu);
            if (nu % 2 == 0){
                eStatistics.addNumber(nu);
            } else if (nu % 2 != 0){
                oStatistics.addNumber(nu);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + eStatistics.sum());
        System.out.println("Sum of odd numbers:: " + oStatistics.sum());
    }
}
