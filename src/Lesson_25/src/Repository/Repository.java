package Lesson_25.src.Repository;

import org.jetbrains.annotations.Nullable;

public class Repository<T> implements DataSource<T>{
    private final DataSource<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSource<T> cloudDataSource, MutableDataSource<T> cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Override
    public @Nullable T getData() {
        T result = cachedDataSource.getData();
        if(result == null){
            System.out.println("--No data in cache");
            result = cloudDataSource.getData();
            assert result != null;
            cachedDataSource.saveData(result);
        }
        return result;
    }
}
