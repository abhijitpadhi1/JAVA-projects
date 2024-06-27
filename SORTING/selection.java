package SORTING;

import java.util.Scanner;

public class selection {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = new int[sc.nextInt()];
            //input of array
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            //display of array
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            //sorting of array            
            for(int i=0;i<arr.length-1;i++){
                int smallest = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[smallest] > arr[j]){
                        smallest = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
            //display of sorted array
            System.out.println("The sorted array is ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
