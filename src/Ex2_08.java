class MyCircle {

    private MyPoint center;
    private int radius;

    // Constructor
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters and Setters
    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{this.center.getX(), this.center.getY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    // Other methods
    @Override
    public String toString() {
        return "MyCircle [radius=" + this.radius + ", center=" + this.center + "]";
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}

public class Ex2_08 {
    public static void main(String[] args) {
        // Create a circle using the default constructor
        MyCircle defaultCircle = new MyCircle();
        System.out.println("Default Circle: " + defaultCircle);

        // Create a circle using the constructor with coordinates and radius
        MyCircle circle1 = new MyCircle(3, 4, 5);
        System.out.println("Circle 1: " + circle1);

        // Create a circle using a MyPoint and radius
        MyPoint centerPoint = new MyPoint(1, 2);
        MyCircle circle2 = new MyCircle(centerPoint, 10);
        System.out.println("Circle 2: " + circle2);

        // Get and display the area and circumference of circle1
        double area1 = circle1.getArea();
        double circumference1 = circle1.getCircumference();
        System.out.println("Area of Circle 1: " + area1);
        System.out.println("Circumference of Circle 1: " + circumference1);

        // Get and display the area and circumference of circle2
        double area2 = circle2.getArea();
        double circumference2 = circle2.getCircumference();
        System.out.println("Area of Circle 2: " + area2);
        System.out.println("Circumference of Circle 2: " + circumference2);

        // Calculate and display the distance between circle1 and circle2
        double distance = circle1.distance(circle2);
        System.out.println("Distance between Circle 1 and Circle 2: " + distance);

        // Modify the radius of circle1
        circle1.setRadius(7);
        System.out.println("Updated Circle 1: " + circle1);
        System.out.println("Updated Area of Circle 1: " + circle1.getArea());
        System.out.println("Updated Circumference of Circle 1: " + circle1.getCircumference());

        // Change the center of circle2
        circle2.setCenter(new MyPoint(5, 5));
        System.out.println("Updated Circle 2: " + circle2);
        System.out.println("Distance to updated Circle 2: " + circle1.distance(circle2));
    }
}
