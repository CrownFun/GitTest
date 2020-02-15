package strategia;

public class AddCalculator implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
