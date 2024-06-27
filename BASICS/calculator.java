import java.util.*;
public class calculator {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int button = sc.nextInt();
            switch(button){
                case 1:
                System.out.println("Sum is "+(a+b));
                break;
                case 2:
                System.out.println("Diff is "+(a-b));
                break;
                case 3:
                System.out.println("Product is "+(a*b));
                break;
                case 4:
                System.out.println("Division is "+(a/b));
                break;
                default:
                System.out.println("Invalid number");
            }
        }

    }
}
