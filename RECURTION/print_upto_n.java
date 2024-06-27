package RECURTION;

import java.util.*;

public class print_upto_n {

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    } 
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            print(sc.nextInt());
        }
    }
}
