/**
 * setMatrixtoZero
 */
/**
 * InnersetMatrixtoZero
 */
public class setmatrixtozero1 {
    private static void fun(int[][] arr, int r, int c) {
        int temp[][] = new int[r][c];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(arr[i][j] == 0){
                    for(int k = 0;k < c;k++)
                       temp[i][k] = 1;
                    for(int k = 0;k < c;k++)
                       temp[k][j] = 1;
                }
            }
        }
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(temp[i][j] == 1)
                 arr[i][j] = 0;
            }
        }
           
    }
  
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, 
                        { 4, 0, 6 },
                        { 3, 2, 0 } };
        int r = arr.length;
        int c = arr[0].length;
        fun(arr,r,c);
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}

// better force
// public class setMatrixtoZero {

//     private static void fun(int[][] arr,int r,int c) {
        
//         int row[] = new int[r];
//         int col[] = new int[c];
//         for(int i = 0;i < r;i++){
//             for(int j = 0;j < c;j++){
//                if(arr[i][j] == 0){
//                 row[i] = 1;
//                 col[j] = 1;
//                }
//             }
//         }
//         for(int i = 0;i < r;i++){
//             for(int j = 0;j < c;j++){
//                if( row[i] == 1 || col[j] == 1){
//                 arr[i][j] = 0;
//                }
//             }
//         }
        
//     }

//     public static void main(String[] args) {
//         int arr[][] = { { 1, 2, 3 }, 
//                         { 4, 0, 6 },
//                         { 3, 2, 0 } };
//         int r = arr.length;
//         int c = arr[0].length;
//         fun(arr,r,c);
//         for(int i = 0;i < r;i++){
//             for(int j = 0;j < c;j++){
//               System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

// }
