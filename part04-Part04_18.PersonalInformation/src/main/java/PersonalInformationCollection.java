
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("First name: ");
            String f = String.valueOf(scanner.nextLine());
            if (f.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            String l = String.valueOf(scanner.nextLine());
            System.out.print("Identification number: ");
            String n = String.valueOf(scanner.nextLine());
            infoCollection.add(new PersonalInformation(f, l, n));
        } 
        System.out.println("");
        for (PersonalInformation p : infoCollection){
            System.out.println(p.getFirstName()+ " " + p.getLastName());
        }

    }
}
