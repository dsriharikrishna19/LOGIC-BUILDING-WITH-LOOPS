class secondlargest {

    public static int secondLargestElement(int[] nums) {

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
            } 
            else if (nums[i] > m2 && nums[i] != m1) {
                m2 = nums[i];
            }
        }

        return (m2 == Integer.MIN_VALUE) ? -1 : m2;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Second Largest Element " + secondLargestElement(a));
    }
}