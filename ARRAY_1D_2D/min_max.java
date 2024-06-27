package ARRAY_1D_2D;

import java.util.*;

public class min_max {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int num[] = new int[sc.nextInt()];
            for(int i=0;i<num.length;i++){
                num[i] = sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<num.length;i++){
                if(num[i]<min){
                    min=num[i];
                }
                if(num[i]>max){
                    max=num[i];
                }
            }
            System.out.println("Largest is "+max);
            System.out.println("Smallest is "+min);

        }
    }
}
