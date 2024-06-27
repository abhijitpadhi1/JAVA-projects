package STACK;

import java.util.ArrayList;
// import java.util.Stack;

public class StackArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        public static void push(int data) {
            list.add(data);
        }
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        // Stack s = new Stack<>();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        while(!Stack.isEmpty()){
            System.out.print(Stack.pop());
        }
    }
}
