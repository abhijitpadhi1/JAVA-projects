package PATTERN;

import java.util.Scanner;

public class holow_rectangle {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(i==n||j==m||i==1||j==1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
