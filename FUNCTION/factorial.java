package FUNCTION;

import java.util.*;

public class factorial {
    
    public static void fact(int n){
        if(n>0){
        int x=1;
            for(int i=1;i<=n;i++){
            x=x*i;
        }
        System.out.print("Factorial is "+x);
        return;
        } 
        else if(n==0)
        System.out.print("Factorial is 1");
        else
        System.out.print("Factorial is undefind");
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            fact(n);
        }
    }
}
