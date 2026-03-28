public class JavaArrays9{
    public static void MaxSumSubArray(int n[]){
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=n[k];
                }
                if(MaxSum<=currSum){
                    MaxSum=currSum;
                }
            
            }  
        }System.out.println(MaxSum);
    }
    public static void main(String[]args){
        int n[]={1,2,3,4,5,6,};
        MaxSumSubArray(n);
    }
}
