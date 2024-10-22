class MyLine extends MyPoint{
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y){
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{begin.getX(),begin.getY()};
    }

    public int[] getEndXY() {
        return new int[]{end.getX(),end.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient(){
        double deltaY = end.getY() - begin.getY();
        double deltaX = end.getX() - begin.getX();
        return Math.atan2(deltaY, deltaX);
    }

    public String toString(){
        return "MyLine[begin=("+getBeginX()+","+getBeginY()+"),end=("+getEndX()+","+getEndY()+")]";
    }
}
public class Ex2_07 {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(6, 8);

        // Display the points
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Calculate and display the distance between point1 and point2
        double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);

        // Create a MyLine instance using the two points
        MyLine line = new MyLine(point1, point2);

        // Display the line details
        System.out.println("Line: " + line);

        // Get and display length of the line
        double length = line.getLength();
        System.out.println("Length of the line: " + length);

        // Get and display the gradient of the line
        double gradient = line.getGradient();
        System.out.println("Gradient of the line: " + gradient);

        // Modify the line's beginning and end points
        line.setBegin(new MyPoint(1, 2));
        line.setEnd(new MyPoint(4, 6));

        // Display updated line details
        System.out.println("Updated Line: " + line);

        // Calculate new length and gradient
        double newLength = line.getLength();
        double newGradient = line.getGradient();

        System.out.println("New Length of the line: " + newLength);
        System.out.println("New Gradient of the line: " + newGradient);
    }
}
