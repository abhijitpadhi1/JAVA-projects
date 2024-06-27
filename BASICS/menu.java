import java.util.*;


public class menu {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int i;
            do{
                int mark = sc.nextInt();   //Enter mark of student
                if(mark>=90)
                System.out.print("This is Good");
                else if(mark>=60)
                System.out.print("This is also Good");
                else if(mark>=0)
                System.out.print("This is Good as well");
                else 
                System.out.print("INVALLID MARK");
                System.out.print("Do you want again?\n(yes-1 or no-0)");
                 i = sc.nextInt();          //on off
            }while(i==1);
        }
    }
}
