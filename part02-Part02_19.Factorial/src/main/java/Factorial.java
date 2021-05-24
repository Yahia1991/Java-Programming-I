
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int f = 1;
        while (f <= number) {
            i *= f; 
            f++;
        }
        System.out.println("Factorial: " + i);
    }
}
