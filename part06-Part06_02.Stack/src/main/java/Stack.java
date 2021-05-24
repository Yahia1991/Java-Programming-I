import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.stacks.isEmpty();
    }
    
    public void add(String value){
        this.stacks.add(value);
    }
    
    public ArrayList<String> values(){
        ArrayList<String> v = new ArrayList<>();
        for(String s : stacks){
            v.add(s);
        }
        return v;
    }
    
    public String take(){
        String takeOut = stacks.get(stacks.size() - 1);
        this.stacks.remove(takeOut);
        return takeOut;
    }
}
