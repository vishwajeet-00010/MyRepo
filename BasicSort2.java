import java.util.*;
public class BasicSort2{
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int MinPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[MinPos]){
                    MinPos = j;
                }
            }
            int temp = arr[MinPos];
            arr[MinPos]=arr[i];
            arr[i]= temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]={2,5,1,9,0,6};
        SelectionSort(arr);
        printArr(arr);
    }
}
