package Lesson_25.src.GeoData;

import Lesson_25.src.Repository.DataSource;
import Lesson_25.src.Repository.MutableDataSource;
import Lesson_25.src.Repository.Repository;

public class GeoRepository extends Repository<GeoData> {
    public GeoRepository(DataSource<GeoData> cloudDataSource, MutableDataSource<GeoData> cachedDataSource) {
        super(cloudDataSource, cachedDataSource);
    }
}
