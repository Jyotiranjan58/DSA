/*
O(nlogM)
*/

public class EKO_SPOJ {
    static boolean isValidAns(int[] trees, int m, int mid) {

        long total = 0;

        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                total = total + (trees[i] - mid);
            }
        }
        if (total >= m) {
            return true;
        }
        return false;
    }

    static int maxSawHeight(int[] trees, int m) {
        int n = trees.length;
        int s = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }
        int e = maxi;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(trees, m, mid)) {
                ans = mid;
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 42, 40, 26, 46 };
        System.out.println(maxSawHeight(arr, 20));
    }
}
