public class Main {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) return false; // 0 and 1 are not primes
        if (n <= 3) return true; // 2 and 3 are primes
        if (n % 2 == 0 || n % 3 == 0) return false; // Divisible by 2 or 3

        // Check divisors from 5 to √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to generate prime numbers up to a given limit
    public static void generatePrimes(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Example usage
        int numberToCheck = 29; // Replace with any number to check for primality
        int limit = 100; // Replace with the limit to generate prime numbers

        // Check if a number is prime
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }

        // Generate primes up to a limit
        generatePrimes(limit);
    }
}
