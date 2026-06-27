public class Recursions5{
    public static int tillingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int fm1= tillingProblem(n-1);
        //horizontal
        int fm2= tillingProblem(n-2);
        return (fm1+fm2);
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(tillingProblem(n));
    }
}
