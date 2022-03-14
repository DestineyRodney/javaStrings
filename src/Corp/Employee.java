package Corp;

abstract class Employee {
    public String name;
    public String department;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public abstract String work();
}
