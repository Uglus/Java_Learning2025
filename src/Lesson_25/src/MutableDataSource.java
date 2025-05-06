package Lesson_25.src;

import org.jetbrains.annotations.NotNull;

public interface MutableDataSource extends DataSource {
    void saveData(@NotNull MyData data);
}
