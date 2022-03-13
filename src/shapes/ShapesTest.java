package shapes;

public class ShapesTest {
    public static void main (String[] args){
        Rectangle box1 = new Rectangle(4,5);
        int area = box1.getArea();
        System.out.println(area);

        Rectangle box2 = new Square(5);
        int square = box2.getArea();
        System.out.println(square);
    }
}
