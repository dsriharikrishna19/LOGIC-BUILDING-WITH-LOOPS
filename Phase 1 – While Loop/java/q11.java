//  * 11. Count and print the total number of digits in a given number.

public class q11 {
    public static void main(String[] args) {
        int n = 1234; // Example number
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Total number of digits in " + n + " is: " + count);
    }
    
}