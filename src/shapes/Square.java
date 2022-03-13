package shapes;

public class Square extends Rectangle{
    public Square(int side){
        super(side, side);
    }

    public String work() {
        return "Square";
    }

}
