package ARRAY_1D_2D;

import java.util.*;
public class transpose_mat {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int mat[][] = new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("The given matrix is : ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("The required transpose matrix is : ");
            for(int i=0;i<cols;i++){
                for(int j=0;j<rows;j++){
                    System.out.print(mat[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}
