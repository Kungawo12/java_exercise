public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length = length;
    }

    public int getWidth(){
        return this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }
}
