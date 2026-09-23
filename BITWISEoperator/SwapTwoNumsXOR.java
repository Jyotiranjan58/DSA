public class SwapTwoNumsXOR {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 6;
        num1 = num1 ^ num2; // (7^6)
        num2 = num1 ^ num2; // (7^6)^6
        num1 = num1 ^ num2; // (7^6)^(7^6)^6
        System.out.println(num1 + "" + num2);
    }
}