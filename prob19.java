// 2 sum

// brute force 

// public class prob19 {
//     private static void twosum(int[] nums, int target, int n) {
//         int ans[] = new int[2];
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if ((nums[i] + nums[j]) == target) {
//                     ans[0] = i;
//                     ans[1] = j;
//                 }
//             }
//         }
//         for (int i : ans)
//             System.out.println(i + "  ");
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 6, 5, 8, 11 };
//         int k = 14;
//         twosum(arr, k, arr.length);
//     }
// }



// better

// import java.util.HashMap;
// import java.util.Map;

// public class prob19 {
//     private static void twosum(int[] nums, int target, int n) {
//         int ans[] = new int[2];
//         Map<Integer,Integer>sum = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             if(sum.containsKey(target-nums[i])){
//                 ans[0] = i;
//                 ans[1] = sum.get(target-nums[i]);
//                 break;
//             }
//             sum.put(nums[i],i);
//         }
//         for (int i : ans)
//             System.out.println(i + "  ");
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 6, 5, 8, 11 };
//         int k = 14;
//         twosum(arr, k, arr.length);
//     }
// }


// optimal

import java.util.Arrays;

public class prob19 {
    private static void twosum(int[] nums, int target, int n) {
        int ans[] = new int[2];
        Arrays.sort(nums);
        int i = 0,j = n-1;
        while(i < j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                ans[0] = i;
                ans[1] = j;
                break;
            }
            else if(sum < target)   i++;
            else j--;
        }
        for (int x : ans)
            System.out.println(x + "  ");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };
        int k = 14;
        twosum(arr, k, arr.length);
    }
}