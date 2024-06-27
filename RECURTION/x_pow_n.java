package RECURTION;

public class x_pow_n {
    
    public static int printPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int x_ = printPower(x, n-1);
        int xPown = x*x_;
        return xPown;

    }
    public static void main(String[]args){
        
        int output = printPower(2,5);
        System.out.println(output);
    }
}
// This is with stock hright 'n'