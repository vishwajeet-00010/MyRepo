import java.util.*;
public class Greedy2{
    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        double ratio[][] = new double[val.length][2];
        for(int i =0; i<val.length;i++){
            ratio[i][0]= i;
            ratio[i][1]= val[i]/(double)weight[i];
        } 
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int Capacity= W;
        int findval =0;
        for(int i =ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(Capacity >= weight[idx]){
                findval += val[idx];
                Capacity -= weight[idx];
            }
            else{
                findval += (ratio[i][1]*Capacity);
                Capacity =0;
                break;
            }
        }
        System.out.println("max total value will be "+ findval);
    }
}
