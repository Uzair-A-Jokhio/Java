package Finals;

/*          QUS No 1
Develop a class ‘country’ to create countries of India , China and
Srilanka with attributes of area, population and economic_growth. The
attributes are to be provided by the user in user defined constructor. The class
should have the method to print those three attributes for each country.
 */


public class Country {
    private int population;
    private double area;
    private double economic_growth;
    private String name;

    public Country(String name,int pop, double area,double ec){
        this.name=name;
        this.population=pop;
        this.area=area;
        this.economic_growth=ec;
    }

    public void getDetails(){
        System.out.println("Name :" + name);
        System.out.println("Population :" + population);
        System.out.println("Area :" + area);
        System.out.println("Econimic Growth :" + economic_growth);
    }

    public static void main(String[] args) {
        Country india = new Country("India", 100000, 200000, 6.7);
        india.getDetails();
    }
}
