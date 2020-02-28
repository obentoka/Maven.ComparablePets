package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Woooof Woof!";
    }

    public String getPet() {
        return "Dog";
    }
}