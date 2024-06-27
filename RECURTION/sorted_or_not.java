package RECURTION;

public class sorted_or_not {
    
    public static boolean checkSorting(int arr[],int idx){
        if(arr.length-1==idx){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return checkSorting(arr, idx+1);
    }
    public static void main(String args[]){
        int arr[] = {4,9,6,7};
        System.out.println(checkSorting(arr, 0));
    }
}
