import java.util.*;
public class StackB3{
    public static String reversseString(String str){
        Stack<Character> stack = new Stack<>();
        int idx =0;
        while(idx<str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "Hello World";
        String reversed = reversseString(str);
        System.out.println(reversed);
    }
}
