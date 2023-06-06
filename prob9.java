// merge two sorted array


// brute force

// public class prob9 {
//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         int arr[] = new int[n+m];
//         int left = 0,right = 0,index = 0;
//         while(left < m && right < n){
//             if(nums1[left] <= nums2[right])
//                arr[index++] = nums1[left++];
//             else
//                arr[index++] = nums2[right++];
//         }
//         while(left < m)
//            arr[index++] = nums1[left++];
//         while(right < n)
//             arr[index++] = nums2[right++];
        
//         for(int i = 0;i < m+n;i++){
//                 nums1[i] = arr[i];
//         }
//     }
//     public static void main(String[] args) {
        // int nums1[] = {};
        // int nums2[] = {};
        // int m = 0,n = nums2.length;
        // for(int i = nums1.length;i >= 0;i--)
        //        if(nums1[i]!=0) {m = i;break;}

        // merge(nums1,m,nums2,n);
//     }
// }


// optimal

import java.util.Arrays;

public class prob9 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length;
         int left = m-1,right = 0;
         while(left >= 0 && right < n){
             if(nums1[left] > nums2[right]){
                 int temp = nums1[left];
                 nums1[left] = nums2[right];
                 nums2[right] = temp;
                 left--;
                 right++;
             }else
                break;
         }
         Arrays.sort(nums1,0,m);
         Arrays.sort(nums2);
         left = 0;
         for(int i = m;i < k;i++){
             nums1[i] = nums2[left++];
         }
    }
    public static void main(String[] args) {
         int nums1[] = {};
        int nums2[] = {};
        int m = 0,n = nums2.length;
        for(int i = nums1.length;i >= 0;i--)
               if(nums1[i]!=0) {m = i;break;}

        merge(nums1,m,nums2,n);
    }
}
