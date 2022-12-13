package org.hw_12_07;

//Создать список из экземплянов класса Cat. С помощью стримов:
//• вывести список голодных кошек старше 2 лет
//• вывести список черных кошек с именем, начинающимся на Т
//•  вывести список имен кошек возраста 1 год

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2Cat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Aaaaaa", 1, "Blue", true, "Owner One");
        Cat cat2 = new Cat("Bbbbbb", 4, "Grey", false, "Owner One");
        Cat cat3 = new Cat("Cccccc", 6, "Blue", true, "Owner One");
        Cat cat4 = new Cat("Dddddd", 7, "Red", false, "Owner One");
        Cat cat5 = new Cat("Eeeeee", 2, "Blue", true, "Owner One");
        Cat cat6 = new Cat("Ffffff", 1, "Grey", false, "Owner One");
        Cat cat7 = new Cat("Tttttt", 9, "Blue", true, "Owner One");
        Cat cat8 = new Cat("Ttaaat", 1, "Black", false, "Owner One");

        List<Cat> listCats = new ArrayList<>();
        listCats.add(cat1);
        listCats.add(cat2);
        listCats.add(cat3);
        listCats.add(cat4);
        listCats.add(cat5);
        listCats.add(cat6);
        listCats.add(cat7);
        listCats.add(cat8);

        //• вывести список голодных кошек старше 2 лет

        List<Cat> list1 =
                listCats.stream()
                        .filter(cat -> cat.getAge() > 2 && cat.isHungry())
                        .collect(Collectors.toList());

        System.out.println(list1);

        //• вывести список черных кошек с именем, начинающимся на Т
        List<Cat> list2 =
                listCats.stream()
                        .filter(cat -> cat.getName().startsWith("T") && "Black".equals(cat.getColour()))
                        .collect(Collectors.toList());

        System.out.println(list2);

        //•  вывести список имен кошек возраста 1 год
        List<String> list3 =
                listCats.stream()
                        .filter(cat -> cat.getAge() == 1)
                        .map(cat -> cat.getName())
                        .collect(Collectors.toList());

        System.out.println(list3);

        Map<String, Set<String>> setMap = listCats.stream().collect(Collectors.groupingBy(Cat::getColour,
                Collectors.mapping(Cat::getName,
                        Collectors.toSet())));

        Map<String, Long> longMap = listCats.stream().collect(Collectors.groupingBy(Cat::getColour,
                Collectors.counting()));


        System.out.println(setMap);
        System.out.println(longMap);


    }
}
