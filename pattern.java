public class pattern{
    public static void inverted_rot_half_pyramid(int totalrows, int totalcols){
        for (int i=1;i<=totalrows;i++){
            for (int j=1;j<=totalrows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rot_half_pyramid(5,5);
    }
}
