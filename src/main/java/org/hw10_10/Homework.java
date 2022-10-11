package org.hw10_10;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> arrListReturn = new ArrayList<>();
        arrList.add(5);
        arrList.add(7);
        arrList.add(20);
        arrList.add(1);

//    таск 1 - у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
        pattern1(arrList, arrListReturn);

//    таск 2 - у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String

        List<String> arrListStr = new ArrayList<>();
        arrListStr.add("aaa");
        arrListStr.add("bb");

        List<Integer> arrListStrResult = new ArrayList<>();
        pattern1Task2(arrListStr, arrListStrResult);


        //    Паттерн 3
//    таск 1 - у вас есть список значений int и вы должны вернуть их максимум или минимум
        System.out.println(returnMax(arrList));

//    таск 2 - у вас есть список String и вы должны вернуть общую длину строк
        System.out.println(returnSumOfLengths(arrListStr));
        }

    private static void pattern1(List<Integer> arrList, List<Integer> result) {
        for (Integer i : arrList) {
            result.add(i * 2);
        }
    }

    private static void pattern1Task2(List<String> arrList, List<Integer> result) {
        for (String str : arrList) {
            result.add(str.length());
        }
    }

    private static int returnMax(List<Integer> arrList) {
        int a = arrList.get(0);
        for (Integer i : arrList) {
            if (i >= a) {
                a = i;
            }
        } return a;
    }

    private static int returnSumOfLengths(List<String> arrListStr) {
        int result = 0;
        for (String str : arrListStr) {
            result = result + str.length();
        }
        
        return result;
    }

}
