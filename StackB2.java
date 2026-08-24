public class StackB2 {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
        static class Stack{
            Node head = null;
            public boolean isEmpty(){
                return head == null;
            }
            public void push(int data){
                Node newNode = new Node (data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            public void pop(){
                if(isEmpty()){
                    System.out.println("Stack is empty");
                    return;
                }
                int top = head.data;
                head = head.next;
                System.out.println( top);
            }
            public void peek(){
                if(isEmpty()){
                    System.out.println("Stack is empty");
                    return;
                }
                System.out.println(head.data);
            }
        }
    }
    public static void main(String[] args) {
        Node.Stack stack = new Node.Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek()        ; 
        stack.pop();
        stack.peek();
        stack.pop();
        stack.pop(); 
        stack.pop();
    }
}
