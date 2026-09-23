//SEARCH an ELEMENT IN AN ARRAY (LINEAR SEARCH)
//O(n)

public class SearchAnElementInArray {

    static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int num = 3;
        int res = searchElement(arr, num);
        if (res == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("The element " + num + " is present at index " + res);
        }

    }

}
