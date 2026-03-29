public class JavaArrays11{
    public static void kadanes(int n[]){
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n.length;i++){
            currSum+=n[i];
            maxSum=Math.max(currSum, maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int n[]={-2,-1,-1,-5,};
        kadanes(n);
    }
}
