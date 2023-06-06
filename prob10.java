// Find the duplicate in an array of N+1 integers

// brute force

// import java.util.Arrays;

// public class prob10 {
//     public static int duplicate(int nums[]) {
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if(nums[i] == nums[i-1])
//                 return nums[i];
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,3,4,2,2};
//         duplicate(arr);
//     }
// }


// better

// import java.util.HashSet;
// import java.util.Set;

// public class prob10 {
//     public static int duplicate(int nums[]) {
//        Set<Integer>set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             if(set.contains(nums[i]))
//                 return nums[i];   
//            set.add(nums[i]);
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,3,4,2,2};
//         duplicate(arr);
//     }
// }


// optimal


public class prob10 {
    public static int duplicate(int nums[]) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = nums[0];
        while(slow != fast){
             slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        duplicate(arr);
    }
}

