package io.zipcoder.polymorphism;

public class Rabbit extends Pet {
    public Rabbit(String name) {
        super(name);
    }

    public String speak() {
        return "Roar!";
    }
}
