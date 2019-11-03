package io.zipcoder.pets;

public class Dog extends Pet{
    public Dog(String name, String type) {
        super(name, type);
    }
    public String speak() {
        return "Bark!";
    }
}
