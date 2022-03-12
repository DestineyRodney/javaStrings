package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String toCont;
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("Enter a number 1-5");
            userInput = scanner.nextInt();
            if(userInput == 0){
                System.out.println("Thank you see you next time");
            }else if (userInput == 1){
                Movie.displayMovies(movies);
            }else if (userInput == 2){
                Movie.displayByGenre(movies, "animated");
            }
            System.out.println("Would you like to enter another selection? (y/n)");
            toCont = scanner.next();
        }while (toCont.equalsIgnoreCase("y"));
    }
}
