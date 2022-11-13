import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 5, 5, 5, 8, 9, 10, 11};
        int[] value = {1, 4, 5, 10};
        System.out.println(Arrays.toString(getStartOfEachValues(arr, value)));
    }

    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 11, 16]
    // time complexity: O(N) N means the length of the arr
    // space complexity: O(N)
    private static int[] getStartOfEachValues(int[] arr, int[] values) {
        int[] indexes = new int[values.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            hm.put(arr[i], i);
        }
        for (int i = 0; i < values.length; i++) {
            int idx = -1;
            if (hm.get(values[i]) != null) {
                idx = hm.get(values[i]);
            }
            indexes[i] = idx;
        }
        return indexes;
    }
}