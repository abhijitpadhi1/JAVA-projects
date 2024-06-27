import java.util.*;

public class even_till_n {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                while(i%2==0)
                System.out.print(i+" ");
                
            }
        }
    }
}
