package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Shark;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ApplicationTest
{
    @Test
    public void comparingPets()
    {
        Pet testDog = new Dog("g");
        Pet testCat = new Cat("f");
        Pet testShark = new Shark("b");
        Pet jaws = new Shark("d");
        Dog favoriteDog = new Dog("e");
        Cat favoriteCat = new Cat("a");
        Dog meanDog = new Dog ("c");
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(testDog);
        petList.add(testCat);
        petList.add(testShark);
        petList.add(jaws);
        petList.add((Pet)favoriteDog);
        petList.add((Pet)favoriteCat);
        petList.add(meanDog);
        ArrayList<Pet> expected = new ArrayList<Pet>();
        expected.add(favoriteCat);
        expected.add(testShark);
        expected.add(meanDog);
        expected.add(jaws);
        expected.add(favoriteDog);
        expected.add(testCat);
        expected.add(testDog);

        Collections.sort(petList);

        assertEquals(expected, petList);
    }

    @Test
    public void comparatoringPets()
    {
        Pet testDog = new Dog("d");
        Pet testCat = new Cat("b");
        Pet testShark = new Shark("f");
        Pet jaws = new Shark("g");
        Dog favoriteDog = new Dog("c");
        Cat favoriteCat = new Cat("a");
        Dog meanDog = new Dog ("e");
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(favoriteCat);
        petList.add(testCat);
        petList.add(favoriteDog);
        petList.add(testDog);
        petList.add(meanDog);
        petList.add(testShark);
        petList.add(jaws);
        ArrayList<Pet> expected = new ArrayList<Pet>();
        expected.add(favoriteCat);
        expected.add(testShark);
        expected.add(meanDog);
        expected.add(jaws);
        expected.add(favoriteDog);
        expected.add(testCat);
        expected.add(testDog);

        ArrayList<Pet> actual = petList.sortByClassThenName();

        assertEquals(expected, actual);
    }
}
