import java.util.Arrays;

class rotateArrayByOne {
    public static void rotateByOne(int[] nums) {
        int f = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = f;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        rotateByOne(a);
        System.out.println("Rotate Array by one place : " + Arrays.toString(a));
    }

}