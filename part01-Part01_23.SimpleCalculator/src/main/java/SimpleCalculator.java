
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sum = first + second;
        int minus = first - second;
        int multi = first * second;
        double devision = (double) first / second;
        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + " - " + second + " = " + minus);
        System.out.println(first + " * " + second + " = " + multi);
        System.out.println(first + " / " + second + " = " + devision);


    }
}
