package location;

public class SimpleLocationTester {

    public static void main(String[] args){
            SimpleLocation loc1 = new SimpleLocation(39.9, 116.4);
            SimpleLocation loc2 = new SimpleLocation(55.8, 37.4);
            loc1 = loc2;
            loc1.setLatitude(-8.3);

            System.out.println(loc2.getLatitude() + ", " + loc2.getLongitude());
        }
}