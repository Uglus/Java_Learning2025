package Lesson_25.src.Repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CachedDataSource<T> implements MutableDataSource<T>{

    private T myData;

    @Nullable
    @Override
    public T getData() {
        System.out.println("Get data from cache");
        return myData;
    }

    @Override
    public void saveData(@NotNull T data) {
        System.out.println("Save data to cache");
        myData = data;
    }
}
