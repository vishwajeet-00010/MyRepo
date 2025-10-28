import java.util.*;
public class JavaBasics {
    public static void PrimeinRange(int s,int e){
        for(int i=s;i<=e;i++){
            boolean isPrime=true;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && i>1){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int s=sc.nextInt();
        System.out.println("Enter the ending range:");
        int e=sc.nextInt();
        System.out.println("Prime numbers between "+s+" and "+e+" are:");
        PrimeinRange(s,e);
    }
}    
