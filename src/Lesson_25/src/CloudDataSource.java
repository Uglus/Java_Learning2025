package Lesson_25.src;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CloudDataSource implements DataSource{

    @Nullable
    @Override
    public MyData getData() {
        System.out.println("Get Data from Cloud...");
        return new MyData(1,"desc1");
    }

}
