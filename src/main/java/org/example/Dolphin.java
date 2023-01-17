package org.example;

public class Dolphin extends Animal implements Swimmable {

    public Dolphin(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "The fish can not speak";
    }

    @Override
    public String toString(){
        return "Dolphin " + super.toString();
    }
    @Override
    public int speedOfSwimm() {
        return 60;
    }
}
