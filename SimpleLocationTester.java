public class SimpleLocationTester {

    public static void main(String[] args){
        SimpleLocation Karachi = new SimpleLocation(24.86070, 67.00110);
        SimpleLocation Islamabad = new SimpleLocation(33.68440, 73.04790);
        SimpleLocation duet = new SimpleLocation(24.8788, 67.0475);
        // duet.latitude = 54;
        // duet.setLatitude(30);
        System.out.println(duet.getLatitude());
        System.out.println(duet.distance(Islamabad));
    }
}