import java.util.ArrayList;
/**
 *
 * @author yahia
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int max) {
        this.maxWeight = max;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight){
        this.suitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int total = 0;
        total = suitcases.stream().map((suit) -> suit.totalWeight()).reduce(total, Integer::sum);
        return total;
    }
    
    public void printItems(){
        for (Suitcase suit : suitcases){
            suit.printItems();
        }
    }
    
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()){
            return "0 suitcases (0 kg)";
        }
        if(this.suitcases.size() == 1){
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    
}
