package SORTING;

import java.util.*;

public class insertion {
    public static void main(String[]args){
        try(Scanner sc= new Scanner(System.in)){
            int arr[] = new int[sc.nextInt()];
            //input of array
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            //display of array
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            //sorting of array
            for(int i=1;i<arr.length;i++){
                int current = arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>current){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = current;
            }
            //Display of sorted array
            System.out.println("Sorted array is ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
        }
    }
}
