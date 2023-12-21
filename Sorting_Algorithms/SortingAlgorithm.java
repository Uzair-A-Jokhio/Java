package Sorting_Algorithms;


public class SortingAlgorithm {

    public void Insertion_sort(int[] arr){
        if (arr == null || arr.length <= 1) {
            // Nothing to sort or handle accordingly
            return;
        }
        // algorithm starts here
        int currInd, temp;
         
        for (int i = 0; i < arr.length; i++){
            currInd = i;
            while (currInd > 0 && arr[currInd] < arr[currInd - 1]){
                // swap 
                temp = arr[currInd];
                arr[currInd] = arr[currInd-1];
                arr[currInd-1] = temp;
                currInd = currInd -1;
            }
        }

    }
    
    
    public void Bubble_sort(int[] arr){
        if (arr == null || arr.length <= 1) {
            // Nothing to sort or handle accordingly
            return;
        }
        // algorithm starts here

        int temp;
        boolean swap;
        int n = arr.length;

        for (int i=0; i < n - 1 ;i++){
            swap = false;
            for (int j=0; j < n - i -1; j++){

                if (arr[j] > arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;

                }
            }
            if (swap == false)
                break;
        }

    }
    

    public void Selection_sort(int[] arr){
        if (arr == null || arr.length <= 1) {
            // Nothing to sort or handle accordingly
            return;
        }
        // algorithm starts here

        for (int i=0; i < arr.length - 1; i++){

            int min_num = i;
            // Find the minimum element in unsorted array
            for (int j = i+1; j < arr.length;j++){
                if (arr[min_num] > arr[j])
                    min_num = j;
            }
            // swap the found minimum with the first element 
            int temp = arr[min_num];
            arr[min_num] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArray(int[] arr){

        for (int i = 0; i < arr.length ; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }



    public static void main(String[] args){
        int[] num = {3, 4, 67, 3, 32, 35, 76, 67, 22, 45};
        SortingAlgorithm ss = new SortingAlgorithm();
        // ss.Selection_sort(num);
        ss.Insertion_sort(num);
        System.out.println("Sorted list");
        ss.printArray(num);
    }
}
