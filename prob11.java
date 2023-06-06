// finding the repeating and the missing number

// brute force

// public class prob11 {
//     private static void missreap(int[] arr, int n) {
//         int miss = 0;
//         int repeating = 0;
//         for (int i = 1; i <= n; i++) {
//             int cnt = 0;
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == i)
//                     cnt++;
//             }
//             if (cnt == 2)
//                 repeating = i;
//             if (cnt == 0)
//                 miss = i;
//         }
//         System.out.println(miss + " " + repeating);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 1, 2, 5, 3 };
//         missreap(arr, arr.length);
//     }
// }

// better

// public class prob11 {
// private static void missreap(int[] arr, int n) {
// int miss = 0;
// int repeating = 0;
// int freq[] = new int[n+1];
// for(int i = 0;i < n;i++)
// freq[arr[i]]++;
// for(int i = 1;i <= n;i++){
// if(freq[i] == 0)
// miss = i;
// if(freq[i] == 2)
// repeating = i;
// }
// System.out.println(miss + " " + repeating);
// }

// public static void main(String[] args) {
// int arr[] = { 3, 1, 2, 5, 3 };
// missreap(arr, arr.length);
// }
// }

// optimal

// public class prob11 {
// private static void missreap(int[] arr, int n) {
// long miss = 0;
// long repeating = 0;
// long sn = (n*(n+1))/2;
// long s2n = (n*(n+1)*(2*n+1))/6;
// long s = 0,s2 = 0;
// for(long x : arr){
// s+=x;
// s2+=(x*x);
// }
// long val1 = s-sn,val2 = s2-s2n;
// val2 = val2/val1;
// miss = (val1+val2)/2;
// repeating = miss-val1;
// System.out.println(miss + " " + repeating);
// }

// public static void main(String[] args) {
// int arr[] = { 3, 1, 2, 5, 3 };
// missreap(arr, arr.length);
// }
// }