package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> student = new HashMap<>();

        Student student1 = new Student("Aniya");
        student1.addGrade(75);
        student1.addGrade(100);
        student1.addGrade(56);
        student.put("mustardAddict123", student1);
        System.out.println(student.get("mustardAddict123").getGrades());

        Student student2 = new Student("Te'kevin");
        student2.addGrade(79);
        student2.addGrade(100);
        student2.addGrade(99);
        student.put("PotatoPusher126", student2);
        System.out.println(student.get("PotatoPusher126").getGradeAverage());
        System.out.println();

        System.out.println("Welcome");
        System.out.println("Here are the Github usernames of our students");
        System.out.println("mustardAddict123 | PotatoPusher126");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

       String toContinue;
        do{
            System.out.println("What student would you like to see more information on?\n");

            System.out.println("Would you like to see another student?\n");
          toContinue = scanner.next();
        }while(toContinue.equalsIgnoreCase("y"));
    }
}
