package FUNCTION;

import java.util.*;

public class addition {
    
    public static void sum(int a,int b){
        System.out.print("SUM is "+(a+b));
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum(a,b);
        }
    }
}
