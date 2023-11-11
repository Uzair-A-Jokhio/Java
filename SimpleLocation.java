public class SimpleLocation{
    private double latitude;
    private double longitude;

    public SimpleLocation (double lat , double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    // example of a getter
    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }
    // example of a setter
    public void setLatitude(double lat){
        if (lat < -90 || lat > 90 ){
            System.out.println("Illegal value of Latitude ");
        } else{
            this.latitude = lat;
        }
    }

    public void setLongitude(double lon){
        if (lon < -180 || lon > 180){
            System.out.println("Illegal value of Longitude");
        } else{
            this.longitude = lon;
        }
    }
}
