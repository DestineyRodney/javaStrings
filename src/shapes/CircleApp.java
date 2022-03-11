package shapes;
import util.Input;
public class CircleApp {
    public static void main (String[] args) {
        Input input = new Input();
        System.out.println("Enter a radius");
        double userInput = input.getDouble();
        Circle circle = new Circle(userInput);

        System.out.println("Circumference : " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());
    }
}
