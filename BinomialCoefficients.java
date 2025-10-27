import java.util.*;
public class BinomialCoefficients {
    public static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }
    public static int BinomialCoefficient(int n,int k){
        int fact_n = factorial(n);
        int fact_k=factorial(k);
        int fact_nk=factorial(n-k);
        int bc=fact_n/(fact_k*fact_nk);
        return bc;


    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  the n number");
        int n=sc.nextInt();
        System.out.println("Enter the k number");
        int k=sc.nextInt();
        int result=BinomialCoefficient(n,k);
        System.out.println("The Binomial Coefficient is: "+result);
    }
}    
    
