import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class lambda6 {
    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(3.5, 7.2, 1.8, 9.0, 4.6);


        Function<List<Double>, Double> average = list -> {
            double sum = 0;
            for (double num : list) {
                sum += num;
            }
            return list.isEmpty() ? 0 : sum / list.size();
        };

        // Вычисляем среднее и выводим результат
        double result = average.apply(numbers);
        System.out.println("Среднее значение: " + result);
    }
}