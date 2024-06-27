package SORTING;

import java.util.Scanner;

public class quick{
   
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    
    
    
    public static void quickSort(int arr[],int low,int high){
        if(low < high){
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = new int[sc.nextInt()];
            //input of array
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            //display of array
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+""); 
            }
            System.out.println();
            //sorting of array
            quickSort(arr, 0, arr.length-1);

            //display of sorted array
            System.out.println("The sorted array is");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"");
            }
        }
    }
}
