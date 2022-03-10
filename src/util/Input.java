package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        Scanner scanner = new Scanner(System.in);
    }

    String getString(){
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    int getInt(int min, int max){
        int userInt;
        userInt = this.scanner.nextInt();

        if(userInt >= min && userInt <= max){
            return userInt;
        }else{
            System.out.println("Number is not between min and max");
            return getInt(min, max);
        }
    }

    public static void main (String[] args){
        Input input = new Input();
        input.getString();
        System.out.println(input);
    }
}
