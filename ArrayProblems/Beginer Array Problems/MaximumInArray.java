//FIND THE MAXIMUM ELEMENT IN THE ARRAY
//O(n)

public class MaximumInArray {

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 0, 10 };
        System.out.println(findMax(arr));
    }
}
