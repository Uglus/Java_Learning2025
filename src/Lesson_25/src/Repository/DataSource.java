package Lesson_25.src.Repository;

import org.jetbrains.annotations.Nullable;

public interface DataSource<T> {
    @Nullable
    T getData();
}
