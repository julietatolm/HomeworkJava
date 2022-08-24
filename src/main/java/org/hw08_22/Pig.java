package org.hw08_22;

public class Pig {
    int id;
    int age;
    String name;
    String breed;

    Pig(int id, String name) {
        this.name = name;
        this.id = id;
    }

    Pig(int id, String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.id = id;
    }

    Pig(int id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void say() {
        System.out.println("Hriu");
    }

    public void printObject() {
        System.out.println("Pig Id");
        System.out.println(this.id);
        System.out.println("Pig name");
        System.out.println(this.name);
        System.out.println("Pig Breed");
        System.out.println(this.breed);
        System.out.println("Pig age");
        System.out.println(this.age);

    }
}
