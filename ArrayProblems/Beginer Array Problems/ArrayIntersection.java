public class ArrayIntersection {

    static int[] arrayIntersection(int[] arr1, int[] arr2) {
        int[] res = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == num) {
                    res[index] = num;
                    index++;
                    break;
                }
            }
        }
        int[] result = new int[index];

        for (int i = 0; i < index; i++) {
            result[i] = res[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7 };
        int[] res = arrayIntersection(arr1, arr2);
        System.out.print("[ ");
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}