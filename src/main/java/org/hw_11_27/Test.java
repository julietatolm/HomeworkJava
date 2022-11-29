package org.hw_11_27;

// Написать метод, который получает на вход запрос с двумя полями (строкой и числом)
// и возвращает отформатированную строку с переданными данными. реализовать через лямбда ф-цию.

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        String str = "123";
        int number = 456;

        String result = formatStr(str, number);
        System.out.println(result);
    }

    private static String formatStr(String str, int number) {
        BiFunction<String, Integer, String> biFunction = (String s, Integer i) -> s+i;

        return biFunction.apply(str, number);
    }
}






