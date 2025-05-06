package Lesson_25;

import Base.Lecture;
import Lesson_25.src.GeoData.GeoData;
import Lesson_25.src.GeoData.GeoDataCloudDataSource;
import Lesson_25.src.GeoData.GeoRepository;
import Lesson_25.src.MyData.MyData;
import Lesson_25.src.MyData.MyDataCloudDataSource;
import Lesson_25.src.MyData.MyDataRepository;
import Lesson_25.src.Repository.CachedDataSource;
import Lesson_25.src.Repository.DataSource;

public class Lesson25 extends Lecture {

    public static void main(String[] args) {
        DataSource<MyData> myDataRepository = new MyDataRepository(
                new MyDataCloudDataSource(),
                new CachedDataSource<MyData>()
        );
        MyData myData = myDataRepository.getData();
        print(myData);

        DataSource<GeoData> geoRepository = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<GeoData>()
        );
        GeoData geoData = geoRepository.getData();
        print(geoData);
    }

}
