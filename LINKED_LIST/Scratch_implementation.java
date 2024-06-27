package LINKED_LIST;

class Scratch_implementation {
    Node head;
    private int size;
    Scratch_implementation(){
        size = 0;
    }
    public class Node{
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
        newNode.next = head;
        head = newNode;
        
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode.next = lastNode;
        }
        lastNode.next = newNode;
        
    }
    public void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty List ; Nothing to remove");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("Empty List ; Nothing to remove");
            return;
        }
        size--;
        if(head.next == null){
            System.out.println("null");
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
        
    }
    public void getSize(){
        System.out.println("List size is "+size);
    }
    public void insertInMiddle(String data, int idx){
        if(idx > size || idx < 0){
            System.out.println("Invalid indx");
            return;
        }
        
        Node newNode = new Node(data);
        if(head == null || idx == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=0;i<size;i++){
            if(i == idx){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }        
    }
    
    public static void main(String args[]){
        Scratch_implementation list = new Scratch_implementation();
        
        list.addLast("3");
        list.addLast("4");
        list.addFirst("2");
        list.addFirst("1");

        list.getSize();
        list.printList();

        //list.removeLast();
        //list.removeFirst();

        //list.getSize();
        //list.printList();

        list.insertInMiddle("3.5",2);

        list.getSize();
        list.printList();

    }
}