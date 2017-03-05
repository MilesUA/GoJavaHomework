package com.YegorovOleksiy.practice.modul03.task01;

/**
 * Created by Miles on 02.03.2017.
 */
public class Bird {


    public static void main(String[] args) {

        Bird birdVoody = new Bird("Voody");
        birdVoody.sing();

        Bird bird = new Bird();
        bird.sing();

    }

    private void sing() {
        if (Bird.this.name == null){
            System.out.println(Bird.this.singing);
        }

        System.out.println("I am " + Bird.this.name + "\n" + Bird.this.singing);

    }

    private String name;
    private final String singing = "I am walking\n" +
            "I am flying\n" +
            "I am singing\n" +
            "I am Bird";

    public Bird(String name) {
        this.name = name;
    }

    public Bird() {
    }


}
