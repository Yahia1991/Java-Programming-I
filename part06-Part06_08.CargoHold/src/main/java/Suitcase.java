import java.util.ArrayList;
/**
 *
 * @author yahia
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int max) {
        this.items = new ArrayList<>();
        this.maxWeight = max;
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    public int totalWeight(){
        int total = 0;
        total = items.stream().map((item) -> item.getWeight()).reduce(total, Integer::sum);
        return total;
    }
    
    public void printItems(){
        items.forEach((item) -> {
            System.out.println(item);
        });
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : items){
            if(heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.items.size() == 1){
            return "1 item (" + this.totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
}
