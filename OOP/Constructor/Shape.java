package OOP.Constructor;

public class Shape {
    void area(int side) {
        int a = side * side;
        System.out.println("Area of sqaure is : " + a);
    }

    void area(int len, int breadth) {
        int a = len * breadth;
        System.out.println("Area of rectangle: " + a);
    }

    void area(double radius) {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + a);
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(11);
        shape.area(14.2);
    }
}
