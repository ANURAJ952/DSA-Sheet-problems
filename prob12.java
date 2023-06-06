public class prob12 {
    public static int mergeSort(int[] arr, int[] temp, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, temp, low, mid);
            count += mergeSort(arr, temp, mid + 1, high);
            count += merge(arr, temp, low, mid, high);
        }
        return count;
    }

    private static int merge(int[] arr, int[] temp, int low, int mid, int high) {
        int count = 0;
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        int temp[] = new int[arr.length];
        int count = mergeSort(arr, temp, 0, arr.length - 1);
        System.out.println(count);
    }
}
