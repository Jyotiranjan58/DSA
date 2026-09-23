public class FindTwoUniqueNums {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 3 };
        int xor = 0;
        for (int num : arr) {
            xor = xor ^ num;
        }
        int setBit = xor & (-xor);

        int num1 = 0;
        int num2 = 0;

        for (int num : arr) {
            if ((num & setBit) != 0) {
                num1 = num1 ^ num;
            } else {
                num2 = num2 ^ num;
            }
        }
        System.out.println(num1 + "," + num2);

    }
}
