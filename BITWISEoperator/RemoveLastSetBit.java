public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 10; // binary AND
        int res = n & (n - 1); // removes the last set bit of the number n
        System.out.println(res); // prints the result after the bit is removed and replaced with 0
    }
}
