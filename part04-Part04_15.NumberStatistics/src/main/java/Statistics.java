
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber (int number){
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if (this.count == 0){
            return 0;
        }
        double avr = (double) this.sum / this.count;
        return avr;
    }
}
