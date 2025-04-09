package Lesson_20.src;

import Lesson_20.src.Validators.ValidatorOfRectangles;

public class Rectangle {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        if(!ValidatorOfRectangles.isRectangle(sideA,sideB))
            throwNotRectangleBySides(sideA,sideB);

        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(Point p1, Point p2, Point p3){
        this(p1.getDistanceTo(p2),p2.getDistanceTo(p3));
    }

    private void throwNotRectangleBySides(int sideA, int sideB) {
        throw new IllegalArgumentException("Cannot create rectangle with sides: "
                + sideA + ", " + sideB);
    }

    public void show() {
        System.out.println(
                "SideA: " + sideA + "\n" +
                        "SideB: " + sideB
        );
    }

}
