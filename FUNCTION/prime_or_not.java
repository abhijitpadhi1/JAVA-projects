package FUNCTION;

import java.util.*;

public class prime_or_not {
    
    public static void prime(int n){
        boolean isprime = true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
            isprime = false;
            break;
            }
        }
        if(isprime){
            if(n==1)
            System.out.print("This is neither prime nor composite");
            else
            System.out.print("This is prime");
        }
        else{
            System.out.print("This is not prime");
        }

    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            prime(n);
        }
    }
}
