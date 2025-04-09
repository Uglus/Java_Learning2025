package Lesson_23.src.Figures;

import java.util.Arrays;

public abstract class Figure {

    final String type ;

    protected final double[] sides;

    protected Figure(double[] sides) {
        this.sides = sides;
        this.type = getClass().getSimpleName();
    }

    public double getPerimeter(){
        double perimeter = 0;
        for(double side:sides){
            perimeter+= side;
        }
        return perimeter;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "-------------------------------\n" +
                "Type: " + type + "\n" +
                "Sides: " + Arrays.toString(sides) + "\n"+
                "Perimeter: " + getPerimeter() + "\n" +
                "Area: " + getArea() +"\n-------------------------------";
    }
}
