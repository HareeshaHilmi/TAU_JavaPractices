package chapter13;

public class DividingByZero {

    public static void main(String[] args) {

        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("There's a en error because " + e.getMessage());
        }finally {
            System.out.println("Division is fun");
        }

    }
}
