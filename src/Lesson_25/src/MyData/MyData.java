package Lesson_25.src.MyData;

public class MyData {
    private final int id;
    private final String description;

    public MyData(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyData {"+
                "id="+id+
                ", description='"+description+"'}";
    }
}
