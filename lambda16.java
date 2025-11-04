import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class lambda16 {
    public static void main(String[] args) {
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        String searchColor = "Orange";

        Predicate < String > containsWord = word -> word.equals(searchColor);
        boolean flag = colors.stream().anyMatch(containsWord);

        System.out.println("Is the word " + searchColor + " present in the list? " + flag);

        String searchColor1 = "White";

        Predicate < String > containsWord1 = word -> word.equals(searchColor1);
        flag = colors.stream().anyMatch(containsWord1);

        System.out.println("\nIs the word " + searchColor1 + " present in the list? " + flag);
    }
}
