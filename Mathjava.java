public class Mathjava {


    void Powtable(){
        int a = 1 ;
        System.out.println("a\t"+ "a^2\t" +  "a^3\t");
        for (int i= 1; i <= 4;i++){
            System.out.println(a + "\t" +Mathjava.pow(a, 2)+ "\t" + Mathjava.pow(a,3));
            a += 1;
        }
    }
    


    void sum(){
        double a = 9.5, b=4.5, c= 2.5, d = 3, e =45.5, f =3.5;
        double x = (a*b) - (c*d);
        double y = e - f;
        double z = x/y;
        System.out.println("the answer is: " + z);  
    }

    void series(){
        int a = 1;
        int temp = 0;
        int num = 0;
        for (int i =0 ;i<=9;i++){
            temp += a;
            num = temp + a ;
            System.out.println(num);
        }
        
    }



    public static double pow(double d, int i) {
        return 0;
    }
}
