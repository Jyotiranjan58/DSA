// GIVEN AN AN ARRAY OF ONLY 0S AND 1S WRITE A FUNCTION TO SORT THIS ARRAY SO THAT
// ALL 0S ARE PLACED BEFORE ANY 1S
//i.e. input=[1,1,0,0,1,0,0,1,1]
//output=[0,0,0,0,1,1,1,1,1]
//O(n)

public class SortArrOf0sAnd1s {

    static int[] sortArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (j > i) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 0, 1, 1 };
        int[] res = sortArray(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
