package chapter9_exercise;

public class BirthdayCake extends Cake{

    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public BirthdayCake(){
        super("vanilla");
    }

}
