package org.hw_11_14;


public class Main {
    public static void main(String[] args) {
        String[] array = {"asc", "nkb", "sjc", "ljbc", "6twe", "iyw", "www"};

        ArrayIterator arrayIterator = new ArrayIterator(array);

        while(arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
