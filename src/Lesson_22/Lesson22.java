package Lesson_22;

import Lesson_22.hw.Animal;
import Lesson_22.hw.Dog;
import Lesson_22.hw.Duck;
import Lesson_22.hw.Fish;
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
        System.out.println("\n------\n");
        homework();
    }

    public static void homework() {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Dog1");
        animals[1] = new Duck("Duck1");
        animals[2] = new Fish("Fish1");

        for(Animal animal : animals) {
            System.out.println(animal);
        }
    }

}
