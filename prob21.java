// longest consecutive sequence


// brute force

// public class prob21 {
//     public static int consecutive(int nums[]) {
//         int n = nums.length;
//         if(n == 0) return 0;
//         int ans = 1;
//         for(int i = 0;i < n;i++){
//             int cnt = 1;
//             int val = nums[i];
//            while(isvalid(nums,val+1,n)){
//              val++;
//              cnt++;
//            }
//            ans = Math.max(ans,cnt);
//         }
//         System.out.println(ans);
//         return ans;
//     }
//     private static boolean isvalid(int[] nums, int val, int n) {
//         for(int x : nums)
//          if(x == val) return true;
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
//         consecutive(arr);
//     }
// }


// better

// import java.util.Arrays;

// public class prob21 {
//     public static int consecutive(int nums[]) {
//         int n = nums.length;
//         if(n == 0) return 0;
//         Arrays.sort(nums);
//         int ans = 1;
//         int cnt = 1;
//         int prev = nums[0];
//         for(int i = 1;i < n;i++){
//            if(nums[i] == prev+1)
//                cnt++;
//            else if(nums[i] != prev)
//               cnt = 1;

//             prev = nums[i]; 
//           ans = Math.max(ans,cnt);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
//         consecutive(arr);
//     }
// }


// optimal

import java.util.HashSet;
import java.util.Set;

public class prob21 {
    public static int consecutive(int nums[]) {
        int n = nums.length;
        if(n == 0) return 0;
        int cnt = 1,ans = 0;
        Set<Integer>set = new HashSet<>();
        for(int x: nums)
          set.add(x);
        
        for(int x : set){
            int val = x;
            if(!set.contains(val-1)){
                while(set.contains(val+1)){
                    val+=1;
                     cnt++;
                }
            }
            ans = Math.max(ans,cnt);
            cnt = 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        consecutive(arr);
    }
}