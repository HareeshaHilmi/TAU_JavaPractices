package chapter10.exercise;

public class Apple extends Fruit{

    public Apple(){
        setCalories(52);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds removed.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }
}
