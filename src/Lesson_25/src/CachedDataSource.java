package Lesson_25.src;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CachedDataSource implements MutableDataSource{

    private MyData myData;

    @Nullable
    @Override
    public MyData getData() {
        System.out.println("Get data from cache");
        return myData;
    }

    @Override
    public void saveData(@NotNull MyData data) {
        System.out.println("Save data to cache");
        myData = data;
    }
}
