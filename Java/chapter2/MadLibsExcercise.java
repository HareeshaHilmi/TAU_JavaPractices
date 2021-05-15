package chapter2;

import java.util.Scanner;

public class MadLibsExcercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your season of the year : ");
        String season = scanner.next();

        System.out.println("Enter a whole number : ");
        int holeNumber = scanner.nextInt();

        System.out.println("Enter an adjective : ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + holeNumber + " cups of coffee");
    }
}
