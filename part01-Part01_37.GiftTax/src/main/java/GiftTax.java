
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        
        if ( value < 5000){
            System.out.println("No tax!");
        } else if ( value >= 5000 && value < 25000){
            double valueMinus = value - 5000;
            double valueMulti = valueMinus *.08;
            double lLimit = 100;
            double tax = lLimit + valueMulti;
            System.out.println(tax);
        }else if ( value >= 25000 && value < 55000){
            double valueMinus = value - 25000;
            double valueMulti = valueMinus *.10;
            double lLimit = 1700;
            double tax = lLimit + valueMulti;
            System.out.println(tax);        
        }else if ( value >= 55000  && value < 200000){
            double valueMinus = value - 55000;
            double valueMulti = valueMinus *.12;
            double lLimit = 4700;
            double tax = lLimit + valueMulti;
            System.out.println(tax);
        }else if ( value >= 200000 && value < 1000000){
            double valueMinus = value - 200000;
            double valueMulti = valueMinus *.15;
            double lLimit = 22100;
            double tax = lLimit + valueMulti;
            System.out.println(tax);
        }else if ( value >= 1000000 ){
            double valueMinus = value - 1000000;
            double valueMulti = valueMinus *.17;
            double lLimit = 142100;
            double tax = lLimit + valueMulti;
            System.out.println(tax);
        }

    }
}
