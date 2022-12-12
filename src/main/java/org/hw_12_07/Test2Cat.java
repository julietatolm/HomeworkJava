package org.hw_12_07;

//Создать список из экземплянов класса Cat. С помощью стримов:
//• вывести список голодных кошек старше 2 лет
//• вывести список черных кошек с именем, начинающимся на Т
//•  вывести список имен кошек возраста 1 год

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2Cat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Aaaaaa", 1, "Blue", true);
        Cat cat2 = new Cat("Bbbbbb", 4, "Grey", false);
        Cat cat3 = new Cat("Cccccc", 6, "Blue", true);
        Cat cat4 = new Cat("Dddddd", 7, "Red", false);
        Cat cat5 = new Cat("Eeeeee", 2, "Blue", true);
        Cat cat6 = new Cat("Ffffff", 1, "Grey", false);
        Cat cat7 = new Cat("Tttttt", 9, "Blue", true);
        Cat cat8 = new Cat("Ttaaat", 1, "Black", false);

        List<Cat> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        list.add(cat4);
        list.add(cat5);
        list.add(cat6);
        list.add(cat7);
        list.add(cat8);

        //• вывести список голодных кошек старше 2 лет

        List<Cat> list1 =
                list.stream()
                        .filter(cat -> cat.getAge() > 2 && cat.isHungry())
                        .collect(Collectors.toList());

        System.out.println(list1);

        //• вывести список черных кошек с именем, начинающимся на Т
        List<Cat> list2 =
                list.stream()
                        .filter(cat -> cat.getName().startsWith("T") && "Black".equals(cat.getColour()))
                        .collect(Collectors.toList());

        System.out.println(list2);

        //•  вывести список имен кошек возраста 1 год
        List<String> list3 =
                list.stream()
                        .filter(cat -> cat.getAge() == 1)
                        .map(cat -> cat.getName())
                        .collect(Collectors.toList());

        System.out.println(list3);


    }
}
