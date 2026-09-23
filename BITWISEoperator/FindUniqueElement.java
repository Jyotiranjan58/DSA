public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 15, 10, 20, 30, 40 };
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}