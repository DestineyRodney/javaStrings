public class oop_person {
    public String firstName;
    public String lastName;

    public String sayHello(){
        return String.format("Hello %s %s", firstName, lastName);
    }
//    Here we define a class named oop_person with two instance variables, or fields, firstName and lastName. The class also defines an instance method, sayHello.

    public static void main(String[] arg){
        oop_person person = new oop_person();
        person.firstName = "Destiney";
        person.lastName = "Rodney";
        System.out.println(person.sayHello());

//        static fields, those that belong to a class as a whole. Static fields are accessible through the class itself. In other words, they are accessible without creating an instance of the class.
        System.out.println(Math.PI); // 3.141592653589793

    }
}
