/**
 *
 * @author yahia
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3 - (0.711 * age);
        double target = (maximumHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
        return target;
    }
}
