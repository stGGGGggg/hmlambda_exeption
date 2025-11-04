import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda7 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);

        System.out.println("List elements: " + nums);

        List<Integer> unique_nums = new ArrayList<>();


        for (Integer num : nums) {
            if (!unique_nums.contains(num)) {
                unique_nums.add(num);
            }
        }

        System.out.println("\nList elements without duplicates: " + unique_nums);
    }
}
