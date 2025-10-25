
import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0; i<3; i++){
            String name = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-14s %03d %n", name, num);
        }
        System.out.println("================================");
    }
}