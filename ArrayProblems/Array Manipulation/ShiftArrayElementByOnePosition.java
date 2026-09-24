//SHIFT ARRAY ELEMENTS BY ONE POSITION
//O(n)

public class ShiftArrayElementByOnePosition {
    static int[] shiftElementByOnePosi(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] res = shiftElementByOnePosi(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
