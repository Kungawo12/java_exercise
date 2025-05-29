public class diver {
    public static void main(String[] args) {
        Shape[] myShapes = new Shape[100];

        myShapes[0] = new Circle("Blue", 1);
        myShapes[1] = new Rectangle("Green", 4, 6);
        myShapes[2] = new Rectangle("Yello", 8, 4);
        myShapes[3] = new Circle("Red", 2);

        double maxArea = 0;
        int maxIndex = 0;

    for (int i = 0; i < myShapes.length; i++) {
        if(myShapes[i] != null){
            if(myShapes[i].getArea()> maxArea){
                maxArea = myShapes[i].getArea();
                maxIndex = i;
            }
        }
    }
    System.out.println("maxArea: " + maxArea);
    System.err.println("MaxIndex "+ maxIndex);
    
    if (myShapes[maxIndex] instanceof Circle) {
        System.out.println("The biggest shape is a Circle.");
    } else{
        System.out.println("The biggest shape is a Rectangle.");
    
    }



}
}
