package org.example;

public class Duck extends Animal implements Runable, Flyable {
    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Mac Mac";
    }

    @Override
    public String toString(){
        return "Duck " + super.toString();
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }
}
