public class JavaArrays7{
    public static void PrintPairs(int n[]){
        for(int i=0;i<n.length;i++){
            int curr= n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+ curr+" , "+n[j]+")");
            }System.out.println();
        }
    }
    public static void main(String[] args){
        int n[]= {1,2,3,4,5};
        PrintPairs(n);
    } 
}
