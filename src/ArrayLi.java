import java.util.ArrayList;
public class ArrayLi {
//    private String name;
//    private ArrayList<String> cars;
//
//    public ArrayLi(String name) {
//        this.name = name;
//        this.cars = cars = new ArrayList<>();
//    }
    public static void main (String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("a");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(numbers.get(0));

        ArrayList<Double> num = new ArrayList<>();
        num.add(5.6);
        num.add(7.2);
        System.out.println(num);
        num.add(1, 7.6 );
        System.out.println(num);
        System.out.println(num.contains(7.2));
        System.out.println(num.isEmpty());
        num.remove(1);
        System.out.println(num);


    }
}
