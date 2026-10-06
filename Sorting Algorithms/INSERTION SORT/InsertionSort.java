//INSERTION SORT
//O(n^2)

public class InsertionSort {

    static int[] insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int prev = i - 1;
            int currValue = arr[i];
            while (currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 6, 5, 7, 8 };
        int res[] = insertionSort(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}