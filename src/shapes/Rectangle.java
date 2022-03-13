package shapes;

public class Rectangle {
    protected  int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(){};

    public int getLength(){
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length){
    this.length = length;
        }

    public void setWidth(int width){
        this.width = width;
    }

    public int getArea(){
        return  length * width;
    }
    public String work() {
        return "Rectangle";
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

}