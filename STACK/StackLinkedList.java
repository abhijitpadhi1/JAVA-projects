package STACK;

public class StackLinkedList {
    public static Node head;
    static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            next = null;
        }
    }
    
    static class Stack {
        public boolean isEmpty(){
            return head == null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop(){
            if(head == null){
                System.out.println("List is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            if(head == null){
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(head != null){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
