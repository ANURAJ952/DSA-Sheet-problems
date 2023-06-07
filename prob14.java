// pow(x,n)


// brute force

public class prob14 {
    private static double pow(double x, double y) {
        double ans = x;
        for(int i = 1;i < y;i++)
            ans*=x;
       return ans;
    }
    public static void main(String[] args) {
        System.out.println(pow(2.1,3));
    }
}
