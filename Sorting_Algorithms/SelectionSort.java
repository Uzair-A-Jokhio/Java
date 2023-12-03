package Sorting_Algorithms;

public class SelectionSort {
    
    
    public void sort(int arr[]){

        int n = arr.length;

        // one by one move boundary of unsorted subarray
        for (int i =0; i < n-1;i++)
        {
            // find the minimum element in unsorted list
            int min = i;
            for (int j = i+1; j< n ;j++)
                if (arr[j] < arr[min])
                    min = j;
            

            // swap the found minimum element with the first element 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;   
        }
    }

    void printArray(){
        
    }
    
}
