import java.util.Arrays;

class Largest {

    // Brute Force Approach
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public static int largestElementBruteForce(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    // Optimal Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int largestElement(int[] nums) {

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {3, 5, 3, 5, 3, 5, 3, 5, 3, 5};

        System.out.println("Array : " + Arrays.toString(nums));

        System.out.println(
                "Brute Force (O(n log n)) : "
                        + largestElementBruteForce(nums.clone()));

        System.out.println(
                "Optimal (O(n)) : "
                        + largestElement(nums));
    }
}