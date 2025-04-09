package Lesson_22.src;

public class Rectangle extends Figure {

    public Rectangle(double sideA, double sideB) {
        super(new double[] {sideA,sideB});
    }

    @Override
    protected String getType() {
        return "Прямокутник";
    }

    @Override
    public double getArea() {
        return sides[0]*sides[1];
    }

}
