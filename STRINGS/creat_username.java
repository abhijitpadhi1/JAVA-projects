package STRINGS;

import java.util.*;
public class creat_username {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Give your email");
            String email = sc.next();
            System.out.print("The username can be ");
            for(int i=0;i<email.indexOf('@');i++){
                
                
                    System.out.print(email.charAt(i));
                    
                
            } 
        }
    }
}
