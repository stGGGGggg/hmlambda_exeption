import java.util.function.Predicate;

public class lambda14 {
    public static void main(String[] args) {
        Predicate < String > isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        String word1 = "Madam";
        boolean isPalindromeResult1 = isPalindrome.test(word1);
        System.out.println(word1 + " is a palindrome? " + isPalindromeResult1);

        String word2 = "radar";
        isPalindromeResult1 = isPalindrome.test(word2);
        System.out.println(word2 + " is a palindrome? " + isPalindromeResult1);

        String word3 = "defied";
        isPalindromeResult1 = isPalindrome.test(word3);
        System.out.println(word3 + " is a palindrome? " + isPalindromeResult1);
    }
}
