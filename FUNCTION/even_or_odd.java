package FUNCTION;

import java.util.*;

public class even_or_odd {
    
    public static void evenodd(int n){
        if(n>0){
            if(n%2==0)
            System.out.print("This is EVEN");
        
            else
            System.out.print("This is ODD");
        }
        else{ 
            if(n==0||n<0)
            System.out.print("This is neither EVEN nor ODD");
        }

    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            evenodd(n);
        }
    }
}
