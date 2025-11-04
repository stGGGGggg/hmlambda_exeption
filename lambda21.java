import java.util.stream.IntStream;

public class lambda21 {
    public static void main(String[] args) {
        int start_prime = 100;
        int end_prime = 200;

        int sumOfPrimes = IntStream.rangeClosed(start_prime, end_prime).filter(lambda21::isPrime).sum();
        System.out.println("Sum of prime numbers between " + start_prime + " and " + end_prime + ": " + sumOfPrimes);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
