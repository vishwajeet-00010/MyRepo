import java.util.Stack;
public class StackB4 {
    public static void PushatBottom(Stack<Integer> s, int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        PushatBottom(s, x);
        s.push(top);
    }
    public static void PrintStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        PushatBottom(s, 5);
        PrintStack(s);
    }
}
