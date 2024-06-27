package LINKED_LIST;

public class Reverse {
    static Node head;
    private int size = 0;
    Reverse(){
        size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    } 
    public void getSize(){
        System.out.println("size of list is "+size);
    }
    public void reverseIterative(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next = null;

        return newHead;
    }
    public static void main(String args[]){
        Reverse LL = new Reverse();
        LL.addFirst("3");
        LL.addFirst("2");
        LL.addFirst("1");
        LL.getSize();
        LL.printList();

        LL.reverseIterative();
        //LL.reverseRecursive(head);
        LL.printList();
    }
}
