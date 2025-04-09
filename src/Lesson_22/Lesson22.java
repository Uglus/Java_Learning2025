package Lesson_22;

import Lesson_22.src.Circle;
import Lesson_22.src.Figure;
import Lesson_22.src.Rectangle;
import Lesson_22.src.Triangle;

public class Lesson22 {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(5,5);
        figures[2] = new Triangle(3,4,5);

        for (Figure figure : figures) {
            System.out.println(figure);
        }

    }

}
