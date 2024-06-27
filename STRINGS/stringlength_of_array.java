package STRINGS;

import java.util.*;
public class stringlength_of_array {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String array[] = new String[sc.nextInt()];
            for(int i=0;i<array.length;i++){
                array[i] = sc.next();
            }

            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }

            int totlen=0;
            for(int i=0;i<array.length;i++){
                totlen = totlen+array[i].length();
            }
            System.out.print("The total length is "+totlen);
        }
    }
}
