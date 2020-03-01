package io.zipcoder;


import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class SortType implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        if(o1.getClass().getName().equalsIgnoreCase(o2.getClass().getName())){
            return o1.getName().compareTo(o2.getName());

        }else {
            System.out.println(o1.getClass().getName());
            return o1.getClass().getName().compareTo(o2.getClass().getName());
        }
    }
}
