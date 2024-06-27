package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    
    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String row = "";
            for(int j=0; j<board.length; j++){
                
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += ".";
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    
    public static boolean isSafe(int col, int row, char[][] board){
        //horizontal
        for(int i=0; i<board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int j=0; j<board.length; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }

        //upper left
        for(int r=row,c=col; r>=0 && c>=0; r--,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //upper right
        for(int r=row,c=col; r>=0 && c<board.length; r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        for(int r=row,c=col; r<board.length && c>=0; r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        for(int r=row,c=col; r<board.length && c<board.length; r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
        
    }
    
    public static void helper(char[][] board, int col, List<List<String>> allBoards){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(col, row, board) ){
                board[row][col] = 'Q';
                helper(board, col+1, allBoards);
                board[row][col] = '.';
            }
        }
    }
    public static void main(String args[]){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[4][4];
        
        helper(board, 0, allBoards);
        System.out.println(allBoards);
    }
}
