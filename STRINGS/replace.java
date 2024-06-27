package STRINGS;

import java.util.*;

public class replace {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String input=sc.next();
            System.out.println(input);
            String result="";
            for(int i=0;i<input.length();i++){
                if(input.charAt(i)=='e'){
                    result += 'i';
                }
                else{
                    result += input.charAt(i);
                }
            }
            System.out.print(result);
        }
    }
}
