// Majority Elements(>N/3 times) | Find the elements that appears more than N/3 times in the array

// brute force

// import java.util.ArrayList;
// import java.util.List;

// public class prob16 {
//     public static List<Integer> majority(int arr[], int n) {
//         int cnt = 0;
//         List<Integer> ans = new ArrayList<>();
//         for (int x : arr) {
//             if (ans.contains(x))
//                 continue;
//             for (int y : arr)
//                 if (x == y)
//                     cnt++;

//             if (cnt > n / 3)
//                 ans.add(x);
//             cnt = 0;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 2, 3 };
//         List<Integer>ans = majority(arr, arr.length);
//         for (Integer integer : ans) 
//             System.out.println(integer);
        
//     }
// }


// better

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class prob16 {
//     public static List<Integer> majority(int arr[], int n) {
       
//         List<Integer> ans = new ArrayList<>();
//         Map<Integer,Integer>map = new HashMap<>();
//         for (int x : arr) {
//            map.put(x, map.getOrDefault(x,0)+1);
//            if(map.get(x) > n/3)
//               ans.add(x);
//         }
        
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 2, 3 };
//         List<Integer>ans = majority(arr, arr.length);
//         for (Integer integer : ans) 
//             System.out.println(integer);
        
//     }
// }


// optimal

import java.util.ArrayList;
import java.util.List;

public class prob16 {
    public static List<Integer> majority(int arr[], int n) {
        int cnt1 = 0,cnt2 = 0,ele1 = 0,ele2 = 0;
        List<Integer> ans = new ArrayList<>();
        for(int x : arr){
            if(cnt1 == 0 && ele2 != x){cnt1++;ele1 = x;}
            else if(cnt2 == 0 && ele1 != x){cnt2++;ele2 = x;}
            else if(x == ele1) cnt1++;
            else if(x == ele2) cnt2++;
            else {cnt1--;cnt2--;}
        }
        cnt1 = 0;cnt2 = 0;
        for(int x : arr){
            if(x == ele1)
              cnt1++;
            if(x == ele2)
              cnt2++;
        }
        if(cnt1 > n/3)  ans.add(ele1);
        if(cnt2 > n/3  && !ans.contains(ele2))  ans.add(ele2);

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        List<Integer>ans = majority(arr, arr.length);
        for (Integer integer : ans) 
            System.out.println(integer);
        
    }
}