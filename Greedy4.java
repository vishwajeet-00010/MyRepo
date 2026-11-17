import java.util.*;
public class Greedy4{
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the number of 2d array");
        int n = size.nextInt();
        int[][] pairs = new int[n][2];
        System.out.println("Enter the elements of the 2D array:");
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                pairs[i][j]= size.nextInt();
            }
        }
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chain =1;
        int endPoint = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > endPoint){
                chain++;
                endPoint = pairs[i][1];
            }
        }
        System.out.println("max length of chain of pairs is " + chain);
    }
}
