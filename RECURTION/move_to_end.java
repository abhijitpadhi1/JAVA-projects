package RECURTION;

public class move_to_end {
    
    public static void addX(int count){
        for(int i=1;i<=count;i++){
            System.out.print("x");
        }
    }
    
    public static void moveX(StringBuilder str,int idx,int count){
        if(str.length()-1==idx){
            System.out.print(str);
            addX(count);
            return;
        }
        if(str.charAt(idx)=='x'){
            str.deleteCharAt(idx);
            moveX(str, idx, count+1);
        }
        else{
            moveX(str, idx+1, count);
        }
    }
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("dhjxxkjiixhxkjdai");
        moveX(str, 0, 0);
    }
}
