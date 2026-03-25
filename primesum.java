import java.util.*;

public class primesum {

    private static int primeSum(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i++) {   
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        System.out.println("Sum of primes less than " + n + " = " + primeSum(n));
    }
}