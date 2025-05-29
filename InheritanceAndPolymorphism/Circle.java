public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    
}
