import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson (Person[] array, Person single){
        Person[] addOnePerson = Arrays.copyOf(array, array.length + 1 );
                addOnePerson[addOnePerson.length - 1] = new Person(single.getName());
                return addOnePerson;
    }
    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    Person[] students = new Person[3];
    students[0] = new Person("Niya");
    students[1] = new Person("Tk");
    students[2] = new Person("Des");
    }
}
