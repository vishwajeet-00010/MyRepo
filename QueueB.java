import java.util.ArrayList;
public class QueueB {
    static class Queue{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int front = list.get(0);
            list.remove(0);
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(0);
        }
        public static void print(){
            for(int x : list){
                System.out.print(x + "->");
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.push(10);
        queue.push(20); 
        queue.push(30);
        queue.push(40);
        queue.print();
        System.out.println(queue.pop());
        queue.print();
        System.out.println(queue.peek());
    }
}
