import java.util.*;
public class pattern7{
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            if(i==1||i==n){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }System.out.println();
            }
            else{
                for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }System.out.print("*");
            for(int j=1;j<=3;j++){
                System.out.print(" ");
            }System.out.print("*");
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
