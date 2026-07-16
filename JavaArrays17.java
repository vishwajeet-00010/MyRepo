public class JavaArrays17{
    public static int SingleElement(int arr[] ){
        int n= arr.length;
        int start =0;
        int end = n-1;
        if(n==1) return arr[0];
        while(start<=end){
            int mid = start + (end - start )/2;
            if(mid == 0 && arr[1]!= arr[0]) return arr[0];
            if(mid == n-1 && arr[n-2]!= arr[n-1]) return arr[n-1];
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            if(mid%2 == 0){
                if(arr[mid] == arr[mid+1]){
                    start= mid+2;
                }
                else{
                    end= mid-1;
                }
            } 
            else{
                if(arr[mid] == arr[mid-1]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {1,1,2,3,3,4,4,7,7};
        System.out.println("element is " + SingleElement(arr));
    }
}
