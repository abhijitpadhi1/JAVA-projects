package FUNCTION;

import java.util.*;
public class power {
    
    public static void powerx(int x,int n){
        int y=1;
        for(int i=1;i<=n;i++){
            y = y*x;
        }
        System.out.print("x to power n is "+y);
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int n = sc.nextInt();
            powerx(x,n);
        }
    }
}
