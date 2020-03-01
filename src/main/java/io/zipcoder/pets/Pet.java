package io.zipcoder.pets;

abstract public class Pet implements Comparable<Pet>
{
    String name;

    public Pet(String name){
        this.name = name;
    }

    abstract public String speak();

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Pet o) {
        return this.name.compareTo(o.getName());
    }
}