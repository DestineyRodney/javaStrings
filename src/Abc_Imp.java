public class Abc_Imp implements ABC{
    @Override
    public void show() {
        System.out.println("In show!");
    }

// tWO WAYS TO CREATE AN OBJECT EITHER IMPLEMENT FIRST THEN CREATE AN INSTANCE OR
//    CREATE AN INSTANCE THEN IMPLEMENT
//    3 interfaces : marker - blank / SAM(Single abstract method) or functional interface  / Normal
    public static void main(String[] args){
        ABC obj = new Abc_Imp();
        obj.show();
//        xyz obj1 = new xyz() {
//            @Override
//            public void xyz() {
//                System.out.println("XYZ HERE!");
//            }
//        };

//        or better w less code
        xyz obj1 = () -> System.out.println("XYZ HERE!");

        obj1.xyz();
    }
}
