import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String na = String.valueOf(scanner.nextLine());
            if (na.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int du = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(na, du));
        }
        System.out.print("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram t : programs){
            if (t.getDuration()<= max){
                System.out.println(t);
            }
        }
    }
}
