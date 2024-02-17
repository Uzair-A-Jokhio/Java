package Java_Task;

public class McmLength {
    private int meters;
    private int centimeters;
    private int millimeters;

    // Constructors
    public McmLength(int meters, int centimeters, int millimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
        this.millimeters = millimeters;
    }

    public McmLength(int totalMillimeters) {
        this.meters = totalMillimeters / 1000;
        this.centimeters = (totalMillimeters % 1000) / 10;
        this.millimeters = totalMillimeters % 10;
    }

    public McmLength(double totalCentimeters) {
        int totalMillimeters = (int) (totalCentimeters * 10);
        this.meters = totalMillimeters / 1000;
        this.centimeters = (totalMillimeters % 1000) / 10;
        this.millimeters = totalMillimeters % 10;
    }

    public McmLength() {
        // Default constructor creates an object with zero length
        this(0, 0, 0);
    }

    // Method to add two McmLength objects
    public McmLength add(McmLength other) {
        int totalMillimeters = this.toMillimeters() + other.toMillimeters();
        return new McmLength(totalMillimeters);
    }

    // Method to subtract one McmLength object from another
    public McmLength subtract(McmLength other) {
        int totalMillimeters = this.toMillimeters() - other.toMillimeters();
        return new McmLength(totalMillimeters);
    }

    // Method to multiply a McmLength object by an integer value
    public McmLength multiply(int factor) {
        int totalMillimeters = this.toMillimeters() * factor;
        return new McmLength(totalMillimeters);
    }

    // Method to divide a McmLength object by an integer value
    public McmLength divide(int divisor) {
        int totalMillimeters = this.toMillimeters() / divisor;
        return new McmLength(totalMillimeters);
    }

    // Method to calculate the area resulting from the product of two McmLength objects
    public McmLength calculateArea(McmLength other) {
        int areaMillimeters = this.toMillimeters() * other.toMillimeters();
        return new McmLength(areaMillimeters);
    }

    // Method to compare two McmLength objects
    public boolean equals(McmLength other) {
        return this.toMillimeters() == other.toMillimeters();
    }

    // Helper method to convert McmLength object to total millimeters
    private int toMillimeters() {
        return meters * 1000 + centimeters * 10 + millimeters;
    }

    public static void main(String[] args) {
        // Create two McmLength objects
        McmLength length1 = new McmLength(2, 30, 5);
        McmLength length2 = new McmLength(1, 800, 75);

        // Perform operations and display results
        System.out.println("Length 1: " + length1.toMillimeters() + " millimeters");
        System.out.println("Length 2: " + length2.toMillimeters() + " millimeters\n");

        McmLength sum = length1.add(length2);
        System.out.println("Sum of Length 1 and Length 2: " + sum.toMillimeters() + " millimeters");

        McmLength difference = length1.subtract(length2);
        System.out.println("Difference between Length 1 and Length 2: " + difference.toMillimeters() + " millimeters");

        McmLength product = length1.calculateArea(length2);
        System.out.println("Area resulting from the product of Length 1 and Length 2: " + product.toMillimeters() + " millimeters");

        McmLength multiplied = length1.multiply(3);
        System.out.println("Length 1 multiplied by 3: " + multiplied.toMillimeters() + " millimeters");

        McmLength divided = length2.divide(2);
        System.out.println("Length 2 divided by 2: " + divided.toMillimeters() + " millimeters");

        System.out.println("\nComparison of Length 1 and Length 2: " + length1.equals(length2));
    }
}
