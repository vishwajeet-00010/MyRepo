import java.util.*;
public class sumUsingMethods
{
    public static int add(int a, int b){
        int s=a+b;
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=sc.nextInt();
        System.out.println("Enter second number:");
        int y=sc.nextInt();
        int sum= add(x,y);
        System.out.println("The sum is:" + sum);
        
    }
}
