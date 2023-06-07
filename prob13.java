//  search in a 2-d matrix

// brute force
// linearly travering matrix


// optimal

public class prob13 {
    private static boolean serach(int[][] arr,int k) {
        int r = arr.length;
        int c = arr[0].length;
        int low = 0,high = (r*c)-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid/c][mid%c] == k)
               return true;
            else if(arr[mid/c][mid%c] < k)
              low = mid+1;
            else
               high = mid-1; 
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        serach(arr,3);
    }
}
