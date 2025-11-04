import java.util.Arrays;
import java.util.List;

public class lambda17 {
    public static void main(String[] args) {
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");

        System.out.println("Elements of the list: " + colors);

        int max_length = colors.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println("Length of the longest string: " + max_length);

        int min_length = colors.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println("Length of the smallest string: " + min_length);
    }
}
