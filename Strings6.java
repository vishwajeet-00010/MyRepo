import java.util.*;
public class Strings6 {
    public static boolean Anagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] s1array= str1.toCharArray();
        char[] s2array = str2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        return Arrays.equals(s1array, s2array);
    }
    public static void main(String[] args){
        String str1="Listen";
        String str2= "Silent";
        if(Anagram(str1,str2)){
            System.out.println(str1+" and " +str2+" are anagrams.");
        }
        else{
            System.out.println(str1+" and "+ str2+" are not anagrams.");
        }
    }
}
