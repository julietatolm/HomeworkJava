package org.hw_11_14;

import java.util.Iterator;

public class ArrayIterator implements Iterator{

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    String[] array;
    int index = 0;

    @Override
    public boolean hasNext() {
        return array.length > index;
    }

    @Override
    public Object next() {
        String temp = array[index];
        index++;
        return temp;
    }
}
