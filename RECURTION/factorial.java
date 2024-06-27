package RECURTION;

public class factorial {
    
    public static void printFactorial(int n,int fact){
        if(n==0){
            System.out.println("Factoral is 1");
            return;
        }
        if(n==1){
            System.out.println("Factorial is "+fact);
            return;
        }
        fact*=n;
        printFactorial(n-1, fact);
    }
    public static void main(String args[]){
        printFactorial(5,1);
    }
}
