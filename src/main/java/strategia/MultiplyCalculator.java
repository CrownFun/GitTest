package strategia;

public class MultiplyCalculator implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
