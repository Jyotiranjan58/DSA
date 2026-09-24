public class ShiftArrayElementByKposition {
    static int[] shiftByKPosition(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        int index = 0;
        for (int i = n - k; i < n; i++) {
            temp[index++] = arr[i];
        }
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 5;
        int[] res = shiftByKPosition(arr, k);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
