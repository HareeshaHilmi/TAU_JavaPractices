package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeceptionHandling {

    public static void main(String[] args) {

        //createNewFiel();

        numberExceptionHandling();
    }

    public static void createNewFiel(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numberExceptionHandling(){
        File file = new File("resources/numbers.txt");

        try(Scanner fileReader = new Scanner(file)){
            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
          }



        /*Try catch is separately*/
//        catch (InputMismatchException e){
//            e.printStackTrace();
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (InputMismatchException e){
//            e.printStackTrace();
//        }
        // when come to this exception because others are not match with the relevant
//        catch (Exception e){
//
//        }
    }
}
