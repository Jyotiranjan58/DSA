public class FindPivotIndexOfaRotatedArr {

    static int findPivotIndex(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        if (arr[start] < arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= arr[n - 1]) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] rotatedArr = { 50, 60, 70, 10, 20, 30, 40 };
        int res = findPivotIndex(rotatedArr);
        System.out.println(res);
    }
}