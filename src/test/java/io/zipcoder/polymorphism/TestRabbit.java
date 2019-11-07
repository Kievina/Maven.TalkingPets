package io.zipcoder.polymorphism;

import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Rabbit;
import org.junit.Assert;
import org.junit.Test;

public class TestRabbit extends TestPet {
    @Test
    public void TestCatConstructor(){
        Rabbit rabbit = new Rabbit("Henry");

        String expected = "Henry";
        String actual = rabbit.getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestCatSpeak(){
        Rabbit rabbit = new Rabbit("Henry");

        String expected = "Bark!";
        String actual = rabbit.speak();

        Assert.assertEquals(expected,actual);
    }
}
