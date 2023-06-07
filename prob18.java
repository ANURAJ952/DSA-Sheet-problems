// reverse pairs

// brute force

public class prob18 {
    private static void reversepair(int[] arr, int n) {
         int ans = 0;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if((long)arr[i] > 2*(long)arr[j])
                   ans++;
            }
        }
       System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};
        reversepair(arr,arr.length);
    }
}
