public class FinfUniqueElement {

    static int findUniqueElement(int[] arr) {
        int xorSum = 0;
        for (int i : arr) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 3, 4, 5 };
        int res = findUniqueElement(arr);
        System.out.println(res);
    }
}
