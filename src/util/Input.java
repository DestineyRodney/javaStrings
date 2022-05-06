package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

//    CONSTRUCTOR
    public Input (){
        scanner = new Scanner(System.in);
    }

    String getString (){
        System.out.println("Enter a string");

        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    boolean yesNo(){
//        System.out.println("Are you okay?(Y/N)");

        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || (input.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

public int getInt(){
        try{
            String newString = getString();
            return Integer.valueOf(newString);
        }catch (Exception e){
            System.out.println("Please enter an integer");
            return getInt();
        }
}
    int getInt( int min, int max){
        System.out.println("Enter a number between 1 and 10");
        int userInput = this.scanner.nextInt();
        if(userInput <= max && userInput >= min){
            return userInput;
        }
            System.out.println("Enter a number between min " +  min + " and max " + max );
        return getInt(min, max);
    }

//    int getInt (){
//        System.out.println("Enter a number");
//        return this.scanner.nextInt();
//
//        }

   public double getDouble (double min, double max){
        double userDouble;
        userDouble = scanner.nextDouble();
      if (userDouble <= max && userDouble >= min){
       return userDouble;
   }
       System.out.println("Please enter a decimal between min" + min + " and max " + max);
      return getDouble(min, max);
    }

//   public double getDouble (){
//        return this.scanner.nextDouble();
//   }

    public double getDouble(){
        try{
            String newString = getString();
            return Double.valueOf(newString);
        }catch (Exception e){
            System.out.println("Please enter a double");
            return getDouble();
        }
    }

}
