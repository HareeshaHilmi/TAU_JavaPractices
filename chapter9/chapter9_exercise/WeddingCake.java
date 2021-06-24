package chapter9_exercise;

public class WeddingCake extends Cake{

    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public WeddingCake(){
        super("almond");
    }

}
