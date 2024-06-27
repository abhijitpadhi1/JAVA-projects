package ARRAY_1D_2D;

import java.util.*;

public class array_of_names {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String []name = new String[sc.nextInt()];
            for(int i=0;i<name.length;i++){
                name[i]=sc.next();
            }
            for(int i=0;i<name.length;i++){
                System.out.print(name[i]+" ");
            }
        }
    }
}
