package LINKED_LIST;

import java.util.LinkedList;
import java.util.Scanner;

public class Q2 {
    
    public static LinkedList<Integer> delete25(LinkedList<Integer> LL,int idx){
        LinkedList <Integer> LL2 = new LinkedList<>();
        for(idx=0; idx<5; idx++){
            if(LL.get(idx) < 25){
                LL2.add(LL.get(idx));
            }
        }
        return LL2;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            LinkedList <Integer> LL = new LinkedList<>();
            for(int i=0;i<5;i++){
                LL.add(sc.nextInt());
            }
            System.out.println(LL);
            System.out.println(delete25(LL, 0));
        }
    }
}
