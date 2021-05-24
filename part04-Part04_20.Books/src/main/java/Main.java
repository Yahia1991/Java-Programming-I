import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String t = String.valueOf(scanner.nextLine());
            if (t.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int p = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int y = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(t, p, y));
        }
        System.out.print("What information will be printed? ");
        String inf = String.valueOf(scanner.nextLine());
        
        for (Book b : book){
            if(inf.equals("everything")){
                System.out.println(b);
            } else if(inf.equals("name")){
                System.out.println(b.getTitle());
            }
        }
    }
}
