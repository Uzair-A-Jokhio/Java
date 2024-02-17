package Finals;

/*
Develop a class ‘country’ to create countries of India , China and
Srilanka with attributes of area, population and economic_growth. The
attributes are to be provided by the user in user defined constructor. The class
should have the method to print those three attributes for each country.
 */


public class Country {
    String name;
    int area, population;
    double economic_growth;

    public Country(String name,int area, int pop, double eco){
        this.name = name;
        this.area = area;
        this.population = pop;
        this.economic_growth = eco;
    }
    
    public void Display_detail(){
        System.out.println("Country: " + name);
        System.out.println("Area: " + area+ " sq km ");
        System.out.println("Population: " + population);
        System.out.println("Economic-Growth " + economic_growth+ " % ");
        System.out.println();
    }

    public static void main(String[] args) {
        Country india = new Country("India", 3287263, 1417173173, 3.5);
        india.Display_detail();
    }
}
