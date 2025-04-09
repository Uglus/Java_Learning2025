package Lesson_23;


import Base.Lecture;
import Lesson_23.hw.Employee.Employee;
import Lesson_23.hw.EmployeeFactory;
import Lesson_23.src.Factories.FigureFactory;
import Lesson_23.src.Figures.Circle;
import Lesson_23.src.Figures.Figure;
import Lesson_23.src.Figures.Rectangle;
import Lesson_23.src.Figures.Triangle;

public class Lesson23 extends Lecture {

    public static void main(String[] args) {
        FigureFactory figureFactory = new FigureFactory();
        print(
                figureFactory.create(3),
                figureFactory.create(3, 3),
                figureFactory.create(3, 4, 5)
        );

        EmployeeFactory employeeFactory = new EmployeeFactory();
        print(
                employeeFactory.create("Name1",6,5500),
                employeeFactory.create("Name2",4,4000),
                employeeFactory.create("Name3",2,2500),
                employeeFactory.create("Name4",1,1000)
        );

    }

    private static void print(Figure... figures){
        for(Figure figure : figures){
           print(figure);
        }
    }

    private static void print(Employee... employees){
        for(Employee employee:employees){
            print(employee);
        }
    }





}
