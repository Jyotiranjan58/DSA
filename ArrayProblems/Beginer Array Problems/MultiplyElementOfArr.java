//MULTIPLY EACH ELEMENT IF ARRAY BY 10
//O(n) Timecomplexity

public class MultiplyElementOfArr {

    static int[] multiplyByTen(int[] arr) {
        int size = arr.length;
        int[] res = new int[size];
        for (int i = 0; i < arr.length; i++) {
            res[i] = 10 * arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] result = multiplyByTen(arr);
        for (int num : result) {
            System.out.println(num);
        }
    }

}
