import java.util.Arrays;
import java.util.Comparator;

public class lambda19 {
    public static void main(String[] args) {
        Integer[] nums = {1,7,18,25,77,300,101};
        System.out.println("Array elements: " + Arrays.toString(nums));

        Integer secondLargest = Arrays.stream(nums).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        Integer secondSmallest = Arrays.stream(nums).distinct().sorted().skip(1).findFirst().orElse(null);


        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}
