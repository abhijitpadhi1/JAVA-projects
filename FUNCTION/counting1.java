package FUNCTION;

import java.util.Scanner;

public class counting1 {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int x;
            int negative=0,positive=0,zeros=0;
            x = sc.nextInt();
            while(x==1){
                
                int n = sc.nextInt();
                if(n<0){
                negative++;
                }
                else if(n>0){
                positive++;
                }
                else{
                zeros++;
                }
                System.out.println("for count type 1");
                x = sc.nextInt();
            }
            System.out.println("Positives are"+positive);
            System.out.println("Positives are"+negative);
            System.out.println("Positives are"+zeros);

        }

        
    }
}
