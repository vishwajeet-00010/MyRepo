public class BasicSort3 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        InsertionSort(arr);
        printArray(arr);
    }
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int CurrPos=arr[i];
            int prev=i-1;
            while(prev>=0 && CurrPos<arr[prev]){
                arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1]=CurrPos;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
