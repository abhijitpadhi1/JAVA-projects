package LINKED_LIST;

import java.util.*;

public class Linklist_class {
    public static void main(String args[]){
        LinkedList <String> LL = new LinkedList<>();
        LL.add("2");
        LL.addFirst("1");
        LL.addLast("4");
        LL.add(2, "3");

        System.out.println(LL.size());
        System.out.println(LL.get(0));
        System.out.println(LL);

        LL.remove(3);
        LL.removeFirst();
        LL.removeLast();

        System.out.println(LL.size());
        System.out.println(LL.get(0));
        System.out.println(LL);
    }
}
