package org.hw_11_27;

//First level: Напишите программу,  принимающую список, содержащий текст и
// подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.
//Словом будем считать любую непрерывную последовательность символов, состоящую
// только из букв и цифр. Например, в строке "Мама мыла раму 33 раза!" ровно пять слов:
// "Мама", "мыла", "раму", "33" и "раза".
//Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" —
// это одно и то же слово. Выводите слова в нижнем регистре.

//Если в тексте меньше 10 уникальных слов, то выводите сколько есть.

//Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно
// упорядочить только по частоте, то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.

//решение реализовать с помощью лямбда ф-ций.


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        String text1 = "Мама мыла-мыла-мыла раму!";
        String text2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at " +
                "faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

        findTenMostFrequentWords(text1);
        System.out.println("--------");
        findTenMostFrequentWords(text2);

    }

    static void findTenMostFrequentWords(String text) {

        Map<String, Integer> wordsList =
                Stream.of(text.split("[-., !?]"))
                        .map(String::toLowerCase)
                        .filter(s -> !s.equals(""))
                        .collect(Collectors
                                .toMap((String x) -> x, (String x) -> 1, (y1, y2) -> y1 + y2));


        List<Map.Entry<String, Integer>> res =
                wordsList.entrySet().stream()
                        .sorted((o1, o2) -> {
                            if (o1.getValue().equals(o2.getValue())) {
                                return o1.getKey().compareTo(o2.getKey());
                            }
                            return o2.getValue() - o1.getValue();
                        })
                        .limit(10)
                        .collect(Collectors.toList());

        res.forEach(System.out::println);


    }

}


