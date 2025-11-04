import java.util.function.Predicate;

public class lambda18 {
    public static void main(String[] args) {
        Predicate < Integer > isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        int N = 36;
        boolean result1 = isPerfectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result1);

        N = 26;
        boolean result2 = isPerfectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result2);

        N = 10000;
        boolean result3 = isPerfectSquare.test(N);
        System.out.println(N + " is a perfect square? " + result3);
    }
}
