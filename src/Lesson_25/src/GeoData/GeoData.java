package Lesson_25.src.GeoData;

public class GeoData {

    private final int id;
    private final double longitude;
    private final double latitude;

    public GeoData(int id, double longitude, double latitude) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "GeoData{"+
                "id="+id+
                ", longitude="+longitude+
                ", latitude="+latitude+
                '}';
    }
}
