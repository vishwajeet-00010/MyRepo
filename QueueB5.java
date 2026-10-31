import java.util.*;
import java.util.LinkedList;
public class QueueB5{
    public static void nonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
    }
    public static void main(String[] args){
        nonRepeating("aabcbc");
    }
        
}
