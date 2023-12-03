package Java_Task;

public class MyMath {

    public int add(int x, int y){
        return x+y;
    }

    public int add(int x, int y , int z){
        return x+y+z;
    }

    public int add(int x, int y , int z, int a){
        return x+y+z+a;
    }

    public static void main(String[] args) {
        MyMath sultan = new MyMath();
        System.out.println(sultan.add(2,3));
        System.out.println(sultan.add(2,3, 4));
        System.out.println(sultan.add(2,3, 4,5));
    }

    
}
