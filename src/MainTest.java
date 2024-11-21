import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void isPrime() {
        // Test known primes
        assertTrue(Main.isPrime(2));
        assertTrue(Main.isPrime(3));
        assertTrue(Main.isPrime(17));
        assertTrue(Main.isPrime(97));

        // Test non-primes
        assertFalse(Main.isPrime(0));
        assertFalse(Main.isPrime(1));
        assertFalse(Main.isPrime(4));
        assertFalse(Main.isPrime(100));
    }

    @Test
    public void generatePrimes() {
        // Capture the output of generatePrimes for verification
        int limit = 10;
        String expectedOutput = "2 3 5 7 ";

        // Redirect output stream for testing
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Call the method
        Main.generatePrimes(limit);

        // Restore original output stream
        System.setOut(System.out);

        // Assert the output matches expected
        assertEquals("Prime numbers up to 10:\n" + expectedOutput + "\n", outContent.toString());
    }
}
