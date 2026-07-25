import java.util.*;
public class Hashmap{
    public static int maxStepforEmpty(int[] arr){
        int n = arr.length;
        int maxfreq =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            int freq = map.getOrDefault(arr[i],0)+1;
            map.put(arr[i], freq);
            maxfreq = Math.max(maxfreq, freq);
        }
        return Math.max(maxfreq, (n+1)/2);
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3};
        System.out.println(maxStepforEmpty(arr));
    }
}
