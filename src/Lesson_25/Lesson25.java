package Lesson_25;

import Base.Lecture;
import Lesson_25.src.*;
import org.jetbrains.annotations.NotNull;

public class Lesson25 extends Lecture {

    public static void main(String[] args) {
        DataSource repository = new Repository(
                new CachedDataSource(),
                new CloudDataSource()
        );

        MyData data = repository.getData();
        print(data);
        data = repository.getData();
        print(data);
    }

    @NotNull
    private static MyData getMyData(){
        return new MyData(1,"desc1");
    }

}
