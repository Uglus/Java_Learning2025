package Lesson_23.src.Figures;

public class Circle extends Figure {

    public Circle(double radius) {
        super(new double[]{radius});

    }

    @Override
    protected String getType() {
        return "Коло";
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
