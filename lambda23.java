import java.util.Arrays;
import java.util.List;

public class lambda23 {
    public static void main(String[] args) {
        List <String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");
        System.out.println("List of colors: " + colors);

        double averageLength = calculateAverageLength(colors);
        System.out.println("Average length of colors(strings): " + averageLength);
    }

    public static double calculateAverageLength(List < String > strings) {
        return strings.stream().mapToInt(String::length).average().orElse(0);
    }
}
