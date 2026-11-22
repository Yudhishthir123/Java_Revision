import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Highest_Lowest_freq {
    static int[] getHighestLowestFreq(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > highestFreq) {
                highestFreq = count;
                highestNum = num;
            }
            if (count < lowestFreq) {
                lowestFreq = count;
                lowestNum = num;
            }
        }

        return new int[]{highestNum, lowestNum};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 6, 5, 4, 5, 7, 5, 8, 4, 5, 5, 4};
        System.out.println(Arrays.toString(getHighestLowestFreq(arr)));
    }
}
