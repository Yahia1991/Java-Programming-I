
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        int oldest = 0;
        String ol = null;
        while(!input.isEmpty()) {
            String[] arr = input.split(",");
            for (int i = 1; i < arr.length; i += 2) {
                if (Integer.valueOf(arr[i]) > oldest) {
                    oldest = Integer.valueOf(arr[i]);
                    ol = arr[i - 1];
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + ol);
    }
}
