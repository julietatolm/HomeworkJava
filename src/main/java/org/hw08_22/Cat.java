package org.hw08_22;

public class Cat {
    int id;
    int age;
    String name;
    String breed;

    Cat(int id, String name) {
        this.name = name;
        this.id = id;
    }

    Cat(int id, String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.id = id;
    }

    Cat(int id, String name, int age) {
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
        System.out.println("Miay");
    }

    public void printObject() {
        System.out.println("Cat Id");
        System.out.println(this.id);
        System.out.println("Cat name");
        System.out.println(this.name);
        System.out.println("Cat Breed");
        System.out.println(this.breed);
        System.out.println("Cat age");
        System.out.println(this.age);

    }
}
