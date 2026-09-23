public class FindUnsortedElement {

    static int findUnsortedElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 3, 7, 8 };
        int res = findUnsortedElement(arr);
        System.out.println(res);
    }
}