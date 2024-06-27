package RECURTION;

public class sum_of_n {
    
    public static int sum=0;
    public static void sum(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        sum(n-1);

    }
    public static void main(String args[]){
        sum(5);
    }
}
