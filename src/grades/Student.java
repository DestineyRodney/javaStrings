package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName){
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        int sum = 0;
      for(int i = 0; i < grades.size(); i++){
          sum = sum + grades.get((int) i);
      }
        return sum / grades.size();
    }

    public static void main (String[] args){
        Student student1 = new Student("Ryan");
        student1.addGrade(97);
        student1.addGrade(100);
        student1.addGrade(50);

        System.out.println(student1.getGradeAverage());
    }
}
