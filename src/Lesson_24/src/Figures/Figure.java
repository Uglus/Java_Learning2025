package Lesson_24.src.Figures;

import Lesson_23.src.Factories.FigureFactory;

import java.util.Arrays;

public abstract class Figure {

    private final FigureType type ;

    protected final double[] sides;

    protected Figure(double[] sides, FigureType type) {
        this.sides = sides;
        this.type = type;
    }

    public double getPerimeter(){
        double perimeter = 0;
        for(double side:sides){
            perimeter+= side;
        }
        return perimeter;
    }

    public FigureType getType() {
        return type;
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
