package strategia;

public class CalculatorContext {

    private CalculatorStrategy strategy;

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public CalculatorStrategy getStrategy() {
        return strategy;
    }

    public void printResult(int a, int b) {
        System.out.println(strategy.calculate(a, b));
    }

}
