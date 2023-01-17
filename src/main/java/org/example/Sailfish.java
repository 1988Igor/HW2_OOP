package org.example;

public class Sailfish extends Animal implements Swimmable{
    @Override
    public int speedOfSwimm() {
        return 109;
    }

    public Sailfish(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "The fish can not speak";
    }

    @Override
    public String toString(){
        return "Sailfish " + super.toString();
    }
}
