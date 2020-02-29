package io.zipcoder.pets;

public class Cat extends Pet

{
    public Cat(String name) {
        super(name);
        type = "Cat";
    }
    public String speak() {
        return "Meow~";
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