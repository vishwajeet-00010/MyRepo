public class TwoDarray4{
    public static void Transpose(int arr[][]){
        int rows= arr.length;
        int cols = arr[0].length;
        int result[][] = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Transpose(arr);
    }
}
