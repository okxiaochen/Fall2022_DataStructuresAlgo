package Q1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        RotateArray ra = new RotateArray();
        ra.rotate(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}
