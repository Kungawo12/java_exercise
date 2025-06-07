public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }

    @Override
    public String toString(){
        String output = "";

        output += this.x + ",";
        output += this.y;

        return output;
    }

    public boolean equals(Object obj){
        boolean output = false;

        Point p = (Point)obj;
        if(this.x == p.x && this.y == p.y)
            output = true;
        
        return output;
    }
}
