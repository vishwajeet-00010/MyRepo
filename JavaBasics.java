import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>-100 && n<100) {
            String str = Integer.toString(n);
            if(str != null) {
                System.out.println("Good job");
            }
            else {
                System.out.println("Wrong answer");
            }
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}            