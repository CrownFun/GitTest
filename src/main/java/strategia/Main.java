package strategia;

public class Main {
    public static void main(String[] args) {

        CalculatorContext calculatorContext = new CalculatorContext();
        calculatorContext.setStrategy(new AddCalculator());
        int calculate = calculatorContext.getStrategy().calculate(8, 7);
        System.out.println(calculate);

    }
}
