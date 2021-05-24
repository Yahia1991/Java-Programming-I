
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        ArrayList<String> numbersList = new ArrayList<>();
        try (Scanner nums = new Scanner(Paths.get(file))){
            while(nums.hasNextLine()){
                numbersList.add(nums.nextLine());
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        for (String n : numbersList){
            if(Integer.valueOf(n) >= lowerBound && Integer.valueOf(n) <= upperBound){
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
