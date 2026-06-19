// 8. Calculate the sum of all odd numbers from 1 up to n.

public class q8 {
    public static void main(String[] args) {
        int i = 1;
        int n = 10; 
        int sum = 0;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of all odd numbers from 1 up to " + n + " is: " + sum);
    }
}
