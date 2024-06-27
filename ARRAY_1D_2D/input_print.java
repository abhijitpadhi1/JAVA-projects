package ARRAY_1D_2D;

import java.util.*;

public class input_print {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int [] ar = new int[sc.nextInt()];             //for taking input
            for(int i=0;i<ar.length;i++){
                ar[i]=sc.nextInt();
            }
            for(int i=0;i<ar.length;i++){                  //for print the array
                System.out.print(ar[i]+" ");
            }
        } 
    }
}
