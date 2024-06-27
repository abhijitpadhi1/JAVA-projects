package SORTING;

import java.util.*;
public class bubble {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            
            int arr[] = new int[sc.nextInt()];
            //input of array
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            //display of array
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            //sorting of array
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }

            //display of sorted array
            System.out.println("The arrenged form is ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
