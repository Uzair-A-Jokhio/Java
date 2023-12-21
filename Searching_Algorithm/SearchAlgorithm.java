package Searching_Algorithm;

public class SearchAlgorithm {
    
    // LINEAR SEARCH FOR INT ARRAY
    private int LineSearch(int[] number, int tofind ){
        for (int i = 0; i < number.length; i++){
            if (number[i] == tofind) {
                return i + 1; // i + 1 added to rerturn the actual Array place 
            }
        }
        return -1;
    }
    // LINEAR SEARCH FOR STRING ARRAY
    private String LineSearch(String[] names, String tofind ){
        for (int i = 0; i < names.length; i++){
            if (names[i] == tofind);
                return "Founded word " + names[i] +  " at " + i + " index ";
        }
        return "Word Not in Array";
    }

    // BINARY SEARCH FOR INT ARRAY
    private int BinarySearch(int[] numbers, int y){
        int low = 0;
        int high = numbers.length ;
        int mid;

        while (low <= high){
            mid = low + (high - low)/2;
            if (numbers[mid] == y)
                return mid + 1 ; // mid + 1 because to get the actual array number ac

            if (numbers[mid] < y)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;


    }


    public static void main(String[] args){
        int[] numbers = {2,3,4,5,9,0,33,5,7,8};
        String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int y = 8;
        String day = "tuesday";
        SearchAlgorithm n = new SearchAlgorithm();
        System.out.println(n.LineSearch(numbers, y));
        System.out.println(n.LineSearch(days, day));
        System.out.println(n.BinarySearch(numbers, y));
    }
    
}
