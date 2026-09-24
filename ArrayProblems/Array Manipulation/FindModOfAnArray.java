//FIND THE MOD OF AN ARRAY
//i.e FIND THE ELEMENT WHICH OCCURED THE MOST TIMES INA AN ARRAY
//O(n)

import java.util.HashMap;

public class FindModOfAnArray {

    static int getMod(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // checking the key value pairs
        // for (int i : freq.keySet()) {
        // System.out.println(i + "->" + freq.get(i));
        // }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 2, 4, 5, 5, 5, 5, 5, 6, 7, 6, 7, 6, 7 };
        int res = getMod(arr);
        System.out.println(res);
    }
}
