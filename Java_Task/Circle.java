package Java_Task;

class Circle{

    private  double radius;

    public Circle(double radius){ // constructor 
        this.radius= radius; 
    }

    public double calculatecircumference(){ 
        return 2 * 3.14159 * radius;
    }
    public static void main(String[] args){
        Circle c = new Circle(5); //
        System.out.println("Cicle : " + c.calculatecircumference());
    }
}
