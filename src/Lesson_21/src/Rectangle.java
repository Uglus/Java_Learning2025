package Lesson_21.src;

public class Rectangle extends Figure{

    public Rectangle(double sideA, double sideB) {
        super(new double[] {sideA,sideB},"Rectangle");
    }

    @Override
    public double getArea() {
        return sides[0]*sides[1];
    }

}
