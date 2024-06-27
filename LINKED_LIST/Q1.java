package LINKED_LIST;

import java.util.LinkedList;

public class Q1 {
    
    public static int searchAndDisplay(LinkedList<Integer> LL, int size, int idx){
        for(idx=0;idx<size;idx++){
            if(LL.get(idx)==7){
                break;
            }
        }
        return idx;
    }
    public static void main(String args[]){
        LinkedList <Integer> LL = new LinkedList<>();
        LL.add(1);
        LL.add(5);
        LL.add(7);
        LL.add(3);
        LL.add(8);
        LL.add(2);
        LL.add(3);
        int size = LL.size();
        System.out.println(LL);
        System.out.println(searchAndDisplay(LL, size, 0));
    }
}
