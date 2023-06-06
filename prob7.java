// rotate arr by 90'

// brute force

// public class prob7 {
//     private static void rotate(int[][] arr) {
//         int r = arr.length;
//         int c = arr[0].length;
//         int ans[][] = new int[r][c];
//         for(int i = 0;i < r;i++){
//             for(int j = 0;j < c;j++){
//                  ans[j][c-i-1] = arr[i][j];
//             }
//         }
//         for(int i = 0;i < r;i++){
//             for(int j = 0;j < c;j++){
//                   arr[i][j] = ans[i][j];
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[][] = {{2,6,4,5},
//                        {3,5,6,4},
//                        {4,6,8,3},
//                        {3,6,8,3} };
//             rotate(arr);
//     }
// }

// optimal

public class prob7 {
    private static void rotate(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < r; i++) {
            for(int j = 0;j < c/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][c-j-1        ];
                arr[i][c-j-1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 6, 4, 5 },
                        { 3, 5, 6, 4 },
                        { 4, 6, 8, 3 },
                        { 3, 6, 8, 3 } };
        rotate(arr);
    }
}