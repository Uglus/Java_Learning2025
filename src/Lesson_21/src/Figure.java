package Lesson_21.src;

import java.util.Arrays;

public abstract class Figure {

    final String type;

    protected final double[] sides;

    protected Figure(double[] sides, String type) {
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

    public abstract double getArea();

    public void show() {
        System.out.println("-------------------------------\n" +
                        "Type: " + type + "\n" +
                        "Sides: " + Arrays.toString(sides) + "\n"+
                        "Perimeter: " + getPerimeter() + "\n" +
                        "Area: " + getArea() +"\n-------------------------------\n"
                );
    }
}
