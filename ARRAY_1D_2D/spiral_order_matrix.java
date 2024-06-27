package ARRAY_1D_2D;

import java.util.Scanner;

public class spiral_order_matrix {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int [][]mat = new int[rows][cols];
            
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<rows;i++){                                                 //display given matrix
                for(int j=0;j<cols;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("The spiral order matrix is :");                    //display spiral order
            int rowStart=0,rowEnd=rows-1,colStart=0,colEnd=cols-1;
            while(rowStart<=rowEnd && colStart<=colEnd){
                for(int col=colStart;col<=colEnd;col++){                             //1
                    System.out.print(mat[rowStart][col]+" ");
                }
                rowStart++;
                for(int row=rowStart;row<=rowEnd;row++){                             //2
                    System.out.print(mat[row][colEnd]+" ");
                }
                colEnd--;
                for(int col=colEnd;col>=colStart;col--){                             //3
                    System.out.print(mat[rowEnd][col]+" ");
                }
                rowEnd--;
                for(int row=rowEnd;row>=rowStart;row--){                             //4
                    System.out.print(mat[row][colStart]+" ");
                }
                colStart++;
                
            }
        }
    }
}
