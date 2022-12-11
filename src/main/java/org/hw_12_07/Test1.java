package org.hw_12_07;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Test1 {

    //First level: 1. Создать Supplier, который генерирует случайные значения типа
//        Integer
     Integer supplier() {
        Random random = new Random();
        return random.nextInt();
    }

    //        2. Создать BiFunction, которая возводит первый аргимент типа int в степень
//        второго аргумента типа int
    int buFunction(int a, int b) {
        return (int) Math.pow(a, b);
    }

    //        3. Отсортировать с помощью стримов список из строк
//        • по алфавиту
//        • в ооратном порядке
    List<String> sortStringAlph(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    List<String> sortStringAlphReverse(List<String> list) {
        return list.stream().sorted( (s1,s2) -> s2.compareTo(s1)).collect(Collectors.toList());
    }

    //2. Из списка чисел типа Integer с помощью стримов создать список их
//строковых представлений
    static List<String> transformIntegerToString(List<Integer> list) {
        return list.stream().map(s -> s.toString()).collect(Collectors.toList());
    }
}
