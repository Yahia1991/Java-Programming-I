
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
           String tx = String.valueOf(scanner.nextLine());

            String[] p = tx.split(" ");
            if(tx.isEmpty()){
                break;
            }
            for (String p1 : p) {
            System.out.println(p1);
        }
        }
    }
}
