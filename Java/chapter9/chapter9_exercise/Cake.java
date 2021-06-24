package chapter9_exercise;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(100);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
