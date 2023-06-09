// Count the number of subarrays with given xor K

// brute force

public class prob23 {
    public static void subarray(int arr[], int x) {
        int xor = 0, ans = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) 
                    xor ^= arr[k];
                if (xor == x)
                    ans++;
                xor = 0;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };
        int k = 6;
        subarray(arr, k);
    }
}


// better

// public class prob23 {
// public static void subarray(int arr[],int k) {
// int xor = 0,ans = 0,n = arr.length;
// for(int i = 0;i < n;i++){
// for(int j = i;j < n;j++){
// xor^=arr[j];
// if(xor == k) ans++;
// }
// xor = 0;
// }
// System.out.println(ans);
// }
// public static void main(String[] args) {
// int arr[] = {4, 2, 2, 6, 4};
// int k = 6;
// subarray(arr,k);
// }
// }


// optimal

// import java.util.HashMap;

// public class prob23 {
// public static void subarray(int arr[],int k) {
// HashMap<Integer,Integer>map = new HashMap<>();
// int xor = 0,ans = 0;
// map.put(xor, 1);
// for(int x:arr){
// xor^=x;
// int xr = xor^k;
// ans+=map.getOrDefault(xr,0);
// map.put(xor, map.getOrDefault(xor, 0)+1);
// }
// System.out.println(ans);
// }
// public static void main(String[] args) {
// int arr[] = {4, 2, 2, 6, 4};
// int k = 6;
// subarray(arr,k);
// }
// }