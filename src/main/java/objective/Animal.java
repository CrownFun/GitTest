package objective;

import lombok.Data;

@Data
public class Animal implements Canine {


    private String name;
    private float weight;

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I weight " + weight;
    }

    void introduce() {
        System.out.println(toString());
    }


    @Override
    public void bark() {

    }
}
