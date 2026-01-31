import java.util.*;
public class JavaArrays3{
    public static int LargestNumber(int numbers[]){
        int largest= Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }return largest;
    }
    public static void main(String args[]){
        int numbers[]= {3,35,53,52,59,78,55};
        System.out.println("largest number is " + LargestNumber(numbers));
    }
}
