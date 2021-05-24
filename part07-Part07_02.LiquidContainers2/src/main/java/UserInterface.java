
import java.util.Scanner;

/**
 *
 * @author yahia
 */
public class UserInterface {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }
    
    public void start(){
            System.out.println("First: " + this.firstContainer.toString());
            System.out.println("Second: " + this.secondContainer.toString());
            
            while(true){
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            processCommand(command, amount);
                System.out.println("First: " + this.firstContainer.toString());
                System.out.println("Second: " + this.secondContainer.toString());
            
        }
    }
    
    public void processCommand(String command, int amount){
        if (command.equalsIgnoreCase("add")) {
            add(amount);
        } else if (command.equalsIgnoreCase("move")) {
            move(amount);
        } else if (command.equalsIgnoreCase("remove")) {
            remove(amount);
        }
    }
    
    public void add(int amount){
        this.firstContainer.add(amount);
    }
    
    public void move(int amount){
        if(amount > 0){
            if(amount > this.firstContainer.contains()){
                this.secondContainer.add(this.firstContainer.contains());
                this.firstContainer.remove(amount);
            }else {
                this.firstContainer.remove(amount);
                this.secondContainer.add(amount);
            }
        }
    }
    
    public void remove(int amount){
        this.secondContainer.remove(amount);
    }
}
