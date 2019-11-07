package io.zipcoder.polymorphism;

import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class TestPet {

    @Test
    public void TestCatConstructor(){
        Pet pet = new Pet("Henry");

        String expected = "Henry";
        String actual = pet.getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestCatSpeak(){
        Pet pet = new Pet("Henry");

        String expected = null;
        String actual = pet.speak();

        Assert.assertEquals(expected,actual);
    }
}

