package Lesson_21.src;

public class Circle extends Figure{

    public Circle(double radius) {
        super(new double[]{radius},"Circle");

    }

    @Override
    public double getPerimeter() {
        return 2*3.14*sides[0];
    }

    @Override
    public double getArea() {
        return 3.14*sides[0]*sides[0];
    }

}
