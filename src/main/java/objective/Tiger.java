package objective;

import lombok.Data;

@Data
public class Tiger extends Animal {

    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                " And my claw lentght is " + clawLength;

    }
}
