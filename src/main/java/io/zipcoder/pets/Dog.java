package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        type = "Dog";
    }

    public String speak() {
        return "Woooof Woof!";
    }

    public String getPet() {
        return type;
    }

    public int compareTo(Pet o) {
        if(o.getName().equalsIgnoreCase(this.getName())){
            int counter = 0;
            boolean isNotEqual = true;
            while (isNotEqual) {
                if (o.getPet().toLowerCase().charAt(counter) >
                        this.getPet().toLowerCase().charAt(counter)) {
                    return -1;
                }
                if (o.getPet().toLowerCase().charAt(counter) <
                        this.getPet().toLowerCase().charAt(counter)) {
                    return 1;
                }
                counter++;
            }
            return 0;
        }else {
            int counter = 0;
            boolean isNotEqual = true;
            while (isNotEqual) {
                if (o.getName().toLowerCase().charAt(counter) >
                        this.getName().toLowerCase().charAt(counter)) {
                    return -1;
                }
                if (o.getName().toLowerCase().charAt(counter) <
                        this.getName().toLowerCase().charAt(counter)) {
                    return 1;
                }
                counter++;
            }
            return 0;
        }
    }
}