
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //System.out.print("Name: ");
        //String it = String.valueOf(scanner.nextLine());
        while (true){
            System.out.print("Name: ");
            String it = String.valueOf(scanner.nextLine());
            if(it.isEmpty()){
                break;
            }
            items.add(new Item(it));     
        }
        for (Item i : items){
            System.out.println(i);
        }
    }
}
