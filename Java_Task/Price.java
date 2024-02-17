package Java_Task;
/*Make a program in which you calculate the price of goods present in the shop.
 Take input price and quantity and give result for three sizes big, medium & small. Define a class ‘price’,
  to represent outer class, make static inner class named ‘small’,
 make another inner classes named ‘big’ & ‘medium’. */
public class Price{
    private double price;
    private int quantity;

    public Price(double price, int qu){
        this.price = price;
        this.quantity = qu;
    }

    static class small {
        static void calculatePrice(double price,int quantity) {
            double totalprice = price * quantity;
            System.out.println("Small Size Total Price: " + totalprice);
        }
    }

    static class medium {
        static void calculatePrice(double price, int quantity) {
            double totalprice = price * quantity * 1.2;
            System.out.println("Medium Size Total Price: " + totalprice);
        }
    }

    static class large {
        static void calculatePrice(double price, int quantity) {
            double totalprice = price * quantity * 2.5;
            System.out.println("Large Size Total Price: " + totalprice);
        }
    }


    public static void main(String[] args) {
        Price count = new Price(3,4);

        Price.small.calculatePrice(2, 4);
        Price.medium.calculatePrice(2, 4);
        Price.large.calculatePrice(2, 4);
    }

}
