package io.zipcoder.pets;

public class Shark extends Pet {

    public Shark(String name) {
        super(name);
    }

    public String speak() {
        return "Chomp!";
    }

    public String getPet() {
        return "Shark";
    }
}