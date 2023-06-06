// best time to buy and sell stocks

// brute

public class prob5 {
    private static void stocks(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0;i < n;i++){
           for(int j = i+1;j < n;j++)
                 ans = Math.max(ans, arr[j]-arr[i]);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        stocks(arr);
    }

}

// optimal

// public class prob5 {
//     private static void stocks(int[] arr) {
//         int n = arr.length;
//         int min = arr[0];
//         int ans = 0;
//         for(int i = 1;i < n;i++){
//             if(arr[i] < min)  min = arr[i];

//             ans = Math.max(ans, arr[i]-min);
//         }
//         System.out.println(ans);
//     }

//     public static void main(String[] args) {
//         int arr[] = {7,1,5,3,6,4};
//         stocks(arr);
//     }

// }
