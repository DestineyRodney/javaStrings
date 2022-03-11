public class Person {
    private String name;

  public Person (String name){
      this.name = name;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void sayHello(){
        System.out.printf("Hello %s ", this.name);
    }

    public static void main (String[] args){
      Person person1 = new Person("Bob");
        System.out.println(person1.getName());

        person1.setName("Niya");

    }
}
