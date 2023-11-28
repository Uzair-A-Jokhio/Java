public class Arrayloc {
    private double coords[];

    public Arrayloc(double[] coords){
        this.coords = coords;
    }

    public static void main(String[] args){
        double[] coords = {5.0,0.0};
        Arrayloc karachi = new Arrayloc(coords);
        coords[0] = 32.9;
        coords[1] = -117;
        System.out.println(karachi.coords[0]);
    }
}
