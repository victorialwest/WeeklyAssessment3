package com.company.Question_1;

import java.util.Scanner;

public class Rabbit extends Dog {
    private String name;
    private String furColor;
    private int age;
    private String breed;
    private Scanner input = new Scanner(System.in);


    public Rabbit() {
    }

    public Rabbit(String furColor, int age, String breed, String name) {
        this.furColor = furColor;
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}

