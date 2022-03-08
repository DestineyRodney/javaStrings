import java.util.Scanner;

public class MethodsExercises {
    public static int addition (int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction (int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication (int num1, int num2){
        return num1 * num2;
    }

    public static int division (int num1, int num2){
        return num1 / num2;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput >= min & userInput <= max){
            return userInput;
        }
        System.out.println("Number not between min and max values");
        return getInteger(1,100);
    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(addition(5, 2));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(5,2));
        System.out.println(division(6,2));

        String answer;
        do {
            System.out.println("Enter a number between 0 - 100");
            int userNum = getInteger(0,100);
            System.out.println("Would you like to enter another number? (y/n)");
            answer = scanner.next();
        }while (answer.equalsIgnoreCase("y"));



    }
}
