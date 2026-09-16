package MethodOverriding;
class Shape{
    void area(){
        System.out.println("Area of Shapes: ");
    }
}
class Circle extends Shape{
    void area(){
        double radius = 4.6;
        double a = 3.14*radius*radius;
        System.out.println("Circle area = "+a);
    }
}
class Rectangle extends Shape{
    void area(){
        double len = 4.6;
        double bre = 2.7;
        double a = len*bre;
        System.out.println("Circle area = "+a);
    }
}
class Square extends Shape{
    void area(){
        int side = 3;
        int  a = side*side;
        System.out.println("Circle area = "+a);
    }
}
public class first {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1 = new Circle();
        s1.area();
        s1 = new Rectangle();
        s1.area();

    }
}
