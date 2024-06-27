package FUNCTION;

import java.util.*;

public class product {
    
    public static int products(int a,int b){
        return a*b;

    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            products(a,b);
        }
    }
}
