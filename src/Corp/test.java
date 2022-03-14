package Corp;

public class test {
    public static void main(String[] args){
        Employee manager = new Manager("Bob", "finance");

        Employee developer = new Developer("Tim", "accounting");

        System.out.println(manager.work());
        System.out.println(developer.work());

    }
}
