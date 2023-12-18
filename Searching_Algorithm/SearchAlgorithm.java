package Searching_Algorithm;

public class SearchAlgorithm {
    
    
    private int LineSearch(int[] x, int tofind ){
        for (int i = 0; i < x.length; i++){
            if (x[i] == tofind) {
                return i;
            }
        }
        return -1;
    }


    private int BinarySearch(int[] numbers, int y){
        int low = 0;
        int high = numbers.length ;
        int mid;

        while (low <= high){
            mid = low + (high - low)/2;
            if (numbers[mid] == y)
                return mid + 1 ;

            if (numbers[mid] < y)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;


    }


    public static void main(String[] args){
        int[] numbers = {2,3,4,5,9,0,33,5,7,8};
        int y = 8;
        SearchAlgorithm n = new SearchAlgorithm();
        // System.out.println(n.LineSearch(numbers, y));
        System.out.println(n.BinarySearch(numbers, y));

    }
    
}
