package io.zipcoder;


import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class Application implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        if(o1.getPet().equalsIgnoreCase(o2.getPet())){
            int counter = 0;
            boolean isNotEqual = true;
            while (isNotEqual){
                if (o1.getName().toLowerCase().charAt(counter) <
                        o2.getName().toLowerCase().charAt(counter)){
                    return -1;
                }
                if (o1.getName().toLowerCase().charAt(counter) >
                        o2.getName().toLowerCase().charAt(counter)){
                    return 1;
                }
                counter++;
            }
            return 0;

        }else {
            int counter = 0;
            boolean isNotEqual = true;
            while (isNotEqual){
                if (o1.getPet().toLowerCase().charAt(counter) <
                    o2.getPet().toLowerCase().charAt(counter)){
                    return -1;
                }
                if (o1.getPet().toLowerCase().charAt(counter) >
                        o2.getPet().toLowerCase().charAt(counter)){
                    return 1;
                }
                counter++;
            }
            return 0;
        }
    }
}
