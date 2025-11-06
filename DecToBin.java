import java.util.*;
public class DecToBin{
    public static int decToBin(int n){
        int power=0;
        int bin=0;
        while(n>0){
            int ld=n%10;
            int rem = ld%2;
            bin = bin + rem*(int)(Math.pow(10,power));
            power++;
            n=n/2;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int num= sc.nextInt();
        System.out.println("the Binary number is "+ decToBin(num) );


    }
}
