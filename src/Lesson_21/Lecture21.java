package Lesson_21;

import Lesson_21.src.Circle;
import Lesson_21.src.Figure;
import Lesson_21.src.Rectangle;
import Lesson_21.src.Triangle;

public class Lecture21 {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(5,5);
        figures[2] = new Triangle(3,4,5);

        for (Figure figure : figures) {
            figure.show();
        }

    }
}
