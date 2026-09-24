import java.util.HashSet;

public class ArrayUnion {

    static HashSet<Integer> findUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        return set;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };

        System.out.println(findUnion(arr1, arr2));
    }
}