// Grid Unique Paths | Count paths from left-top to the right bottom of a matrix

// brute force


// public class prob17 {
//     private static int paths(int i, int j, int m, int n) {
          
//         if(i == (m-1) && j == (n-1)) return 1;
//         if(i >= m || j >= n) return 0;
//         return paths(i+1, j, m, n)+paths(i, j+1, m, n);

//     }
//     public static void main(String[] args) {
//         int m = 3,n = 4;
//         paths(0,0,m,n);
//     }
// }
    
// better

// import java.util.Arrays;

// public class prob17 {
//     private static int paths(int i, int j, int dp[][], int m, int n) {
          
//         if(i == (m-1) && j == (n-1)) return 1;
//         if(i >= m || j >= n) return 0;
//         if(dp[i][j] != -1) return dp[i][j];
//         return dp[i][j] = paths(i+1, j,dp, m, n)+paths(i, j+1,dp, m, n);

//     }
//     public static void main(String[] args) {
//         int m = 3,n = 4;
//         int dp[][] = new int[m][n];
//         for(int []row : dp)
//              Arrays.fill(row,-1); 
//         paths(0,0,dp,m,n);
//     }
// }


// optimal

public class prob17 {
    public static void main(String[] args) {
        int m = 2,n = 3;
       int N = m+n-2;
       int r = m-1;
       double res = 1;
       for(int i = 1;i <= r;i++){
             res = res*(N-r+i)/i;
       }
       System.out.println(res);
    }
}