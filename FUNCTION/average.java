package FUNCTION;

import java.util.*;

public class average {
    
    public static void avg(double a,double b,double c){
        double n = (a+b+c)/3;
        
        System.out.print(n);
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            avg(a,b,c);
        }
    }
}
