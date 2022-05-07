public class Employee extends Person{
    private int salary; // subclass can add new fields

    public Employee(String employeeName) {
        super(employeeName);
    }

    public String sayHello(){
        return"Hello, world";
    }

    public String greet(){
        return super.sayHello();
    }
//    subclass can override method

    public static void main(String[] arg){
        Employee name = new Employee("Destiney");
        System.out.println(name.getName());
        System.out.println(name.sayHello());
        System.out.println(name.greet());

    }
}

//Employee class inherited the name field and sayHello method
