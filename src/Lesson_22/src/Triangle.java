package Lesson_22.src;

public class Triangle extends Figure {

    public Triangle(double sideA, double sideB, double sideC) {
        super(new double[] {sideA,sideB,sideC });
    }

    @Override
    protected String getType() {
        return "Трикутник";
    }

    public double getArea(){
        double p = (sides[0]+sides[1]+sides[2])/2.0;
        return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
    }
}
