package RECURTION;

public class tower_of_hanoi {
    
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Move "+n+"th disk from"+src+" to "+dest);
            return;
        }
        //for transforming n-1 disk from src to helper
        towerOfHanoi(n-1, src, dest, helper);
        //for transforming nth dialk from src to dest
        System.out.println("Move "+n+"th disk from"+src+" to "+helper);
        //for transforming n-1 disk from helper to src
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        towerOfHanoi(5, "A", "B", "C");
    }
}
