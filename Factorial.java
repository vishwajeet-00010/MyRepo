import java.util.*;
public class Factorial{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        int result=factorial(x);
        System.out.println("factorial of "+ x +" is " + result);
    }
}                

