import java.util.ArrayList;
/**
 *
 * @author yahia
 */
public class Package {
   private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }
   
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
   
    public int totalWeight(){
        int total = 0;
        total = gifts.stream().map((gift) -> gift.getWeight()).reduce(total, Integer::sum);
        return total;
    }
}
