package FUNCTION;

import java.util.*;

public class greater_in_two {
    
    public static void greater(int a,int b){
        if(a>b)
        System.out.print(a+" is greater");
        else if(b>a)
        System.out.print(b+" is greater");
        else
        System.out.print("both are eqal");
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            greater(a,b);
        }
    }
}
