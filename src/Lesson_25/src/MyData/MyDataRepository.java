package Lesson_25.src.MyData;

import Lesson_25.src.Repository.DataSource;
import Lesson_25.src.Repository.MutableDataSource;
import Lesson_25.src.Repository.Repository;

public class MyDataRepository extends Repository<MyData> {
    public MyDataRepository(DataSource<MyData> cloudDataSource, MutableDataSource<MyData> cachedDataSource) {
        super(cloudDataSource, cachedDataSource);
    }
}
