package recursion;
public class factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int smallAns = fact(n-1);
        return n*smallAns;

    }

    public static int power(int n, int x){
        if(x == 0){
            return 1;
        }

        int smallPow = power(n,x-1);
        return n*smallPow;
    }

    public static void main(String[] args) {
        int n = 4;
        int x = 3;
        System.out.println(fact(n));
        System.out.println(power(n,x));
        
    }
}
