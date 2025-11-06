import java.util.*;
public class BinToDec{
 public static int binToDec(int n){
     int dec=0;
     int power=0;
     while(n>0){
         int LD=n%10;
         dec= dec+ (LD*(int)Math.pow(2,power));
         power++;
         n=n/10;
     }
     return dec;


 }
 public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the binary number");
     int num= sc.nextInt();

     System.out.println("the decimal number is "+ binToDec(num));

 }
}
