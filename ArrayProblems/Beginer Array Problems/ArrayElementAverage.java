//FIND THE AVERAGE OF ARRAY ELEMENTS

//O(n) time complexity

public class ArrayElementAverage {
    static double getAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        int size = arr.length;
        double avg = (double) sum / size; // type casting to double
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(getAverage(arr));
    }
}
