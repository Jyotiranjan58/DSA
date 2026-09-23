public class GetLastSetBit {
    public static void main(String[] args) {
        int n = 10; // 00001010
        int res = n & (n); // last bit stays as it is and everything else is 0
        // res=00000010
        System.out.println(res);
    }
}
