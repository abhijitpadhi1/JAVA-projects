import java.util.*;
public class input_show {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)){
            double r = sc.nextInt();
            double pi = 3.14f;
            double c = 2*pi*r;
            double a = pi*r*r;
            System.out.println("Surcumstance is "+c);
            System.out.println("Area is "+a);
        }
    }
}
