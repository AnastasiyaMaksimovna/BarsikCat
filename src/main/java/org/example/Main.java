package org.example;

public class Main {
    public static void main(String[] args) {
        Cat black = new Cat();
        Cat white = new Cat();
        black.name = "Barsik";
        white.name = "Marsik";
        black.weight = 1400;
        white.weight = 1300;
        white.chout();
        black.chout();
        black.food(15);
        white.poo(10);


    }
}