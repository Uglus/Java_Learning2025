package Lesson_20.src;

import Lesson_20.src.Validators.ValidatorOfTriangles;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if(!ValidatorOfTriangles.isTriangle(sideA,sideB,sideC))
            throwNotTriangleBySides(sideA,sideB,sideC);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private void throwNotTriangleBySides(int sideA, int sideB, int sideC) {
        throw new IllegalArgumentException(
                "wrong arguments to create triangle with sides " +
                        sideA + " " + sideB + " " + sideC);
    }

    public void show() {
        System.out.println(
                "SideA: " + sideA + "\n" +
                        "SideB: " + sideB
        );
    }



}
