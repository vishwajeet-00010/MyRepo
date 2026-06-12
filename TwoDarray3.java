import java.util.*;
public class TwoDarray3{
    public static void DiagonalSUM(int arr[][]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!= arr.length-1-i)
                sum+=arr[i][arr.length-1 -i];
        }
        System.out.println("The sum of the diagonal elements is: "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        DiagonalSUM(arr);
    }
}
