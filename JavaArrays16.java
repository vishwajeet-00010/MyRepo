public class JavaArrays16{
    public static boolean pairsum1(int arr[], int target){
        int lp = 0;
        int rp = arr.length-1;
        while(lp<rp){
            if(arr[lp] + arr[rp] == target){
                return true;
            }
            if(arr[lp] + arr[rp] < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static int[] pairsum2(int arr2[], int target){
        int bp = -1;
        int n = arr2.length;
        for(int i =0; i<n-1;i++){
            if(arr2[i]> arr2[i+1]){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(arr2[lp] + arr2[rp] == target) return new int[]{lp, rp};
            if(arr2[lp] + arr2[rp] < target) {
                lp= (lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int arr2[]={11,15,6,8,9,10};
        System.out.println(pairsum1(arr, 7));
        int result[] = pairsum2(arr2, 16);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
