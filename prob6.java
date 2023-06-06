// sort o's 1's 2's

// brute force
//    sorting algo

// /better

public class prob6{
    public static void sort(int nums[]) {
        int cnt0 = 0,cnt1 = 0,cnt2 = 0;
       for(int x : nums){
        if(x == 0)
          cnt0++;
        if(x == 1)
          cnt1++;
        if(x == 2)
          cnt2++;
       }

       for(int i = 0;i < cnt0;i++)  nums[i] = 0;
       for(int i = cnt0;i < cnt1+cnt0;i++)  nums[i] = 1;
       for(int i = cnt1+cnt0;i < cnt2+cnt1+cnt0;i++)  nums[i] = 2;
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sort(arr);
        for(int x : arr) System.out.print(x+" ");
    }
}


// optimal 

// public class prob6{
//     public static void sort(int nums[]) {
//         int n = nums.length;
//         int low = 0,mid = 0,high = n-1;
//         while(mid<=high){
//             if(nums[mid] == 0){
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             }
//             else if(nums[mid] == 1){
//                 mid++;
//             }
//             else if(nums[mid] == 2){
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,0,2,1,1,0};
//         sort(arr);
//         for(int x : arr) System.out.print(x+" ");
//     }
// }
