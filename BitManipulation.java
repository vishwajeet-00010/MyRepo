public class BitManipulation {
    public static void EvenorOdd(int n){
        int bitMask=0;
        if((n & bitMask)==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
}
