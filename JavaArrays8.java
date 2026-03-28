public class JavaArrays8{
    public static void SubArray(int n[]){
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                }
                System.out.println();
            }  
        }System.out.println();
    }
    public static void main(String[]args){
        int n[]={1,2,3,4,5,6,};
        SubArray(n);
    }
}
