import java.util.*;
public class TwoDarray2{
    public static void SpiralMatrix(int arr[][]){
        int Startrow=0;
        int Startcol=0;
        int Endrow= arr.length -1;
        int Endcol = arr[0].length -1;
        while (Startrow <= Endrow && Startcol<= Endcol){
            //top
            for(int j=0;j<=Endcol;j++){
                System.out.print(arr[Startrow][j]+" ");
            }
            //right
            for (int i=Startrow+1; i<=Endrow; i++)
                System.out.print(arr[i][Endcol]+" ");
            //bottom
            for (int j=Endcol-1; j>=Startcol;j--){
                System.out.print(arr[Endrow][j]+" ");
            }
            //left
            for(int i = Endrow-1; i>=Startrow; i--){
                System.out.print(arr[i][Startrow]+" ");
            }
            Startrow++;
            Startcol++;
            Endrow--;
            Endcol--;
        }
    }
    public static void main(String[] args){
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        SpiralMatrix(arr);
    }
}
