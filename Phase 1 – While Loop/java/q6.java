// * 6. Calculate and print the sum of the first n natural numbers.


public class q6 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int n = 10; 
        // formula for sum of first n natural numbers is n(n+1)/2
        // sum = n * (n + 1) / 2;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
