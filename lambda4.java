import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda4 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        System.out.println("Original numbers:" + nums);

        List evenNumbers = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.print("\nEven numbers:" + evenNumbers);

        List oddNumbers = nums.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.print("\nOdd numbers:" + oddNumbers);

    }
}
