package chapter10.exercise;

public class Banana extends Fruit{

    public Banana(){
        setCalories(89);
    }

    public void peel(){
        System.out.println("Banana peel is removed.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made.");
    }
}
