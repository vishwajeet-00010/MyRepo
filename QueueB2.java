public class QueueB2{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        static class Queue{
            Node head = null;
            Node tail = null;
            int size =0;
            public boolean isEmpty(){
                return size == 0;
            }
            public void enqueue(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = tail = newNode;
                }
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
                size++;
            }
            public void dequeue(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return;
                }
                int temp = head.data;
                head = head.next;
                size--;
                System.out.println(temp);
            }
            public void peek(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return;
                }
                System.out.println(head.data);
            }
            public static void printQueue(Queue queue){
                Node current = queue.head;
                while(current != null){
                    System.out.print(current.data + "-> ");
                    current = current.next;
                }
                System.out.print("null");
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        Node.Queue queue = new Node.Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        Node.Queue.printQueue(queue);
        queue.peek();
        queue.dequeue();
        Node.Queue.printQueue(queue);
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
