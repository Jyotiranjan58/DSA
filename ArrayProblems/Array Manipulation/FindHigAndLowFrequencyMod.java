import java.util.HashMap;

public class FindHigAndLowFrequencyMod {
    static int[] getMinMaxFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentkey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentkey;
            }

        }
        int minFreq = Integer.MAX_VALUE;
        int minFreqKey = -1;
        for (int key : arr) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq < minFreq) {
                minFreq = currentKeyFreq;
                minFreqKey = currentKey;
            }
        }
        int[] res = { maxFreqKey, minFreqKey };

        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5 };
        int res[] = getMinMaxFrequency(arr);
        System.out.println("Highest Frequency Key : " + res[0]);
        System.out.println("Lowest Frequency Key : " + res[1]);
    }

}
