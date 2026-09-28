import java.util.HashMap;

public class FindFirstRepeatingElement {

    static int findForstRepeatingElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : nums) {
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3 };
        System.out.println(findForstRepeatingElement(arr));
    }

}
