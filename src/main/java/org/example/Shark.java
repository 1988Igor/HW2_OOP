package org.example;

public class Shark extends Animal implements Swimmable {

    public Shark(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfSwimm() {
        return 80;
    }

    @Override
    public String say() {
        return "Mute";
    }
}
