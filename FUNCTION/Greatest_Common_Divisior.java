package FUNCTION;
import java.util.*;
public class Greatest_Common_Divisior {
     
     public static void GCD(int a,int b){
          while(a!=b){
               if(a>b){
                    a=a-b;
               }else{
                    b=b-a;
               }
          }
          System.out.print("GCD is "+b);
     }
     public static void main(String[]args){
          try(Scanner sc = new Scanner(System.in)){
               int a = sc.nextInt();
               int b = sc.nextInt();
               GCD(a,b);
          }
     }
}
