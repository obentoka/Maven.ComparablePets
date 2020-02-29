package io.zipcoder.pets;

import java.util.Comparator;

abstract public class Pet implements Comparable<Pet>
{
    String name;
    String type;

    public Pet(String name){
        this.name = name;
    }

    abstract public String speak();

    abstract public String getPet();

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

}