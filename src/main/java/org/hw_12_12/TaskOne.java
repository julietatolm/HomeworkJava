package org.hw_12_12;

//First level: 1) Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
// С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.


//2) В класс Cat добавить поле String catOwner
//сформировать и вывести Map из списка имен хозяев с числом их кошек
//сформировать и вывести Map из списка имен хозяев со списком имен их кошек


//3)StringBuilder: напишите метод, который принимает две строки в аргументах, соединяет их и определяет реверсивный порядок, выведите результат на консоль.
//4)StringBuilder: дан массив символов, обьедините его и замените символ '?' на правильный символ, выведите результат на консоль.
//char[] arr = {'S', 't', 'r', 'i', '?', 'g', ' ', 'i', 's', ' ', 'i', 'm', 'm', 'u', 't', 'a', 'b', 'l', 'e'};

import org.hw_12_07.Cat;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;

public class TaskOne {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");

//       1. С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
        String str = stringList.stream().map(s -> s.charAt(0) + ".").reduce((s1, s2) -> s1 + s2).get();

        System.out.println(str);
//        2) В класс Cat добавить поле String catOwner
        List<Cat> catsList = getListOfCats();

//         сформировать и вывести Map из списка имен хозяев с числом их кошек
        Map<String, Long> mapNameCount = catsList.stream().collect(Collectors.groupingBy(
                cat -> cat.getCatOwner(),
                Collectors.counting()
        ));

        mapNameCount.entrySet().forEach(System.out::println);

//         сформировать и вывести Map из списка имен хозяев со списком имен их кошек
        Map<String, String> mapOwnerNameCatNames = catsList.stream().collect(Collectors.groupingBy(
                Cat::getCatOwner, mapping(Cat::getName, joining(","))));

        mapOwnerNameCatNames.entrySet().forEach(System.out::println);


        //3)StringBuilder: напишите метод, который принимает две строки в аргументах,
        // соединяет их и определяет реверсивный порядок, выведите результат на консоль.
        System.out.println(joinAndTurn("ABCD", "dcba"));

        //4)StringBuilder: дан массив символов, обьедините его и замените символ '?'
        // на правильный символ, выведите результат на консоль.
        char[] arr = {'S', 't', 'r', 'i', '?', 'g', ' ', 'i', 's', ' ', 'i', 'm', 'm', 'u', 't', 'a', 'b', 'l', 'e'};
        System.out.println(mergeChars(arr));

    }

    private static String mergeChars(char[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arr).replace(stringBuilder.indexOf("?"), stringBuilder.indexOf("?")+1,"n");
        return stringBuilder.toString();
    }

    private static String joinAndTurn(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder(a);
        return stringBuilder.append(b).reverse().toString();
    }


    private static List<Cat> getListOfCats() {
        List<Cat> listCats = new ArrayList<>();
        Cat cat1 = new Cat("Aaaaaa", 1, "Blue", true, "Owner One");
        Cat cat2 = new Cat("Bbbbbb", 4, "Grey", false, "Owner Two");
        Cat cat3 = new Cat("Cccccc", 6, "Blue", true, "Owner Three");
        Cat cat4 = new Cat("Dddddd", 7, "Red", false, "Owner Five");
        Cat cat5 = new Cat("Eeeeee", 2, "Blue", true, "Owner Two");
        Cat cat6 = new Cat("Ffffff", 1, "Grey", false, "Owner Two");
        Cat cat7 = new Cat("Tttttt", 9, "Blue", true, "Owner One");
        Cat cat8 = new Cat("Ttaaat", 1, "Black", false, "Owner Four");

        listCats.add(cat1);
        listCats.add(cat2);
        listCats.add(cat3);
        listCats.add(cat4);
        listCats.add(cat5);
        listCats.add(cat6);
        listCats.add(cat7);
        listCats.add(cat8);
        return listCats;
    }
}
