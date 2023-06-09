// longest subarray sum to k


// brute force


public class prob22 {

    public static void maxsumlen(int nums[],int k) {
        int sum = 0,ans = 0;
        for(int i = 0;i < nums.length;i++){
            sum = nums[i];
           for(int j = i+1;j < nums.length;j++){
               sum+=nums[j];
               if(sum == k){
                   ans = Math.max(ans, j-i+1);
               }
           }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-2,4,-4};
        maxsumlen(arr,0);
    }
}

// optimal

// import java.util.HashMap;
// import java.util.Map;

// public class prob22 {

//     public static void maxsumlen(int nums[],int k) {
//         Map<Integer,Integer>prefix = new HashMap<>();
//         int sum = 0,ans = 0;
//         for(int i = 0;i < nums.length;i++){
//            sum+=nums[i];
//            if(sum == k){
//             sum = 0;
//              ans = i+1;
//            }else{
//             if(prefix.get(sum) != null)
//                    ans = Math.max(ans, i-prefix.get(sum));
//              else
//                 prefix.put(sum, i);
//            }
//         }
//         System.out.println(ans);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,-2,4,-4};
//         maxsumlen(arr,0);
//     }
// }