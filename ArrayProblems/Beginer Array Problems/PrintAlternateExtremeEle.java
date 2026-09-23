public class PrintAlternateExtremeEle {

    static int[] alternateElement(int[] arr) {
        int size = arr.length;
        int[] alteredArr = new int[size];
        int start = 0;
        int end = size - 1;
        int index = 0;
        while (start <= end) {
            if (start <= end) {
                alteredArr[index++] = arr[start++];
            }
            if (start <= end) {
                alteredArr[index++] = arr[end--];
            }
        }
        return alteredArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        int[] res = alternateElement(arr);
        System.out.print("[");
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

}
