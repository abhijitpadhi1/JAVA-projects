package ARRAY_1D_2D;

import java.util.*;

public class ascending {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int num[] = new int[sc.nextInt()];
            for(int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
            boolean isAccending=true;
            for(int i=0;i<num.length-1;i++){
                if(num[i]>num[i+1]){
                    isAccending=false;
                }
            }
            if(isAccending){
                System.out.print("Arrey is in Accending order");
            }
            else{
                System.out.print("Arrey is not in Accending order");
            }
        }

    }
}
