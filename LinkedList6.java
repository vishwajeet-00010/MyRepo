public class LinkedList6{
    Node head;
    static class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }
    public boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // Create a cycle
        System.out.println(list.isCycle(head));
    }
}
