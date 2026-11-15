public class SearchInaRotatedSortedArr {

    static int pivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        if (arr[s] < arr[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target) {
        int pivotIndex = pivotIndex(arr);
        int n = arr.length;

        if (pivotIndex == -1) {
            int ans = binarySearch(arr, 0, n - 1, target);
            return ans;
        } else {
            // left array search
            int arr1Start = 0;
            int arr1End = pivotIndex;
            if (target >= arr[arr1Start] && target <= arr[arr1End]) {
                int ans = binarySearch(arr, arr1Start, arr1End, target);
                return ans;
            }

            // right array search
            int arr2Start = pivotIndex + 1;
            int arr2End = n - 1;
            if (target >= arr[arr2Start] && target <= arr[arr2End]) {
                int ans = binarySearch(arr, arr2Start, arr2End, target);
                return ans;
            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 8, 1, 2 };
        int target = 1;

        int ans = search(arr, target);
        System.out.println(ans);

    }
}
