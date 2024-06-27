package RECURTION;

public class x_pow_n1 {
    
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            int x_ = printPower(x, n/2) * printPower(x, n/2);
            return x_;
        }
        else{
            int x_ = printPower(x, n/2) * printPower(x, n/2) * x;
            return x_;
        }
    }
    public static void main(String args[]){
        int output = printPower(2, 5);
        System.out.println(output);
    }
}
// This is with stock height is 'log(n)'