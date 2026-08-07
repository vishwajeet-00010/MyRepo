public class LinkedList3{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void printList(){
        Node n = head;
        while(n!= null){
            System.out.print(n.data + "->");
            n= n.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.printList();
        list.reverse();
        list.printList();
    }
}
