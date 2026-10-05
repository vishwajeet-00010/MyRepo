public class QueueB{
    static class Queue{
        int[] arr;
        int size;
        int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public boolean isEmpty(){
            return rear == -1;
        }
        public void enqueue(int data){
            if(rear == size -1){
                System.out.println("Queue is full");
            }
            else{
                rear++;
                arr[rear] = data;
            }
        }
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int front = arr[0];
                for(int i=0; i<rear; i++){
                    arr[i] = arr[i+1];
                }
                rear = rear -1;
                return front;
            }
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                return arr[0];
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
