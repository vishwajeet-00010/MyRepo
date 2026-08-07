public class LinkedList{
    Node head1, head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public Node getIntersection(Node head1, Node head2){
        while(head1!=null){
            Node temp = head2;
            while(temp!= null){
                if(head1 == temp){
                    return head1;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }
        return null;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head1 = new Node(10);
        list.head2 = new Node(3);
        list.head2.next = new Node(6);
        list.head2.next.next = new Node(9);
        Node common = new Node(15);
        list.head2.next.next.next = common;
        list.head2.next.next.next.next = new Node(30);
        list.head1.next = common;
        Node intersection = list.getIntersection(list.head1, list.head2);
        if(intersection != null){
            System.out.println("Intersection point: " + intersection.data);
        } else {
            System.out.println("No intersection point found.");
        }
    }
}
