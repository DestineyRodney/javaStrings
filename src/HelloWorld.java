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
        scanner.useDelimiter("\n*");

        System.out.println("Enter length and width");
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        scanner.close();





    }
}
