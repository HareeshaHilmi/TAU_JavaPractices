package chapter10.exercise;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple1 = new Apple();
        apple1.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit banana1 = new Banana();
        ((Banana) banana1).peel();

        Fruit orange = new Fruit();

        squeeze(banana);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing..");
        fruit.makeJuice();
    }
}
