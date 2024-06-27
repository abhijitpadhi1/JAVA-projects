package FUNCTION;
import java.util.*;
public class Fibonacci_series {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int a=0,b=1;
            System.out.print(a+" ");
            for(int i=2;i<=n;i++){
                System.out.print(b+" ");
                int temp=b;                                   //This prosses is called swapping.
                b=a+b;
                a=temp;
            }
        }
    }
}
