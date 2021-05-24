
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String st = scanner.nextLine();
        
        while (!st.isEmpty()){
            String[] pieces = st.split(" ");
            int in = pieces.length - 1;
            System.out.println(pieces[in]);
            st = scanner.nextLine();
        }

    }
}
