import java.util.ArrayList;

class isSorted {
    public static boolean isSortedArray(ArrayList<Integer> nums) {
        // your code goes here
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 6; i++)
            nums.add(i);
        System.out.println("Is Sorted Array : " + isSortedArray(nums));
    }
}