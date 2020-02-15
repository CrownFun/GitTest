package strategia;

public class DivideCalculator implements CalculatorStrategy {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
