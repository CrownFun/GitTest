package strategia;

public class SubtractCalulator implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
