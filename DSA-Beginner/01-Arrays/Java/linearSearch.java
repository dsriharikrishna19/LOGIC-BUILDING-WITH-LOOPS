public class linearSearch {
    public static int search(int nums[], int target) {
        // Your code goes here
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Linear Search : " + search(a, 5));
    }
}
