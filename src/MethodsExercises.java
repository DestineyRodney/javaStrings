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

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        String toContinue;
        do {
            System.out.println("Enter a number 1-10");
            int userInput = scanner.nextInt();
            if(userInput <= 10 & userInput >= 1){
                String calc = "! =";
                long factorial = 1;
                for(int i = 1; i <= userInput; i++){
                    factorial *= i;
                    calc = calc + "" + i + " x";
                }
                calc = calc.substring(0, calc.length() - 1);
                System.out.println(userInput + calc + " = " + factorial);
            }else {
                System.out.println("The number you entered is not between 1 and 10");
            }
            System.out.println("Would you like to coninue? (y/n)");
            toContinue = scanner.next();

        }while (toContinue.equalsIgnoreCase("y"));
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

factorial();

    }
}
