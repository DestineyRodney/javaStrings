public class Polymorphism {
    public static void doWork(worker e){
        System.out.println(e.work());
    }

    public static void main(String[] args){
        worker one = new worker();
        worker two = new Manager();
        worker three = new intern();

        doWork(one);
        doWork(two);
        doWork(three);

        per teacher = new Teacher();
        System.out.println(teacher.work());
    }
}
