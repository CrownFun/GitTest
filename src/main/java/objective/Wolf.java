package objective;

import lombok.Data;

@Data
public class Wolf extends Animal implements Canine {

    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                " And my fang length is " + fangLength;
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }
}
