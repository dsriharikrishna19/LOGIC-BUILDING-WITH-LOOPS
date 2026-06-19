// 7. Calculate the sum of all even numbers from 1 up to n.

public class q7 {
    public static void main(String[] args) {
        int i = 1;
        int n = 10; 
        int sum = 0;
        // formula for sum of first n natural numbers is n(n+1)/2
        // sum = n * (n + 1) / 2;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of all even numbers from 1 up to " + n + " is: " + sum);
    }
}
