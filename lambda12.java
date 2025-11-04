import java.util.Arrays;
import java.util.List;

public class lambda12 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);
        System.out.println("Original array elements: " + nums);

        int result = nums.stream()
                .reduce(1, (x, y) -> x * y)
                .intValue();

        System.out.println("\nProduct of the list elements: " + result);

        int sum = nums.stream()
                .reduce(0, (x, y) -> x + y)
                .intValue();

        System.out.println("\nSum of the list elements: " + sum);
    }
}
