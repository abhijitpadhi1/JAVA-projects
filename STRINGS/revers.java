package STRINGS;

import java.util.*;

public class revers {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            StringBuilder sb = new StringBuilder(sc.next());
            for(int i=0;i<sb.length()/2;i++){
                char back = sb.charAt(sb.length()-i-1);
                char front = sb.charAt(i);
                char frontChar=back;
                char backChar=front;
                sb.setCharAt(i, frontChar);
                sb.setCharAt(sb.length()-i-1, backChar);

            }
            System.out.print(sb);
        }
    }
}
