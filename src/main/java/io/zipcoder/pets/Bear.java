package io.zipcoder.pets;

public class Bear extends Pet {
    public Bear(String name, String type) {
        super(name, type);
    }

    public String speak() {
        return "Roar!";
    }
}
