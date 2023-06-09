// 4-sum

// brute force

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class prob20 {

//     private static List<List<Integer>> foursum(int[] nums, int target) {
//         Set<List<Integer>> unique = new HashSet<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         int n = nums.length;
//         Arrays.sort(nums);
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     for (int x = k + 1; x < n; x++) {
//                         if ((nums[i] + nums[j] + nums[k] + nums[x]) == target) {
//                             List<Integer> temp = new ArrayList<>();
//                             temp.add(nums[i]);
//                             temp.add(nums[j]);
//                             temp.add(nums[k]);
//                             temp.add(nums[x]);
//                             if (unique.add(temp))
//                                 ans.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {};
//         foursum(arr, 0);
//     }

// }

// better

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class prob20 {

//     private static List<List<Integer>> foursum(int[] nums, int target) {
//         Set<List<Integer>> unique = new HashSet<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         int n = nums.length;
//         Arrays.sort(nums);
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int low = j + 1, high = n - 1, sum = nums[i] + nums[j];
//                 while (low < high) {
//                     if ((sum + nums[low] + nums[high]) == target) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[low]);
//                         temp.add(nums[high]);
//                         if (unique.add(temp)) {
//                             ans.add(temp);
//                         }
//                         low++;
//                         high--;
//                     } else if ((sum + nums[low] + nums[high]) < target)
//                         low++;
//                     else
//                         high--;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = {};
//         foursum(arr, 0);
//     }

// }

// optimal

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class prob20 {

// private static List<List<Integer>> foursum(int[] nums, int target) {
// List<List<Integer>> ans = new ArrayList<>();
// int n = nums.length;
// Arrays.sort(nums);
// for (int i = 0; i < n; i++) {
// if (i > 0 && nums[i] == nums[i - 1])
// continue;
// for (int j = i + 1; j < n; j++) {
// if (j > i + 1 && nums[j] == nums[j - 1])
// continue;
// int low = j + 1, high = n - 1, sum = nums[i] + nums[j];
// while (low < high) {
// if ((sum + nums[low] + nums[high]) == target) {
// List<Integer> temp = new ArrayList<>();
// temp.add(nums[i]);
// temp.add(nums[j]);
// temp.add(nums[low]);
// temp.add(nums[high]);
// ans.add(temp);
// low++;
// high--;
// while (low < high && nums[low] == nums[low - 1])
// low++;
// while (low < high && nums[high] == nums[high + 1])
// high--;
// } else if ((sum + nums[low] + nums[high]) < target)
// low++;
// else
// high--;
// }
// }
// }
// return ans;
// }

// public static void main(String[] args) {
// int arr[] = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
// List<List<Integer>> ans = foursum(arr, 9);
// System.out.println(ans);
// }

// }