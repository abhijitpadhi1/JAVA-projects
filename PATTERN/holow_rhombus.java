package PATTERN;

import java.util.Scanner;

public class holow_rhombus {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    if(i==n||j==n||i==1||j==1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
