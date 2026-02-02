import java .util.*;
public class JavaArrays5{
    public static void Reversearray(int numbers[]){
        int front=0, end =numbers.length-1;
        while(front<end){
            int temp=numbers[front];
            numbers[front]=numbers[end];
            numbers[end]=temp;
            front++;
            end--;
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,5,2,6,3,0};
        Reversearray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }System.out.println();
    }
}
