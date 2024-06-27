package PATTERN;

import java.util.Scanner;

public class py {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int x=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(x+" ");
                    x=x+1;
                }
                System.out.println();
            }
        }
    }
}
