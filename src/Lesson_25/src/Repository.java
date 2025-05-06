package Lesson_25.src;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Repository implements DataSource{
    private final CachedDataSource cachedDataSource;
    private final CloudDataSource cloudDataSource;

    public Repository(CachedDataSource cachedDataSource, CloudDataSource cloudDataSource) {
        this.cachedDataSource = cachedDataSource;
        this.cloudDataSource = cloudDataSource;
    }

    @Override
    public @Nullable MyData getData() {
        MyData result = cachedDataSource.getData();
        if(result == null){
            System.out.println("--No data in cache");
            result = cloudDataSource.getData();
            assert result != null;
            cachedDataSource.saveData(result);
        }
        return result;
    }
}
