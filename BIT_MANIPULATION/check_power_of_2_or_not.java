package BIT_MANIPULATION;

import java.util.*;
public class check_power_of_2_or_not {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            if((n&0)==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
//////////////THIS IS A UN SOLVED QUESTION