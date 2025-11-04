import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class lambda22 {
    public static void main(String[] args) {
        List < String > strings = Arrays.asList("Java", "JAVA", "java");
        System.out.println("Array elements: " + strings);

        boolean isAllUppercase = checkCase(strings, s -> s.equals(s.toUpperCase()), String::toUpperCase);
        System.out.println("Is all uppercase? " + isAllUppercase);


        boolean isAllLowercase = checkCase(strings, s -> s.equals(s.toLowerCase()), String::toLowerCase);
        System.out.println("Is all lowercase? " + isAllLowercase);


        boolean isMixedCase = !isAllUppercase && !isAllLowercase;
        System.out.println("Is mixed case? " + isMixedCase);

        List < String > strings1 = Arrays.asList("JAVA", "PYTHON", "ABC");
        System.out.println("Array elements: " + strings1);

        isAllUppercase = checkCase(strings1, s -> s.equals(s.toUpperCase()), String::toUpperCase);
        System.out.println("Is all uppercase? " + isAllUppercase);

        isAllLowercase = checkCase(strings1, s -> s.equals(s.toLowerCase()), String::toLowerCase);
        System.out.println("Is all lowercase? " + isAllLowercase);


        isMixedCase = !isAllUppercase && !isAllLowercase;
        System.out.println("Is mixed case? " + isMixedCase);

        List < String > strings2 = Arrays.asList("java");
        System.out.println("Array elements: " + strings2);

        isAllUppercase = checkCase(strings2, s -> s.equals(s.toUpperCase()), String::toUpperCase);
        System.out.println("Is all uppercase? " + isAllUppercase);

        isAllLowercase = checkCase(strings2, s -> s.equals(s.toLowerCase()), String::toLowerCase);
        System.out.println("Is all lowercase? " + isAllLowercase);

        isMixedCase = !isAllUppercase && !isAllLowercase;
        System.out.println("Is mixed case? " + isMixedCase);

    }
    public static boolean checkCase(List < String > strings, Predicate < String > checkFunction, Function < String, String > convertFunction) {
        String firstString = strings.get(0);
        String convertedString = convertFunction.apply(firstString);

        return strings.stream().allMatch(s -> checkFunction.test(s));
    }
}
