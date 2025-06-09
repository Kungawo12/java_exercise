public class Driver {
    public static void main(String[] args) {

        Line[] lines = new Line[500];
        lines[0] = new Line(1,0,5,5);
        lines[1] = new Line(1,2,8,9);
        lines[2] = new Line(4,4,0,0);

        double maxLength = 0;
        int maxIndex = -1;

    for (int i = 0; i < lines.length; i++) {
        if(lines[i] != null){
            double currentLength = lines[i].length();
            if(currentLength > maxLength){
                maxLength= currentLength;
                maxIndex = i;
            }
        }
    }


    if (maxIndex != -1) {
        System.out.println("The line with the maximum length:");
        System.out.println("Start Point: " + lines[maxIndex].getStart());
        System.out.println("End Point: " + lines[maxIndex].getEnd());
    } else {
        System.out.println("No lines found.");

    }

    boolean setFound = false;
        for (Line line : lines) {
            if (line != null) {
                if (line.getStartX() == 0 && line.getStartY() == 0 || line.getEndX() == 0 && line.getEndY() == 0) {
                    setFound = true;
                    break;
                }
            }
        }
    if( setFound){
        System.out.println("Found a line starts or ends at (0,0)");
    }
    else{
        System.out.println("No lines starts or ends at (0,0).");
    }

    IntArrayBag bag1 = new IntArrayBag(5);

    bag1.add(10);
    bag1.add(5);
    bag1.add(20);
    bag1.add(13);

    for()
    }
}
}
