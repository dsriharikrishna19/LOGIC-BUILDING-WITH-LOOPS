//  * 10. Find and print the product of all digits of a given number.

public class q10 {
    public static void main(String[] args) {
        int n = 1234; // Example number
        int p = 1;
        int temp = n;
        while (temp > 0) {
            p = p* temp % 10;
            temp /= 10;
        }
        System.out.println("Product of digits of " + n + " is: " + p);
    }
}
