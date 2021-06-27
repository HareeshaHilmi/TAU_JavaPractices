package chapter14;

import java.util.Random;

public class Coin {

    private String side;
    public static String head = "Head";
    public static String tail = "Tail";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        if(new Random().nextBoolean()){
            setSide(head);
        }else {
            setSide(tail);
        }
        return getSide();
    }

}
