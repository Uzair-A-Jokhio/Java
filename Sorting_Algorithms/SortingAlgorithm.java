package Sorting_Algorithms;

import Searching_Algorithm.SearchAlgorithm;

public class SortingAlgorithm {
    
    
    public void Bubble_sort(int arr[]){

    }
    

    public void Selection_sort(int arr[]){

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

    public void printArray(int arr[]){

        for (int i = 0; i < arr.length ; i++)
            System.out.println(arr[i] + " ");
    }



    public static void main(String[] args){
        int[] num = {3, 4, 67, 3, 32, 35, 76, 67, 22, 45};
        SortingAlgorithm ss = new SortingAlgorithm();
        ss.Selection_sort(num);
        System.out.println("Sorted list");
        ss.printArray(num);
    }
}
