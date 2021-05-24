
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true){
            int n = Integer.valueOf(scanner.nextLine());
            if(n == -1){
                break;
            }
            numbers.add(n);
        }
        
        int sum = 0;
        int i = 0;
        for (int num : numbers){
            sum += num;
            i++;
        }
        double average = (double) sum / i;
        System.out.println("Average: " + average);
    }
}
