// find all possible permutation

// brute force

// by finding all the possible permutation

// optimal


public class nextpermutation3 {
    public static void reverse(int nums[],int s,int e){
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;e--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int n =nums.length;
        if(n == 0)
          return ;
          int ind = -1;
        for(int i = n-2;i >= 0;i--){
            if(nums[i] < nums[i+1]){
               ind = i;
               break;
            }
        }
        if(ind == -1){
           reverse(nums,0,n-1);
           return ;
        }
        
        for(int i = n-1;i > ind;i--){
            if(nums[ind] < nums[i]){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        for(int x : arr) System.out.print(x+" ");


    }
}
