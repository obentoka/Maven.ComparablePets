package io.zipcoder.pets;

public class Shark extends Pet {


    public Shark(String name) {
        super(name);
        type = "Shark";
    }

    public String speak() {
        return "Chomp!";
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