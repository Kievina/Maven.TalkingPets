package io.zipcoder.polymorphism;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class TestDog extends TestPet {
    @Test
    public void TestCatConstructor(){
        Dog dog = new Dog("Henry");

        String expected = "Henry";
        String actual = dog.getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestCatSpeak(){
        Dog dog = new Dog("Henry");

        String expected = "Bark!";
        String actual = dog.speak();

        Assert.assertEquals(expected,actual);
    }

}
