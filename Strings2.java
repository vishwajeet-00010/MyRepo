public class Strings2{
    public static float ShortestPath(String path){
        int x=0, y=0;
        for (int i=0; i<path.length();i++){
            char DIR= path.charAt(i);
            if (DIR == 'N'){
                y++;
            }
            else if(DIR== 'S'){
                y--;
            }
            else if (DIR=='E')
                x++;
            else if (DIR == 'W'){
                x--;
            }            
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
        
    }
    public static void main(String[] args){
        String path="WNEENESENNN";
        System.out.println(ShortestPath(path));
    }
}
