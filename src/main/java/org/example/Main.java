package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Tom", 1, "Black"))
                .addAnimal(new Horse("John", 10))
                .addAnimal(new Duck("Donald", 5))
                .addAnimal(new Shark("Monster", 16))
                .addAnimal(new Dolphin("Nick", 20))
                .addAnimal(new Sailfish("Schumacher", 30));

        for (Animal an : zoo.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("--------------");
        for (Speakable speak : zoo.getSpeakables()) {
            System.out.println(speak.say());

        }
        for (Runable runner : zoo.getRunner()) {
            System.out.println("Speed of run is " + runner.speedOfRun());

        }
        int max = zoo.getChampionOfRunners();
        System.out.println(String.format("Max of speed in the zoo is %d", max));

        System.out.println("-------------");
        for (Flyable flyer : zoo.getFlyers()) {
            System.out.println("Speed of fly: " + flyer.speedOfFly());

        }
        System.out.println("------------");
        for (Swimmable swimmer : zoo.getSwimmers()) {
            System.out.println("The speed of swimmer is : " + swimmer.speedOfSwimm());
        }
        System.out.println("The max speed of swimmer is: " + zoo.getChampionOfSwimmers());


    }
}
