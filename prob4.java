// finding maximum subarray sum


// Brute force

// public class prob5 {
//     private static int maxsubarraysum(int[] arr) {
//         int n = arr.length;
//         int sum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i = 0;i < n;i++){
//             for(int j = i;j < n;j++){
//                 for(int k = i;k <= j;k++){
//                     sum+=arr[k];
//                 }
//                 if(maxsum < sum)
//                  maxsum = sum;
//                 sum = 0;
//             }
//         }
//         return maxsum;
//     }
//     public static void main(String[] args) {
//         int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//         maxsubarraysum(arr);
//     }
// }


// better 

// public class prob5 {
//     private static int maxsubarraysum(int[] arr) {
//         int n = arr.length;
//         int sum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         for(int i = 0;i < n;i++){
//             for(int j = i;j < n;j++){
//                     sum+=arr[j];
//                 if(maxsum < sum)
//                  maxsum = sum;
//             }
//             sum = 0;
//         }
//         return maxsum;
//     }
//     public static void main(String[] args) {
//         int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//         maxsubarraysum(arr);
//     }
// }

// optimal

public class prob4 {
    private static int maxsubarraysum(int[] arr) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int x : arr){
            sum+=x;
            if(sum > maxsum)
               maxsum = sum;
            if(sum < 0)
               sum = 0;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxsubarraysum(arr);
    }
}