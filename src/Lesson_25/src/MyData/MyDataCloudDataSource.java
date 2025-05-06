package Lesson_25.src.MyData;

import Lesson_25.src.Repository.DataSource;
import org.jetbrains.annotations.Nullable;

public class MyDataCloudDataSource implements DataSource<MyData> {

    @Nullable
    @Override
    public MyData getData() {
        System.out.println("Get Data from Cloud...");
        return new MyData(1,"desc1");
    }

}
