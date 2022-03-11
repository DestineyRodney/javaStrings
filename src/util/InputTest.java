package util;
import java.util.Scanner;
public class InputTest {
    public static void main (String[] args) {
        Input input = new Input();
//        getString()
//        String myString = input.getString();
//        System.out.println("My string says: " + myString);
//
////        getYesNo()
//        boolean userInput = input.yesNo();
//        System.out.println("The user is " + userInput);

//       getInt()
//        int userInt = input.getInt();
//        System.out.println("My number is " + userInt);

//        getInt(int min, int max)
//        int userIntBtn = input.getInt(1,10);
//        System.out.println("My number is" + userIntBtn);

//        getDouble(double min, double max)
//        System.out.println("Enter a decimal number between 1 and 10");
//        double userDouble = input.getDouble(1, 10);
//        System.out.println(userDouble);

//        input.getString("Enter a string");

        input.yesNo("Are you okay?");
    }

}
