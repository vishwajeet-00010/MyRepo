public class JavaArrays10{
    public static void MaxSumbyPrefixArray(int n[]){
        int MaxSum=Integer.MIN_VALUE;
        int prefix[]= new int[n.length];
        prefix[0]=n[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }        System.out.println();
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){

                int currSum=i==0?prefix[j]:prefix[j]-prefix[i]+n[i];
                if(MaxSum<=currSum){
                    MaxSum=currSum;
                }
            
            }  
        }System.out.println(MaxSum);
    }
    public static void main(String[]args){
        int n[]={1,2,3,4,5,6,};
        MaxSumbyPrefixArray(n);
    }
}
