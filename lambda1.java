interface sumCalculator{
    int sum(int a, int b);
}

public class lambda1 {
    public static void main(String[] args) {
        sumCalculator sumcalculator = (x,y)-> x+y;
        int result  = sumcalculator.sum(7,6);
        System.out.println("result (7,6): "+ result);
    }
}