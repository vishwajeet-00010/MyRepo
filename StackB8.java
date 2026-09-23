import java.util.*;
public class StackB8{
    public static boolean Duplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == ')'){
                int count =0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1 ) return true;
            }
            else{
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(Duplicate(str)){
            System.out.println("Duplicate");
        }
        else{
            System.out.println("Not Duplicate");
        }
    }
}
