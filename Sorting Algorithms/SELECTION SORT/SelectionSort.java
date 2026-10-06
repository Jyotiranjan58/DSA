//SELECTION SORT
//O(n^2)

public class SelectionSort {

    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIDX = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIDX]) {
                    minIDX = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIDX];
            arr[minIDX] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 1, 3 };
        int[] res = selectionSort(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
