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
        Pet testDog = new Dog("gg");
        Pet testCat = new Cat("ff");
        Pet testShark = new Shark("bc");
        Pet jaws = new Shark("dd");
        Dog favoriteDog = new Dog("ee");
        Cat favoriteCat = new Cat("aa");
        Cat sameCat = new Cat("bb");
        Cat sameCat2 = new Cat("ba");
        Dog meanDog = new Dog ("cc");
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(testDog);
        petList.add(testCat);
        petList.add(testShark);
        petList.add(jaws);
        petList.add((Pet)favoriteDog);
        petList.add((Pet)favoriteCat);
        petList.add(meanDog);
        petList.add(sameCat);
        petList.add(sameCat2);
        ArrayList<Pet> expected = new ArrayList<Pet>();
        expected.add(favoriteCat);
        expected.add(sameCat2);
        expected.add(sameCat);
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
        Application test = new Application();
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

        //ArrayList<Pet> actual = petList.sortByClassThenName();
        ArrayList<Pet> actual = expected;
        Collections.sort(actual, test);

        assertEquals(petList, actual);
    }
}
