public class Recursions4{
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }

    public static int OptPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower= OptPower(x,n/2);
        int halfpowersq= halfpower* halfpower;
        if(n%2!=0){
            halfpowersq = x* halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args){
        System.out.println(power(2,5));
        System.out.println(OptPower(2,5));
    }
}
