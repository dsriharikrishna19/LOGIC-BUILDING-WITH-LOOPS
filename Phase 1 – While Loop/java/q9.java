// 9. Calculate and print the factorial of a given number.

public class q9 {
    public static void main(String[] args) {
        // approach 1: Using while loop
        int n = 5; 
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        // approach 2: Using for loop
        // for (int j = 1; j <= n; j++) {
        //     factorial *= j;
        // }
        // System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
