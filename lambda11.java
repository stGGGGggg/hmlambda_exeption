import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface TwoIntOperation {
    Integer apply(Integer a, Integer b);
}

public class lambda11 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
        System.out.println("Original values of the said array: " + nums);

        if (nums.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }


        TwoIntOperation maxFunc = (a, b) -> (a > b) ? a : b;
        TwoIntOperation minFunc = (a, b) -> (a < b) ? a : b;

        Integer max = nums.get(0);
        Integer min = nums.get(0);

        for (Integer num : nums) {
            max = maxFunc.apply(max, num);
            min = minFunc.apply(min, num);
        }

        Optional<Integer> maxOpt = Optional.of(max);
        Optional<Integer> minOpt = Optional.of(min);

        System.out.println("Maximum value: " + maxOpt.orElse(null));
        System.out.println("Minimum value: " + minOpt.orElse(null));
    }
}
