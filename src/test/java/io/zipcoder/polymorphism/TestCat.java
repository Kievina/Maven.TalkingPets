package io.zipcoder.polymorphism;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class TestCat extends TestPet {
  @Test
    public void TestCatConstructor(){
    Cat cat = new Cat("Henry");

    String expected = "Henry";
    String actual = cat.getName();

    Assert.assertEquals(expected,actual);
  }
  @Test
  public void TestCatSpeak(){
    Cat cat = new Cat("Henry");

    String expected = "Meow!";
    String actual = cat.speak();

    Assert.assertEquals(expected,actual);
  }
}
