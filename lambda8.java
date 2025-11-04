import java.util.function.LongUnaryOperator;

public class lambda8 {
    public static void main(String[] args) {
        LongUnaryOperator factorial = n -> {long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };


        long n = 7;
        long factorial_result = factorial.applyAsLong(n);


        System.out.println("Factorial of " + n + " is: " + factorial_result);
    }
}
