//  * 5. Print the multiplication table of a given number from n × 1 to n × 10.
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }
}