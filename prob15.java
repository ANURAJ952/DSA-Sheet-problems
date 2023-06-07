// Find the Majority Element that occurs more than N/2 times

// public class prob15 {
//     public static void majority(int arr[], int n) {
//         for (int i = 0; i < n; i++) {
//             int cnt = 0;
//             for (int j = 0; j < n; j++)
//                 if (arr[i] == arr[j])
//                     cnt++;
//             if (cnt > n / 2) {
//                 System.out.println("majority element is :" + arr[i]);
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
//         majority(arr, arr.length);
//     }
// }


// better

// import java.util.HashMap;
// import java.util.Map;

// public class prob15 {
//     public static void majority(int arr[], int n) {

//         Map<Integer,Integer>freq = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
//             if(freq.get(arr[i]) > n/2){
//                 System.out.println("majority element is :" + arr[i]);
//                 break;
//             }
//         }

//     }
//     public static void main(String[] args) {
//         int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
//         majority(arr, arr.length);
//     }
// }


// optimal

public class prob15 {
    public static void majority(int arr[], int n) {
        int ele = 0,cnt = 0;
        for (int i = 0; i < n; i++) {
            if(cnt == 0){
                ele = arr[i];
                cnt++;
            }
            else if(ele == arr[i])   cnt++;
            else cnt--;
        }
        cnt = 0;
        for(int x : arr)
          if(x == ele)
             cnt++;
        if(cnt > n/2)
        System.out.println("majority element is :" + ele);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        majority(arr, arr.length);
    }
}
