import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author yahia
 */
public class UserInterface {
    private Scanner reader;
    private JokeManager jokes;

    public UserInterface(JokeManager jokes, Scanner reader) {
        this.reader = reader;
        this.jokes = jokes;
    }
    
 public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = reader.nextLine();
            if (command.equals("X")) {
                break;
            }
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            addJoke();
        } else if (command.equals("2")) {
            drawJoke();
        } else {
            printJokes();
        }
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = reader.nextLine();
        jokes.addJoke(joke);
    }

    public void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(jokes.drawJoke());
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        jokes.printJokes();
    }

}