//COUNT THE NUMBER OF ZEROES AND ONES
//O(n)

public class CountZeroesAndOnes {

    static int[] countZeroAndOne(int[] arr) {
        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
            if (arr[i] == 1) {
                ones++;
            }
        }
        int[] res = { zeroes, ones };
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 1, 0, 0 };
        int[] res = countZeroAndOne(arr);
        System.out.println("Number of Zeroes : " + res[0]);
        System.out.println("Number of Ones : " + res[1]);
    }
}
