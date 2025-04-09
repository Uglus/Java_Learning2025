package Lesson_24.src.Figures;

public class Rectangle extends Figure {

    public Rectangle(double sideA, double sideB) {
        super(new double[] {sideA,sideB}, FigureType.RECTANGLE);
    }

    @Override
    public double getArea() {
        return sides[0]*sides[1];
    }

}
