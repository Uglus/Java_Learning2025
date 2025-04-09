package Lesson_22.hw;

public abstract class Animal {
    private final String tag;
    private final TypeOfMovement movement;

    protected Animal(String tag, TypeOfMovement movement) {
        this.tag = tag;
        this.movement = movement;
    }


    public enum TypeOfMovement{
        SWIM,FLY,WALK
    }

    public String getTypeOfAnimal() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "-----------------\n" +
                "This is: " + getTypeOfAnimal() + "\n" +
                "Tag: " + tag + "\n" +
                "Movement type: " + movement;

    }
}
