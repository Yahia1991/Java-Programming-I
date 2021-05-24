
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    Timer timer = new Timer();
    int i = 0;
        while (i < 1374) {
            System.out.println(timer);
            timer.advance();
            i++;
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
