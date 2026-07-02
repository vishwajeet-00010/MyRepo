public class JavaArrays14{
    public static int longestsubarraydivisible(int n[], int key){
        int prefix[]= new int[n.length];
        prefix[0] = n[0];
        for(int i=1; i<n.length; i++){
            prefix[i]= prefix[i-1]+ n[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                int sum =i==0?prefix[j]: prefix[j]-prefix[i-1];
                if(sum % key == 0){
                    max = Math.max(max, j-i+1);
                }
                else{
                    max = Math.max(max, 0);
                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int n[]={2,7,6,1,4,5};
        int key=3;
        System.out.println(longestsubarraydivisible(n,key));
    }
}
