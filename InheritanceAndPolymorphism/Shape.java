public abstract class Shape{
    private String color;

    public Shape(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    
    public abstract double getArea();

    
}