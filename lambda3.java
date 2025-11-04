import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class lambda3 {
    public static void main(String[] args) {
        List<String> stringsList =Arrays.asList("Red","Green","Blue","PINK");

        stringsList.replaceAll(str ->str.toLowerCase());
        System.out.println("lower: "+stringsList);

        stringsList.replaceAll(str->str.toUpperCase());
        System.out.println("upper:"+stringsList);
    }
}
