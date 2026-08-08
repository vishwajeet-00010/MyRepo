public class LinkedList4{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void deleteNode(int n){
        int size =0;
        Node temp = head;
        while(temp!= null){
            size++;
            temp = temp.next;
        }
        if(n==size){
            head = head.next;
        }
        int i =1;
        int itoFind = size - n;
        Node prev = head;
        while(i< itoFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head =  new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.printList();
        System.out.println();
        list.deleteNode(2);
        list.printList();
    }
}
