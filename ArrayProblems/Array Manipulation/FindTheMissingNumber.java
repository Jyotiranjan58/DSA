public class FindTheMissingNumber {

    static int findMissingNum(int[] arr) {
        int xorSum = 0;
        int range = arr.length;
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        for (int i = 0; i <= range; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 1, 0, 3, 4 };
        int res = findMissingNum(arr);
        System.out.println(res);

    }
}
