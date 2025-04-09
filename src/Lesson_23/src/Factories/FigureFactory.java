package Lesson_23.src.Factories;

import Lesson_23.src.Figures.Circle;
import Lesson_23.src.Figures.Figure;
import Lesson_23.src.Figures.Rectangle;
import Lesson_23.src.Figures.Triangle;

import java.util.Arrays;

public class FigureFactory {

    public Figure create (double... sides) {

        return switch (sides.length) {
            case 1 -> new Circle(sides[0]);
            case 2 -> new Rectangle(sides[0], sides[1]);
            case 3 -> new Triangle(sides[0], sides[1], sides[2]);
            default ->
                    throw new IllegalArgumentException(
                            "Can`t create figure with this sides:" + Arrays.toString(sides));
        };

    }

}
