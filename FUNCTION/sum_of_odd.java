package FUNCTION;

import java.util.Scanner;

public class sum_of_odd {
    
    public static void sumodd(int n){
        int x=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0)
                x=x+i;
            
        }System.out.print(x);
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            sumodd(n);
        }
    }
}
