package org.hw08_22;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "Musia");
        Cat cat2 = new Cat(2, "Vasilka", 2);
        Cat cat3 = new Cat(3, "Ora", "Mix", 3);

        Dog dog1 = new Dog(1, "Sharik");
        Dog dog2 = new Dog(2, "Oscar", 5);
        Dog dog3 = new Dog(3, "Gary", "Mix", 10);

        Pig pig1 = new Pig(1, "Uno");
        Pig pig2 = new Pig(2, "Dos", 5);
        Pig pig3 = new Pig(3, "Tres", "Mix", 5);

        cat1.say();
        dog1.say();
        pig1.say();

        cat3.printObject();
        dog3.printObject();
        pig3.printObject();


    }
}
