public class Line implements Comparable<Line>{
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Line(double startX,double startY,double endX, double endY){
        this.start= new  Point(startX,startY);
        this.end = new Point(endX,endY);
    }

    public Point getStart(){
        return this.start;
    }

    public Point getEnd(){
        return this.end;
    }

    public void setStart(Point start){
        this.start= start;
    }
    public void setEnd(Point end){
        this.end= end;
    }

    public double getStartX(){
        return this.start.getX();
    }
    
    public double getEndX(){
        return this.end.getX();
    }

    public double length(){
        double firstTerm = Math.pow((this.start.getX())- this.end.getX(),2);
        double secondTerm = Math.pow((this.start.getY())- this.end.getY(),2);

        double output = Math.sqrt(firstTerm + secondTerm);

        return output;
    }

    public Point midPoint(){
        double midX = (start.getX() + end.getX())/ 2.0;
        double midY = (start.getY() + end.getY())/2.0;

        return new Point(midX,midY);
    }

    @Override
    public String toString(){
        String output = "";

        output += "("+this.start+")";
        output += "("+this.end+")";

        return output;
    }

    public int compareTo(Line other){

        int output = 0;

        if (this.length() > other.length())
            output = 1;
        else if (this.length()< other.length())
            output = -1;
        
            return output;
    }

}
