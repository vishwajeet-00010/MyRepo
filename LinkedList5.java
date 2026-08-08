public class LinkedList5{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data =d ;
            next = null;
        }
    }
    public Node FindMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalidrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = FindMid(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while(right!= null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public void printList(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
    public staic void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(1);
        list.printList(list.head);
        System.out.println(list.isPalidrome(list.head));
    }
}
