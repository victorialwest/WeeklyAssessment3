package com.company.Question_1;

import java.util.Scanner;


public class Dog extends Pets {
    private String name;
    private String furColor;
    private String isTrained;
    private int age;
    private String breed;
    private Scanner input = new Scanner(System.in);

    public Dog() {

    }


    public Dog(String furColor, String isTrained, int age, String breed, String name) {
        this.furColor = furColor;
        this.isTrained = isTrained;
        this.age = age;
        this.breed = breed;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFur(String furColor) {
        this.furColor = furColor;
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Scanner getInput() {
        return input;
    }
}
