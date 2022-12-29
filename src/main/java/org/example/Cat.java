package org.example;

public class Cat {
    public void chout () {
        System.out.println(name + ": Мяу!");
    }
    public void food (int x) {
        weight = x + weight;
        System.out.println(name + ": Я поел корм:" + weight);
    }
    public void poo (int y) {
        weight = weight - y;
        System.out.println(name + ": Я сделяль:" + weight);
    }
    public int weight;
    public String name;
}
