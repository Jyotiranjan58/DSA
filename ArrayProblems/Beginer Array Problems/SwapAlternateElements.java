public class SwapAlternateElements {

    static int[] swapAlternateElements(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] res = swapAlternateElements(arr);
        System.out.print("[ ");
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    }

}
