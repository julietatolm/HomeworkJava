package org.hw10_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Homework {
    public static void main(String[] args) {
//    First level: 1. создать лист, наполнить его 10М> елементами
        List<Integer> list = new ArrayList<>();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        System.out.println("Time to fill: " + (System.currentTimeMillis() - time));

        System.out.println("----------------");

//    внутри тела кладем i- тый элемент в переменную temp
//    перебрать for-each loop
        time = System.currentTimeMillis();
        for (Integer i : list) {
            int temp = i;
        }
        System.out.println("Time for-each loop: " + (System.currentTimeMillis() - time));
        System.out.println("----------------");
//    classic for и вызываем list.size() для каждой итерации

        time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        System.out.println("Time for classic + list.size() in for loop: " + (System.currentTimeMillis() - time));
        System.out.println("----------------");
//    classic for, но list.size() определяем в переменную
        int size = list.size();
        time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        System.out.println("Time for classic + list.size() in variable: " + (System.currentTimeMillis() - time));
        System.out.println("----------------");
//    classic for, list.size() определяем в переменную, перебираем с конца (i--)
        time = System.currentTimeMillis();
        for (int i = list.size()-1; i >= 0; i--) {
            int temp = list.get(i);
        }
        System.out.println("Time for classic + list.size() in variable + start from the end: " + (System.currentTimeMillis() - time));
        System.out.println("----------------");
//    используя Itertor
        Iterator<Integer> itr = list.iterator();
        time = System.currentTimeMillis();
        while(itr.hasNext()) {
            Integer temp = itr.next();
        }
        System.out.println("Time for iterator: " + (System.currentTimeMillis() - time));
        System.out.println("----------------");

//    используя ListIterator
        ListIterator<Integer> listIterator = list.listIterator();
        time = System.currentTimeMillis();
        while(listIterator.hasNext()) {
            Integer temp = listIterator.next();
        }
        System.out.println("Time for List iterator: " + (System.currentTimeMillis() - time));
        System.out.println("----------------");
    }

//    для всех случаев сделать замер времени
//    результат вывести в консоль

}
