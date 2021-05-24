
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           while (true) {
           String tx = String.valueOf(scanner.nextLine());
           
            if(tx.isEmpty()){
                break;
            }
            String[] p = tx.split(" ");
            for (String p1 : p) {
                if(p1.contains("av")){
                System.out.println(p1);
                }
            }
        }
    }
}
