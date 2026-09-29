import java.util.ArrayList;
import java.util.List;

public class MissingElementFromArrayWithDuplicates {
    static List<Integer> getMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            int value = Math.abs(nums[index]);
            int position = value - 1;
            // Markiing Positions
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }
        // Traversing and adding positive number index to the res list
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 14, 10, 7, 14, 1, 8, 1, 12, 11, 1, 5, 1, 11, 2, 12 };
        List<Integer> res = getMissingElements(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
