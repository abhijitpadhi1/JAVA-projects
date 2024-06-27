import java.util.*;

public class month_name {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int month = sc.nextInt();
            switch(month){
            case 1:
            System.out.println("Month name is JANUARY");
            break;
            case 2:
            System.out.println("Month name is FEBRUARY");
            break;
            case 3:
            System.out.println("Month name is MARCH");
            break;
            case 4:
            System.out.println("Month name is APRIL");
            break;
            case 5:
            System.out.println("Month name is MAY");
            break;
            case 6:
            System.out.println("Month name is JUNE");
            break;
            case 7:
            System.out.println("Month name is JULY");
            break;
            case 8:
            System.out.println("Month name is AUGUST");
            break;
            case 9:
            System.out.println("Month name is SEPTEMBER");
            break;
            case 10:
            System.out.println("Month name is OCTOBER");
            break;
            case 11:
            System.out.println("Month name is NOVEMBER");
            break;
            case 12:
            System.out.println("Month name is DECEMBER");
            break;
            default:
            System.out.println("INVALID NUMBER");
            }
        }    
    }
}
