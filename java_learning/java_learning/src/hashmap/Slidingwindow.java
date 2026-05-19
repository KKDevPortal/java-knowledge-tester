package hashmap;

import java.util.Arrays;

public class Slidingwindow {

        public static void main(String[] args) {

            int[] nums = {1,-1,3,3,4,1,5,6,7,-2,-5,1};
            int k = 7;
            int combinations = nums.length - k + 1; // wrong impl

            System.out.println("Combinations: " + combinations);
            int[] sums = new int[combinations];

            int maxSum = Integer.MIN_VALUE;

            // starting index of subarray
            for (int i = 0; i <= nums.length - k; i++) {

                int currentSum = 0;

                // calculate sum of k elements
                for (int j = i; j < i + k; j++) {
                    currentSum += nums[j];
                }

                maxSum = Math.max(maxSum, currentSum);
                sums[i] = maxSum;
            }

            System.out.println("Maximum Sum = " + maxSum);
            System.out.println(Arrays.toString(sums));
        }

}
