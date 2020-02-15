package objective;

import lombok.Data;

@Data
public class Bear extends Animal {

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return super.toString() +
                " And my fur lengtht is " + furLength;
    }
}
