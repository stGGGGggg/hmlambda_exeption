interface StringOperation {
    String apply(String str1, String str2);
}

public class lambda10 {
    public static void main(String[] args) {

        StringOperation concatenate = (str1, str2) -> str1 + str2;

        String string1 = "Good ";
        String string2 = "Morning!";
        System.out.println("Original strings: " + string1 + ", " + string2);

        String result = concatenate.apply(string1, string2);

        System.out.println("Concatenated string: " + result);
    }
}
