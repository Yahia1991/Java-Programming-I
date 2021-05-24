/**
 *
 * @author yahia
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably(){
        if (this.balance >= 2.60){
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily(){
        if (this.balance >= 4.60){
        this.balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
        if (amount < 0){
            return;
        }
        double total = this.balance + amount;
        if (total < 150){
            this.balance += amount;
        } else {
            this.balance = 150;
        }
    }
    
    @Override
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}
