import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello, World!");
//        int myFavNum = 5;
//        String myString = "Hello honey";
////        long myNumber = 123;
//         double myFloat = 3.14;
//
////        int x = 5;
////        System.out.println(x++);
////        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        int three = (int) 3.14;
//        short num = 32767;
//        num ++;
//        System.out.println(num);

//        String name = "codeup";
//        System.out.printf("Hello there, %s.", name);
//
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter a name");
////        String userInput = scanner.next();
////        System.out.println(userInput);
//
//        System.out.println("Enter a line");
//        String userLine = scanner.nextLine();
//        System.out.println(userLine);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a length");
//        int userLength = Integer.parseInt(scanner.nextLine());
//        System.out.println("user length " + userLength);
//        System.out.println("Enter a width");
//        int userWidth = Integer.parseInt(scanner.nextLine());
//        System.out.println("user length: " + userWidth);
//
//        int Perimeter = (userLength * 2) + (userWidth * 2);
//        System.out.println("Perimeter: " + Perimeter);
//
//        int area = (userLength * userWidth);
//        System.out.println("Area: " + area);
//        Using DELIMITER
//        scanner.useDelimiter("\n");
//
//        System.out.println("Enter length and width");
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt());
//        scanner.close();

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

//        int i = 5;
//        while (i < 15){
//            ++i;
//            System.out.println(i);
//        }

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//         int i = 0;
//        do {
//            System.out.println(i += 2);
//        }while (i < 100);
//Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println(i -= 5);
//        }while (i > -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        long i = 2;

        do {
            System.out.println(i);

            i= i * i;
        }while (i< 1000000);





    }
}
