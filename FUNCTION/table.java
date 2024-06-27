package FUNCTION;

import java.util.*;

public class table {
    
    public static void tables(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            tables(n);
        }
    } 
}
