package shapes;

abstract public class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(){};

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public  void setWidth(int width){
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract int setLength();
    public abstract int setWidth();

}
