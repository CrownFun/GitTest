package objective;

public class Dog extends Animal implements Canine {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    void sitPretty() {
        System.out.println(getName() + " sits pretty");
    }


}
