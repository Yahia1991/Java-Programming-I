/**
 *
 * @author yahia
 */
public class Timer {
    private ClockHand seconds;
    private int hundredthsOfSecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfSecond = hundredthsOfSecond;
    }
    
    public void advance(){
        this.hundredthsOfSecond++;
        if(this.hundredthsOfSecond >= 100){
            this.hundredthsOfSecond = 0;
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString(){
        if(this.hundredthsOfSecond < 10){
            return seconds + ":0"  + hundredthsOfSecond; 
        } else {
            return seconds + ":"  + hundredthsOfSecond; 
        }
    }
}
