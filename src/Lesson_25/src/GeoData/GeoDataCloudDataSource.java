package Lesson_25.src.GeoData;

import Lesson_25.src.Repository.DataSource;
import org.jetbrains.annotations.Nullable;

public class GeoDataCloudDataSource implements DataSource<GeoData> {
    @Override
    public @Nullable GeoData getData() {
        return new GeoData(1,1488,1337);
    }
}
