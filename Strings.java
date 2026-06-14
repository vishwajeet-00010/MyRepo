public class Strings {
    public static Boolean IsPallindrome(String str){
        int n = str.length();
        for (int i=0; i<n/2;i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        if(IsPallindrome(str)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
