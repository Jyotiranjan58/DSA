//RETURN SUM OF +VE AND -VE NUMBERS
//O(n)

public class PositiveNegativeSum {

    static int[] getPosNegSum(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveSum += arr[i];
            }
            if (arr[i] < 0) {
                negativeSum += arr[i];
            }
        }
        int[] res = { positiveSum, negativeSum };
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -2, -4, 5, };
        int[] res = getPosNegSum(arr);

        System.out.println("Positive sum = " + res[0]);
        System.out.println("Negative sum = " + res[1]);
    }

}
