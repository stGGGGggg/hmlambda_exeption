import java.util.function.Function;

public class lambda25 {
    public static void main(String[] args) {
        int n = 33;
        System.out.println("Number: " + n);

        Function < Integer, String > convertToBinary = num -> Integer.toBinaryString(num);
        String binaryRepresentation = convertToBinary.apply(n);
        System.out.println("Binary representation: " + binaryRepresentation);
        n = 747;
        System.out.println("Number: " + n);
        convertToBinary = num -> Integer.toBinaryString(num);
        binaryRepresentation = convertToBinary.apply(n);
        System.out.println("Binary representation: " + binaryRepresentation);
    }
}
