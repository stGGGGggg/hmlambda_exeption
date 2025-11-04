import java.util.Arrays;
import java.util.List;

public class lambda5 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        System.out.println("Sorted strings:" + colors);

    }
}