public class LinkedList2{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }
    public int search(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data ==  key){
            return 0;
        }
        int idx = search(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new Node (10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        int key = 20;   
        int result = list.search(list.head , key);
        System.out.println("Index of " + key + " is: " + result);
    }
}
