package SORTING;

import java.util.*;

public class merge {

    public static void conqure(int arr[], int si, int mid, int ei) {
        int sort[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while(idx1<=mid && idx2<=ei){
            if (arr[idx1] <= arr[idx2]) {
                sort[x++] = arr[idx1++];
            } else {
                sort[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            sort[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            sort[x++] = arr[idx2++];
        }
        for(int i=0,j=si;i<sort.length;i++,j++){
            arr[j]=sort[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[sc.nextInt()];
            // input of array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            // output of array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "");
            }
            System.out.println();
            // sorting of array
            divide(arr, 0, arr.length-1);
            // display of array
            System.out.println("The sorted array is");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"");
            }
        }
    }
}
