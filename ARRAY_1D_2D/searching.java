package ARRAY_1D_2D;

import java.util.Scanner;

public class searching {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int mat[][] = new int[rows][cols];
            for(int i=0;i<rows;i++){                                   //for inpur the matrix
                for(int j=0;j<cols;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<rows;i++){                                   //for print the matrix
                for(int j=0;j<cols;j++){
                        System.out.print(mat[i][j]+" ");
                    }
                    System.out.println();
                }
            System.out.println("Put a num from the matrix");         //for positiion of the no
            int x=sc.nextInt();
            for(int i=0;i<rows;i++){                          
                for(int j=0;j<cols;j++){
                        if(mat[i][j]==x){
                        System.out.print("Posion of x is ("+i+","+j+")");
                    }
                }
                
            }
        }
    }
}
